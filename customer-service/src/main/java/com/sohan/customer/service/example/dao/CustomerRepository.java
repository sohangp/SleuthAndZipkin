package com.sohan.customer.service.example.dao;

import com.sohan.customer.service.example.dao.entities.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * This interface provides handles to database, to perform CRUD operations on the table `CUSTOMER`.
 * The table is represented by the JPA entity {@link CustomerEntity}.
 *
 * @author Sohan
 * @see JpaRepository
 */
@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity, Integer> {

}
