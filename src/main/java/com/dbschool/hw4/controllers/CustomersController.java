package com.dbschool.hw4.controllers;

import com.dbschool.hw4.entity.Customers;
import com.dbschool.hw4.services.CustomersService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CustomersController {
    @Autowired
    CustomersService customersService;

    @GetMapping("/customers/all")
    public List<Customers> getAllCustomers() {
        return customersService.getAllCustomers();
    }

    @RequestMapping(value = "/customers/{id}", method = RequestMethod.GET)
    @RequestBody
    public Optional<Customers> getById(@PathVariable Integer id) {
        return customersService.getById(id);
    }

    @PostMapping(value = "customers/")
    public Customers saveCustomer(@RequestBody Customers customer) {
        return customersService.saveCustomer(customer);
    }

    @RequestMapping(value="/customers/delete/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteCustomer(@PathVariable Integer id){
        customersService.deleteCustomer(id);
    }

    @RequestMapping(value = "customers/update/{id}", method = RequestMethod.POST)
    public void updateCustomer(@PathVariable Integer id, String username)
    {
        customersService.updateCustomer(id, username);

    }





}


