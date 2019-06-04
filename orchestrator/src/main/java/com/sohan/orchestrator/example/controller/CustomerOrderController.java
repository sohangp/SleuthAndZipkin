package com.sohan.orchestrator.example.controller;

import com.sohan.orchestrator.example.dto.CustomerOrderDTO;
import com.sohan.orchestrator.example.service.CustomerOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * This spring controller handles all the API calls made on the end point.
 * <p>
 * - /customer-orders/{orderId}: Gets the Customer and Orders Details for the given OrderId.
 * <p/>
 *
 * @author Sohan
 */
@RestController
public class CustomerOrderController {

    /**
     * Handle to the service.
     */
    @Autowired
    private CustomerOrderService customerOrderService;

    /**
     * Gets the Customer and Orders Details for the given OrderId.
     *
     * @param orderId
     * @return CustomerOrderDTO
     */
    @RequestMapping(value = "/customer-orders/{orderId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CustomerOrderDTO getCustomerOrder(@PathVariable Integer orderId) throws Exception {
        return customerOrderService.getCustomerOrder(orderId);
    }
}
