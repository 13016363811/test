package com.zxc2.rest;

import com.zxc2.po.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zhongxiancai
 * @Description
 * @Date: Created in 2019/3/25 14:54.
 * @Modified By:
 */
@RestController
public class UserRest {
    @GetMapping("/{id}")
    public User findById(@PathVariable String id){
        return null;
    }
}
