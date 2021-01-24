package com.alex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Spring Cloud Hystrix为SOA和微服务架构提供一整套服务隔离，服务熔断和服务降级的解决方案。
 * 它是熔断器的一种实现，主要应用于微服务架构的高可用，防止出现服务雪崩等问题。
 *  如果上游系统某个服务出现故障，则导致下游服务也出现服务异常。此时如果上游系统没有很好的请求
 *  拒绝策略，则会导致请求不断增加，大量的请求积压不但会导致当前服务宕机，还可以导致下游服务宕机，继而
 *  引起雪崩效应。
 *
 * <p>
 *
 * @author ： minwei
 * @version ：1.0.0
 * @date ：2020-9-27
 */
@SpringBootApplication
//开启服务发现
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.alex.**.feignClient"})
//开启feign远程调用
@EnableDiscoveryClient
@EnableHystrix
@EnableHystrixDashboard
public class HystrixServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HystrixServerApplication.class, args);
	}


}
