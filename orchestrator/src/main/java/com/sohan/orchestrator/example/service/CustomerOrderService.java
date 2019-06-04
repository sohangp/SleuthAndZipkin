package com.sohan.orchestrator.example.service;

import com.sohan.orchestrator.example.dto.CustomerOrderDTO;

/**
 * Service interface that masks the caller from the implementation that fetches / acts on OrderDTO and CustomerDTO
 * related data.
 *
 * @author Sohan
 */
public interface CustomerOrderService {

    /**
     * Gets the Customer and Orders Details for the given OrderId.
     *
     * @param orderId
     * @return CustomerOrderDTO
     */
    CustomerOrderDTO getCustomerOrder(Integer orderId) throws Exception;
}
