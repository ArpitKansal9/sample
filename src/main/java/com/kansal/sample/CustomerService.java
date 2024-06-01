package com.kansal.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerReposioty customerReposioty;

    public String fetchCustomerDetails() {
        return "Seepu" + "Kansal";
    }

    public List<CustomerEntity> fetchAllCustomerDetails() {
        return customerReposioty.findAll();
    }

    public CustomerEntity saveCustomer(Customer customer) {
        CustomerEntity customerEntity = new CustomerEntity();
        customerEntity.setId(customer.getId());
        customerEntity.setName(customer.getName());
        customerEntity.setEmail(customer.getEmail());
        return customerReposioty.save(customerEntity);
    }
}
