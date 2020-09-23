/*
 * 深圳市灵智数科有限公司版权所有.
 */
package com.alex.controller;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * 为了验证通过feign调用，如果通过RestTemplate调用远程服务的配置类
 * <p>
 *
 * @author ： minwei
 * @version ：1.0.0
 * @date ：2020-9-23
 */
@Component
public class RestTemplateConfig {

    @Bean
    @LoadBalanced
//开启负载均衡
    RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
