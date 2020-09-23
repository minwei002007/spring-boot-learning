/*
 * 深圳市灵智数科有限公司版权所有.
 */
package com.alex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

/**
 * 服务提供
 * <p>
 *
 * @author ： minwei
 * @version ：1.0.0
 * @date ：2020-9-23
 */
@RestController
public class DiscoveryController {

    @Autowired
    private DiscoveryClient discoveryClient;
    @Value("${server.port}")
    private String port;

    @GetMapping("/serviceProducer")
    public Map serviceProducer(){
        //服务提供者信息
        String services = "Services："+discoveryClient.getServices()+" port : "+ port;
        //服务提供者返回数据
        Map  result = new HashMap<>(2);
        result.put("ServiceProducer", services);
        result.put("time", LocalDateTime.now());
        return result;
    }




}
