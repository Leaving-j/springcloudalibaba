package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: nacostest
 * @description: description
 * @author: lw
 * @create: 2020-12-18 14:21
 **/
@RestController
@RequestMapping("/provider")
public class ProviderController {

    @GetMapping("/info/{id}")
    public Map<String, String> getInfo(@PathVariable("id") String id) {
        System.out.println("---- 接收参数id：" + id);
        Map<String, String> resultMap = new HashMap<>();
        resultMap.put("code", "0");
        resultMap.put("desc", "响应成功");
        return resultMap;
    }
}
