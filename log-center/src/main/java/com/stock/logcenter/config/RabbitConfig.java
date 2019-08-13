package com.stock.logcenter.config;

import com.stock.logcenter.rabbit.Receiver;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.MessageListener;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class RabbitConfig {
    //新的消息队列按如下方式进行创建、绑定、监听、处理
    public final static String queueName = "spring-boot";
    public final static String queueNamePrepro = "spring-boot-preprocess";

    @Bean
    Queue queue() {
        return new Queue(queueName, false);
    }

    @Bean
    Queue queuePrepro() {
        return new Queue(queueNamePrepro, false);
    }

    @Bean
    TopicExchange exchange() {
        return new TopicExchange("spring-boot-exchange");
    }

    @Bean
    TopicExchange exchangePrepro() {
        return new TopicExchange("spring-boot-exchange-preprocess");
    }

    @Bean
    Binding binding(Queue queue, TopicExchange exchange) {
        return BindingBuilder.bind(queue).to(exchange).with(queueName);
    }

    @Bean
    Binding bindingPrepro(Queue queuePrepro, TopicExchange exchangePrepro) {
        return BindingBuilder.bind(queuePrepro).to(exchangePrepro).with(queueNamePrepro);
    }

    @Bean
    SimpleMessageListenerContainer container(ConnectionFactory connectionFactory, Receiver receiver) {
        SimpleMessageListenerContainer container = new SimpleMessageListenerContainer();
        container.setConnectionFactory(connectionFactory);
        //新的服务监听将对应的队列名加入setQueueNames方法
        container.setQueueNames(queueName, queueNamePrepro);
        //新的服务处理将对应的队列处理方法加入下方处理中
        container.setMessageListener((MessageListener) message -> {
            if (queueName.equals(message.getMessageProperties().getConsumerQueue())) {
                receiver.receiveMessage(new String(message.getBody()));
            } else if (queueNamePrepro.equals(message.getMessageProperties().getConsumerQueue())) {
                receiver.receivePreMessage(new String(message.getBody()));
            }
        });
        return container;
    }
}
