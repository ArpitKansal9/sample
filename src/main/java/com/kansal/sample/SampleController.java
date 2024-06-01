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

    @GetMapping("/fibonacci")
    public long[] getFibonacci(@RequestParam("n") int n) {
        long[] fibSequence = new long[n];

        if (n >= 1) {
            fibSequence[0] = 0;
        }

        if (n >= 2) {
            fibSequence[1] = 1;
        }

        for (int i = 2; i < n; i++) {
            fibSequence[i] = fibSequence[i - 1] + fibSequence[i - 2];
        }

        return fibSequence;
    }

}
