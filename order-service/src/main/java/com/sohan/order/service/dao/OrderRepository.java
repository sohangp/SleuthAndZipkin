package com.sohan.order.service.dao;

import com.sohan.order.service.dao.entities.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * This interface provides handles to database, to perform CRUD operations on the table `ORDERS`.
 * The table is represented by the JPA entity {@link OrderEntity}.
 *
 * @author Sohan
 * @see JpaRepository
 */
@Repository
public interface OrderRepository extends JpaRepository<OrderEntity, Integer> {

}
