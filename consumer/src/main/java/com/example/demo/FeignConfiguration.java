package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: nacostest
 * @description: description
 * @author: lw
 * @create: 2020-12-24 14:34
 **/
@Configuration
public class FeignConfiguration {

    @Bean
    public FeignServiceFallBack feignServiceFallBack() {
        return new FeignServiceFallBack();
    }

}
