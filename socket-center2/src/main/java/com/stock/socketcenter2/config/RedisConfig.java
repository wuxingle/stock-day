package com.stock.socketcenter2.config;


import com.stock.apicommon.utils.RedisConverter;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.cache.RedisCacheWriter;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializationContext;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import java.lang.reflect.Method;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;


@Configuration
@EnableCaching
public class RedisConfig  extends CachingConfigurerSupport {
	   
	   private static final  Long DEFAULT_EXPIRATION_TIME = 600L;
	   
	   
	    @Bean
	    public KeyGenerator keyGenerator() {
	        return new KeyGenerator() {
	            @Override
	            public Object generate(Object target, Method method, Object... params) {
	                StringBuilder sb = new StringBuilder();
	                sb.append(target.getClass().getName());
	                sb.append(method.getName());
	                for (Object obj : params) {
	                    sb.append(obj.toString());
	                }
	                return sb.toString();
	            }
	        };
	    }
	   
	    @Bean
	    public CacheManager cacheManager(RedisConnectionFactory redisConnectionFactory) {
	       return new RedisCacheManager(
	             RedisCacheWriter.nonLockingRedisCacheWriter(redisConnectionFactory),
	             // 默认策略，@Cacheable未配置的 key 会使用这个，默认过期时间
	             this.getRedisCacheConfigurationWithTtl(DEFAULT_EXPIRATION_TIME),
	             // @Cacheable 指定 key 策略
	             this.getRedisCacheConfigurationMap()
	       );
	    }
	    
	    private Map<String, RedisCacheConfiguration> getRedisCacheConfigurationMap() {
	        Map<String, RedisCacheConfiguration> redisCacheConfigurationMap = new HashMap<>();
	        redisCacheConfigurationMap.put("testRedisCache", this.getRedisCacheConfigurationWithTtl(3000L));
	        redisCacheConfigurationMap.put("UserInfoListAnother", this.getRedisCacheConfigurationWithTtl(18000L));
	        return redisCacheConfigurationMap;
	    }

	    private RedisCacheConfiguration getRedisCacheConfigurationWithTtl(Long seconds) {
	        // 设置CacheManager的值序列化方式为JdkSerializationRedisSerializer,
	        // 但其实RedisCacheConfiguration默认就是使用StringRedisSerializer序列化key，JdkSerializationRedisSerializer序列化value
	        ClassLoader loader = this.getClass().getClassLoader();
	        JdkSerializationRedisSerializer jdkSerializer = new JdkSerializationRedisSerializer(loader);
	        RedisSerializationContext.SerializationPair<Object> pair = RedisSerializationContext.SerializationPair.fromSerializer(jdkSerializer);

	        RedisCacheConfiguration redisCacheConfiguration = RedisCacheConfiguration.defaultCacheConfig();
	        redisCacheConfiguration = redisCacheConfiguration.serializeValuesWith(pair).entryTtl(Duration.ofSeconds(seconds));
	        return redisCacheConfiguration;
	     }
	     
	  
//	    //通过Spring提供的RedisCacheConfiguration类，构造一个自己的redis配置类，从该配置类中可以设置一些初始化的缓存命名空间、及对应的默认过期时间等属性，再利用RedisCacheManager中的builder.build()的方式生成cacheManager
//	    @Bean
//	    public CacheManager cacheManager(RedisConnectionFactory factory) {
//	        RedisCacheConfiguration config = RedisCacheConfiguration.defaultCacheConfig();  // 生成一个默认配置，通过config对象即可对缓存进行自定义配置
//	        config = config.entryTtl(Duration.ofHours(1))     // 设置缓存的默认过期时间，也是使用Duration设置
//	                .disableCachingNullValues();     // 不缓存空值
//
//	        // 设置一个初始化的缓存空间set集合
//	        Set<String> cacheNames =  new HashSet<>();
//	        cacheNames.add("my-redis-cache1");
//	        cacheNames.add("my-redis-cache2");
//
//	        // 对每个缓存空间应用不同的配置
//	        Map<String, RedisCacheConfiguration> configMap = new HashMap<>();
//	        configMap.put("my-redis-cache1", config);
//	        configMap.put("my-redis-cache2", config.entryTtl(Duration.ofSeconds(120)));
//
//	        RedisCacheManager cacheManager = RedisCacheManager.builder(factory)     // 使用自定义的缓存配置初始化一个cacheManager
//	                .initialCacheNames(cacheNames)  // 注意这两句的调用顺序，一定要先调用该方法设置初始化的缓存名，再初始化相关的配置
//	                .withInitialCacheConfigurations(configMap)
//	                .build();
//	        return cacheManager;
//	    }

	@Bean
	public RedisTemplate<String, Object> redisTemplate(RedisConnectionFactory redisConnectionFactory) {
		RedisTemplate<String, Object> redisTemplate = new RedisTemplate<>();
		redisTemplate.setConnectionFactory(redisConnectionFactory);
		redisTemplate.setKeySerializer(new StringRedisSerializer());//设置key的序列化器
		redisTemplate.setValueSerializer(new RedisConverter());//设置值的序列化器
		return redisTemplate;
	}
	    
}
