package com.dbschool.hw4.repositories;

import com.dbschool.hw4.entity.Customers;
import com.dbschool.hw4.entity.Products;
import org.springframework.data.repository.CrudRepository;

public interface ProductsRepository extends CrudRepository<Products, String> {

}
