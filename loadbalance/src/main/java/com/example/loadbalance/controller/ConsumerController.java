package com.example.loadbalance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.util.concurrent.ExecutionException;

@RestController
public class ConsumerController {
    //注入负载均衡客户端

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @RequestMapping("/consumer")
    public String helloConsumer() throws ExecutionException, InterruptedException {
        //这里是根据配置文件的那个providers属性取的
        ServiceInstance serviceInstance = loadBalancerClient.choose("providers");
        //负载均衡算法默认是轮询，轮询取得服务
        URI uri = URI.create(String.format("http://%s:%s", serviceInstance.getHost(), serviceInstance.getPort()));
        return uri.toString();
    }
}
