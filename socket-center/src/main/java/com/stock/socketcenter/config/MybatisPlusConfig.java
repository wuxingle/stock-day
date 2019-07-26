package com.stock.socketcenter.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;

@Configuration
public class MybatisPlusConfig {

  @Bean
  public PaginationInterceptor paginationInterceptor(){
    PaginationInterceptor page = new PaginationInterceptor();
    page.setDialectType("mysql");
    return page;
  }

  @Bean
  public MetaObjectHandler metaObjectHandler() {
    return new MetaObjectHandler() {
      @Override
      public void insertFill(MetaObject metaObject) {
        LocalDateTime current = LocalDateTime.now();
        this.setFieldValByName("createDate", current, metaObject);
        this.setFieldValByName("updateDate", current, metaObject);
        this.setFieldValByName("createUser", "system", metaObject);
        this.setFieldValByName("updateUser", "system", metaObject);
      }

      @Override
      public void updateFill(MetaObject metaObject) {
        LocalDateTime current = LocalDateTime.now();
        this.setFieldValByName("updateDate", current, metaObject);
        this.setFieldValByName("updateUser", "system", metaObject);
      }
    };
  }

}
