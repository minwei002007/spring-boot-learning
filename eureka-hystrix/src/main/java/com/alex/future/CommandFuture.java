/*
 * 深圳市灵智数科有限公司版权所有.
 */
package com.alex.future;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import com.netflix.hystrix.HystrixCommandKey;
import com.netflix.hystrix.HystrixThreadPoolKey;
import org.springframework.web.client.RestTemplate;

/**
 * 类说明
 * <p>
 *
 * @author ： minwei
 * @version ：1.0.0
 * @date ：2020-9-27
 */
public class CommandFuture extends HystrixCommand<String> {

    private String name;
    private RestTemplate restTemplate;

    public CommandFuture(String name, RestTemplate restTemplate){
        super(Setter.withGroupKey(HystrixCommandGroupKey.Factory.asKey("ExampleGroup"))
        .andCommandKey(HystrixCommandKey.Factory.asKey("HelloWord"))
        .andThreadPoolKey(HystrixThreadPoolKey.Factory.asKey("HelloWord Pool")));
        this.name = name;
        this.restTemplate = restTemplate;
    }




    @Override
    protected String run() throws Exception {
        return restTemplate.getForEntity("http://eureka-provider/serviceProducer",String.class).getBody();
    }

    @Override
    protected String getFallback(){
        return System.currentTimeMillis()+"  hystrix: 远程服务调用异常";
    }

}
