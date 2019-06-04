package com.sohan.order.service.controller;

import com.sohan.order.service.dto.OrderDTO;
import com.sohan.order.service.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * This spring controller handles all the API calls made on the end point.
 * <p>
 * - /orders/{orderId}: Gets the Order Details for the given OrderId.
 * <p/>
 *
 * @author Sohan
 */
@RestController
public class OrderController {

    /**
     * Handle to the service.
     */
    @Autowired
    private OrderService orderService;

    /**
     * Gets the Order Details for the given orderId.
     *
     * @param orderId
     * @return OrderDTO
     */
    @RequestMapping(value = "/orders/{orderId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public OrderDTO getOrder(@PathVariable Integer orderId) throws Exception {
        return orderService.getOrder(orderId);
    }
}
