package com.sohan.order.service.service;

import com.sohan.order.service.dto.OrderDTO;

/**
 * Service interface that masks the caller from the implementation that fetches / acts on OrderDTO
 * related data.
 *
 * @author Sohan
 */
public interface OrderService {

    /**
     * Gets the Order Details for the given OrderId.
     *
     * @param orderId
     * @return OrderDTO
     */
    OrderDTO getOrder(Integer orderId) throws Exception;
}
