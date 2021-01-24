/*
 * 深圳市灵智数科有限公司版权所有.
 */
package com.alex.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

/**
 * 类说明
 * <p>
 *
 * @author minwei
 * @version 1.0.0
 * @date 2021/1/24
 */
@Service
public class OrderService {

    @Autowired
    private ApplicationContext context;

    public void publishOrder() {
        OrderEvent orderEvent = OrderEvent.builder().msg("建立订单").build();
        context.publishEvent(orderEvent);
    }

}
