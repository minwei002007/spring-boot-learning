/*
 * 深圳市灵智数科有限公司版权所有.
 */
package com.alex.listener;


import lombok.Builder;
import lombok.Getter;

/**
 * 类说明
 * <p>
 *
 * @author minwei
 * @version 1.0.0
 * @date 2021/1/24
 */
@Getter
@Builder(toBuilder = true)
public class OrderEvent {
    private String msg;
}
