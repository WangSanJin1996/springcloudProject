package com.test.Feign.impl;

import com.test.Feign.FeignProviderClient;
import com.test.entity.Student;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * @author wx
 * @date 2020/10/15 10:43
 */
@Component
public class FeignError implements FeignProviderClient {

    public Collection<Student> findAll() {
        return null;
    }

    public String index() {
        return "服务器维护中.......";
    }
}
