package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: nacostest
 * @description: description
 * @author: lw
 * @create: 2020-12-18 14:21
 **/
@RestController
@RequestMapping("/consumer")
public class ConsumerController {


    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private FeignService feignService;

    @GetMapping("/rest/{id}")
    public Map<String, String> getInfo(@PathVariable("id") String id) {
        Map result = restTemplate.getForObject("http://service-provider/provider/info/" + id, Map.class);
        return result;
    }

    @GetMapping("/feign/{id}")
    public Map<String, String> feign(@PathVariable("id") String id) {
        return feignService.getInfo(id);
    }
}
