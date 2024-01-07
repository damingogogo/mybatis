package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import java.nio.charset.Charset;
import java.util.List;

@Configuration
@Component
public class MyWebConfig extends WebMvcConfigurationSupport {
    @Bean
    public HttpMessageConverter responseBodyConverter(){
        //解决返回值中文乱码
        StringHttpMessageConverter converter = new StringHttpMessageConverter(Charset.forName("UTF-8"));
        return converter;
    }

//    @Override
//    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
//        converters.add(responseBodyConverter());
//    }
//
    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        converters.add(responseBodyConverter());
        //加载默认的数据转换器至转换器列表中
        super.addDefaultHttpMessageConverters(converters);
    }

}
