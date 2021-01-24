/*
 * 深圳市灵智数科有限公司版权所有.
 */
package com.alex.controller;

import com.alex.future.CommandFuture;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.Future;

/**
 * 服务提供
 * <p>
 *
 * @author ： minwei
 * @version ：1.0.0
 * @date ：2020-9-23
 */
@RestController
public class RestTemplateController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/service/hystrix")
    @HystrixCommand(fallbackMethod = "exceptionHandler")
    public String serviceHysrix(){
       return restTemplate.getForEntity("http://eureka-provider/serviceProducer",String.class).getBody();
    }

    public String exceptionHandler(){
        return  System.currentTimeMillis()+"hystrix, 提供者服务挂了";
    }

    @GetMapping("/service/hystrix/future")
    public String serviceHystirxFuture()throws Exception{
        //定义了一个异步服务请求
        Future<String> future = new CommandFuture("future", restTemplate).queue();
        return future.get();
    }




}
