/*
 * 深圳市灵智数科有限公司版权所有.
 */
package com.alex.controller;

import com.alex.feignClient.ConsumerClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * 类说明
 * <p>
 *
 * @author ： minwei
 * @version ：1.0.0
 * @date ：2020-9-23
 */
@RestController
public class FeignController {

    @Autowired
    private ConsumerClient consumerClient;

    @GetMapping("/consumer/feign")
    public Map serviceFeign(){
        return consumerClient.serviceProducer();
    }

}
