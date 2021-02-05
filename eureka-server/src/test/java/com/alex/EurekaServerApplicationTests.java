package com.alex;

import com.alex.listener.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;

@SpringBootTest
@RunWith(SpringRunner.class)
public class EurekaServerApplicationTests {

	@Autowired
	OrderService orderService;

	@Test
	public void listenerOrder() {
		orderService.publishOrder();

	}

	public void contextLoads() {
		HashMap<String, Object> hashMap = new HashMap<>(1);
		hashMap.put("1","这是第一个");
		hashMap.put("2","这是第二个");
		hashMap.forEach((k,v)->{
			System.out.println("key="+k + "\nvalue="+v);
		});
	}

}
