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
@FeignClient("service-provider")
@RequestMapping("/provider")
public interface FeignService {
    @GetMapping("/info/{id}")
    Map<String, String> getInfo(@PathVariable("id") String id);
}
