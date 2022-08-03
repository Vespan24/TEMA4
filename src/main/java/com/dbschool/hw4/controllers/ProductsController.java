package com.dbschool.hw4.controllers;


import com.dbschool.hw4.entity.Products;
import com.dbschool.hw4.services.ProductsService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.Properties;

public class ProductsController {
    @Autowired
    ProductsService productsService;

    @GetMapping("/products/all")
    public List<Products> getAllProducts() {
        return productsService.getAllProducts();
    }

    @RequestMapping(value = "/products/{code}", method = RequestMethod.GET)
    @RequestBody
    public Optional<Products> getById(@PathVariable String code) {
        return productsService.getById(code);
    }

    @PostMapping(value = "products/")
    public Products saveProduct(@RequestBody Products product) {
        return productsService.saveProduct(product);
    }

    @RequestMapping(value="/products/delete/{code}", method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteProduct(@PathVariable String code){
        productsService.deleteProduct(code);
    }

    @RequestMapping(value = "products/update/{code}", method = RequestMethod.POST)
    public void updateProduct(@PathVariable String code, String name)
    {
        productsService.updateProduct(code, name);
    }
}
