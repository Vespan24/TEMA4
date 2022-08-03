package com.dbschool.hw4.repositories;

import com.dbschool.hw4.entity.Customers;
import org.springframework.data.repository.CrudRepository;

public interface CustomersRepository extends CrudRepository<Customers, Integer> {
    public Customers getById(Integer customerId);
}
