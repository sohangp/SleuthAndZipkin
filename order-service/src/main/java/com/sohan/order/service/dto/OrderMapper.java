package com.sohan.order.service.dto;

import com.sohan.order.service.dao.entities.OrderEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

/**
 * This class maps the Entity object fetched from the DataBase and builds a Data Transfer Object (DTO), which will be
 * the response from the REST API.
 *
 * @author Sohan
 * @see Mapper
 */
@Mapper(unmappedTargetPolicy = ReportingPolicy.ERROR, componentModel = "spring")
public interface OrderMapper {

    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);
    OrderDTO orderEntityToDTO(OrderEntity orderEntity);
}
