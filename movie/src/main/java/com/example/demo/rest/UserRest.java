package com.example.demo.rest;

import com.example.demo.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author zhongxiancai
 * @Description
 * @Date: Created in 2019/3/25 17:47.
 * @Modified By:
 */
@RestController
public class UserRest {
    @Autowired private RestTemplate restTemplate;
    @GetMapping("/user/{id}")
    public User findById(@PathVariable String id){

        return restTemplate.getForObject("http://localhost:8001/"+id,User.class);
    }
}
