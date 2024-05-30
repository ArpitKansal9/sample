package com.kansal.sample;

import org.springframework.stereotype.Service;

@Service
public class CustomerService {


    public String fetchCustomerDetails() {
        return "Seepu" + "Kansal";
    }
}
