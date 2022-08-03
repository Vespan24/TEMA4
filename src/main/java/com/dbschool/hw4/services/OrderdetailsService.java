package com.dbschool.hw4.services;

import com.dbschool.hw4.entity.Orderdetails;
import com.dbschool.hw4.repositories.CustomersRepository;
import com.dbschool.hw4.repositories.OrderdetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OrderdetailsService{
    @Autowired
    OrderdetailsRepository orderdetailsRepository;

    List<Orderdetails> list = new ArrayList<>();

    public List<Orderdetails> getAllOrderdetails(){
        List<Orderdetails> aux = new ArrayList<>();
        orderdetailsRepository.findAll().iterator().forEachRemaining(aux::add);
        return aux;
    }

    public Optional<Orderdetails> getById(Integer orderdetailsId){
        return orderdetailsRepository.findById(orderdetailsId);
    }

    public Orderdetails saveOrderdetails(Orderdetails orderdetails) {
        return orderdetailsRepository.save(orderdetails);
    }

    public void deleteOrderdetails(Integer id){
        orderdetailsRepository.deleteById(id);
    }

}
