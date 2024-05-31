package com.kansal.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class SampleController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/getUser")
    public String loginUser() {
        return customerService.fetchCustomerDetails();
    }

}
