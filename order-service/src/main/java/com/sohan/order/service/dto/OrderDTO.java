package com.sohan.order.service.dto;

import lombok.Data;

/**
 * POJO for holding Order related data
 */
@Data
public class OrderDTO {

    private Integer orderId;

    private Integer customerId;

    private String status;

    private Double totalAmount;
}
