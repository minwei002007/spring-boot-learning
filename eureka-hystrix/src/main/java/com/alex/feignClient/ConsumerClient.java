package com.alex.feignClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

/**
 * 类说明
 * <p>
 *
 * @author ： minwei
 * @version ：1.0.0
 * @date ：2020-9-23
 */
@FeignClient(name = "eureka-provider")
public interface ConsumerClient {

    @GetMapping("/serviceProducer")
    Map serviceProducer();
}
