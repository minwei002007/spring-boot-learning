package com.alex;

import com.alex.listener.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class EurekaServerApplicationTests {

	@Autowired
	OrderService orderService;

	@Test
	public void listenerOrder() {
		orderService.publishOrder();
	}
}
