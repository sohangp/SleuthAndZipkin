package com.sohan.customer.service.example.controller;

import com.sohan.customer.service.example.dto.CustomerDTO;
import com.sohan.customer.service.example.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * This spring controller handles all the API calls made on the end point.
 * <p>
 * - /customers/{customerId}: Gets the Customers Details for the given CustomerId.
 * <p/>
 *
 * @author Sohan
 */
@RestController
public class CustomerController {

    /**
     * Handle to the service.
     */
    @Autowired
    private CustomerService customerService;

    /**
     * Gets the Customers Details for the given CustomerId.
     *
     * @param customerId
     * @return CustomerDTO
     */
    @RequestMapping(value = "/customers/{customerId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public CustomerDTO getCustomer(@PathVariable Integer customerId) throws Exception {
        return customerService.getCustomer(customerId);
    }
}
