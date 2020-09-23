/*
 * 深圳市灵智数科有限公司版权所有.
 */
package com.alex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

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

    @GetMapping("/consumer/remote")
    public String consumerService(){
       return restTemplate.getForEntity("http://eureka-provider/serviceProducer",String.class).getBody();
    }




}
