package com.dbschool.hw4.repositories;

import com.dbschool.hw4.entity.Orders;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrdersRepository extends CrudRepository<Orders, Integer> {
    public List<Orders> findAll();
}
