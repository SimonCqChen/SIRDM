package com.example.loadbalance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.concurrent.ExecutionException;

@RestController
public class ConsumerController {
    //注入负载均衡客户端

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/consumer")
    public String helloConsumer() throws ExecutionException, InterruptedException {

        return restTemplate.getForEntity("http://IDENTIFICATION/hello", String.class).getBody();
    }
}
