package com.alex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * eureka 服务提供
 * <p>
 *
 * @author ： minwei
 * @version ：1.0.0
 * @date ：2020-1-2
 */
@SpringBootApplication
//开启服务发现
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.alex.**.feignClient"})
//开启feign远程调用
@EnableDiscoveryClient
public class EurekaServerConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerConsumerApplication.class, args);
	}


}
