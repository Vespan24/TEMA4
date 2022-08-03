package com.dbschool.hw4.services;

import com.dbschool.hw4.entity.Customers;
import com.dbschool.hw4.repositories.CustomersRepository;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomersService {
    @Autowired
    CustomersRepository customersRepository;

    List<Customers> list = new ArrayList<>();

    public List<Customers> getAllCustomers(){
        List<Customers> aux = new ArrayList<>();
        customersRepository.findAll().iterator().forEachRemaining(aux::add);
        return aux;
    }

    public Optional<Customers> getById(Integer customerId){
        return customersRepository.findById(customerId);
    }

    public Customers saveCustomer(Customers customer) {
        return customersRepository.save(customer);
    }

     public void deleteCustomer(Integer id){
        customersRepository.deleteById(id);
    }

    public void updateCustomer(Integer id, String username){
        //customersRepository.findById(id).setUsername(username);
    }
}

