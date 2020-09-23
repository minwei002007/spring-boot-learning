package com.alex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * eureka 服务提供
 * <p>
 *
 * @author ： minwei
 * @version ：1.0.0
 * @date ：2020-1-2
 */
@SpringBootApplication
@EnableEurekaClient
public class EurekaServerProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerProviderApplication.class, args);
	}

}
