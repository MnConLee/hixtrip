package com.hixtrip.sample.app.api;

import com.hixtrip.sample.client.order.dto.CommandOderCreateDTO;

/**
 * 订单的service层
 */
public interface OrderService {
    String placeOrder(CommandOderCreateDTO commandOderCreateDTO);

}
