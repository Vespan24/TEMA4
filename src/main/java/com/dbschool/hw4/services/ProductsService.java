package com.dbschool.hw4.services;

import com.dbschool.hw4.entity.Products;
import com.dbschool.hw4.repositories.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProductsService {
    @Autowired
    ProductsRepository customersRepository;

    List<Products> list = new ArrayList<>();

    public List<Products> getAllProducts(){
        List<Products> aux = new ArrayList<>();
        customersRepository.findAll().iterator().forEachRemaining(aux::add);
        return aux;
    }

    public Optional<Products> getById(String code){
        return customersRepository.findById(code);
    }

    public Products saveProduct(Products product) {
        return customersRepository.save(product);
    }

    public void deleteProduct(String code){
        customersRepository.deleteById(code);
    }

    public void updateProduct(String code, String name){

    }
}
