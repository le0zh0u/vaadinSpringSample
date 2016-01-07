package com.leo.sample.service.impl;

import com.leo.sample.service.HelloWorldService;
import org.springframework.stereotype.Service;

/**
 * Created by zhouchunjie on 16/1/7.
 */
@Service
public class HelloWorldServiceImpl implements HelloWorldService {

    @Override
    public String getHelloWorld() {
        return "Hello World,Sir!";
    }
}
