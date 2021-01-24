/*
 * 深圳市灵智数科有限公司版权所有.
 */
package com.alex.listener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * 类说明
 * <p>
 *
 * @author minwei
 * @version 1.0.0
 * @date 2021/1/24
 */
@Component
public class OrderEventListener {

    @EventListener(value = OrderEvent.class,condition = "#event.msg == '建立订单'")
    public void handleOrderEvent(OrderEvent event) {
        System.out.println("我监听到了handleOrderEvent发布的message为:" + event.getMsg());
    }
}
