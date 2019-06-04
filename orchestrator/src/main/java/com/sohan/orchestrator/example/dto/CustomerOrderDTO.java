package com.sohan.orchestrator.example.dto;

import com.sohan.order.service.dto.OrderDTO;
import lombok.Data;

/**
 * POJO for holding Customer and Order related data
 */
@Data
public class CustomerOrderDTO {

    private CustomerDTO customer;

    private OrderDTO order;
}
