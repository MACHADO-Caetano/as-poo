package com.example.as.controllers;

import com.example.as.models.Customer;
import com.example.as.repositories.CustomerRepository;
import com.example.as.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    final
    CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    List<Customer> listAllCustomers(){
        return customerService.findAll();
    }

    @PostMapping
    Customer saveCustomer(@RequestBody Customer customer) {
        return customerService.save(customer);
    }
}
