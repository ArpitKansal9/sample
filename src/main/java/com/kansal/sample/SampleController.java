package com.kansal.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class SampleController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/getCustomer")
    public String loginUser() {
        return customerService.fetchCustomerDetails();
    }

    @PostMapping("/saveCustomer")
    public CustomerEntity saveCustomer(@RequestBody Customer customer) {
        return customerService.saveCustomer(customer);
    }

    @GetMapping("/getAllCustomers")
    public List<CustomerEntity> getAllCustomers() {
        return customerService.fetchAllCustomerDetails();
    }

}
