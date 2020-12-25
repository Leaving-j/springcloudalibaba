package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: nacostest
 * @description: description
 * @author: lw
 * @create: 2020-12-24 14:33
 **/

public class FeignServiceFallBack implements FeignService {

    @Override
    public Map<String, String> getInfo(@PathVariable("id") String id) {
        Map<String, String> failMap = new HashMap<>();
        failMap.put("code", "5001");
        failMap.put("desc", "服务降级熔断");
        return failMap;
    }
}
