package com.sohan.order.service.service.impl;

import com.sohan.order.service.dao.OrderRepository;
import com.sohan.order.service.dao.entities.OrderEntity;
import com.sohan.order.service.dto.OrderDTO;
import com.sohan.order.service.dto.OrderMapper;
import com.sohan.order.service.service.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Service Implementation that fetches / acts on OrderDTO related data.
 *
 * @author Sohan
 */
@Service
public class OrderServiceImpl implements OrderService {

    /**
     * Handle to the Data Access Layer.
     */
    @Autowired
    private OrderRepository orderRepository;

    private static final Logger LOGGER = LoggerFactory.getLogger(OrderServiceImpl.class);

    /**
     * Gets the Order Details for the given OrderId.
     *
     * @return OrderDTO
     */
    @Override
    public OrderDTO getOrder(Integer orderId) throws Exception {
        LOGGER.info("Fetching Order details for OrderId: {}", orderId);
        Optional<OrderEntity> orderEntity = orderRepository.findById(orderId);
        OrderDTO orderDTO = null;

        if (orderEntity.isPresent()) {
            orderDTO = OrderMapper.INSTANCE.orderEntityToDTO(orderEntity.get());
        }

        return orderDTO;
    }
}
