package com.sohan.customer.service.example.service.impl;

import com.sohan.customer.service.example.dao.CustomerRepository;
import com.sohan.customer.service.example.dao.entities.CustomerEntity;
import com.sohan.customer.service.example.dto.CustomerDTO;
import com.sohan.customer.service.example.dto.CustomerMapper;
import com.sohan.customer.service.example.service.CustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Service Implementation that fetches / acts on CustomerDTO related data.
 *
 * @author Sohan
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    /**
     * Handle to the Data Access Layer.
     */
    @Autowired
    private CustomerRepository customerRepository;

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerServiceImpl.class);

    /**
     * Gets the Customers Details for the given CustomerId.
     *
     * @return CustomerDTO
     */
    @Override
    public CustomerDTO getCustomer(Integer customerId) throws Exception {
        LOGGER.info("Fetching Customer details for CustomerId: {}", customerId);
        Optional<CustomerEntity> customerEntity = customerRepository.findById(customerId);
        CustomerDTO customerDTO = null;

        if (customerEntity.isPresent()) {
            customerDTO = CustomerMapper.INSTANCE.customerEntityToDTO(customerEntity.get());
        }

        return customerDTO;
    }
}
