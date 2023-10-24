package com.forzlp.demo.controller;

import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author zlp
 * @date 2023/10/24 23:22
 */
@RestController
public class HelloController {
    @Resource
    private StringRedisTemplate stringRedisTemplate;
    @GetMapping("/hello")
    public String hello() {
        Long increment = stringRedisTemplate.opsForValue().increment("count:people");
        return "当前有["+ increment +"]人次访问这个网站";
    }
}
