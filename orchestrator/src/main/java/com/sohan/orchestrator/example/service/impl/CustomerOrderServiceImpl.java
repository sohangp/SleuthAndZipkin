package com.sohan.orchestrator.example.service.impl;

import com.sohan.orchestrator.example.dto.CustomerDTO;
import com.sohan.orchestrator.example.dto.CustomerOrderDTO;
import com.sohan.orchestrator.example.service.CustomerOrderService;
import com.sohan.order.service.dto.OrderDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Service Implementation that fetches / acts on OrderDTO related data.
 *
 * @author Sohan
 */
@Service
public class CustomerOrderServiceImpl implements CustomerOrderService {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${order.service.url}")
    private String orderServiceURL;

    @Value("${customer.service.url}")
    private String customerServiceURL;

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerOrderServiceImpl.class);

    /**
     * Gets the Order Details for the given OrderId.
     *
     * @return CustomerOrderDTO
     */
    @Override
    public CustomerOrderDTO getCustomerOrder(Integer orderId) throws Exception {
        CustomerOrderDTO customerOrderDTO = new CustomerOrderDTO();

        LOGGER.info("Fetching Customer and Order details for OrderId: {}", orderId);

        OrderDTO order = getOrder(orderId);

        if (order != null) {
            customerOrderDTO.setOrder(order);
            customerOrderDTO.setCustomer(getCustomer(order.getCustomerId()));
        } else {
            LOGGER.error("No Order found for, OrderId: {}", orderId);
        }

        return customerOrderDTO;
    }

    private OrderDTO getOrder(Integer orderId) {
        ResponseEntity<OrderDTO> orderDTOResponse = restTemplate.getForEntity(orderServiceURL + orderId, OrderDTO.class);
        return orderDTOResponse.getBody();
    }

    private CustomerDTO getCustomer(Integer customerId) {
        ResponseEntity<CustomerDTO> customerDTOResponse = restTemplate.getForEntity(customerServiceURL + customerId, CustomerDTO.class);
        return customerDTOResponse.getBody();
    }
}
