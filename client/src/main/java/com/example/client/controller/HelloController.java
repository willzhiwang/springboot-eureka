package com.example.client.controller;

import com.netflix.appinfo.InstanceInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {
    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    private DiscoveryClient client;

    @Value("${server.port}")
    String port;

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public String index() {
        /*
　　　　StringBuffer uriList = new StringBuffer("Hello World " + port + " 端口为您服务！<br>");
　　　　return uriList.toString();
         */
        return port;
    }
}