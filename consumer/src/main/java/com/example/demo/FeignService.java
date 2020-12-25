package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * @program: nacostest
 * @description: FeignService
 * @author: lw
 * @create: 2020-12-23 14:31
 **/
@FeignClient(name = "service-provider", fallback = FeignServiceFallBack.class,configuration = FeignConfiguration.class)
public interface FeignService {
    @GetMapping("/provider/info/{id}")
    Map<String, String> getInfo(@PathVariable("id") String id);
}
