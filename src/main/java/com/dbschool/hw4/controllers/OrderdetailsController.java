package com.dbschool.hw4.controllers;

import com.dbschool.hw4.entity.Orderdetails;
import com.dbschool.hw4.services.OrderdetailsService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class OrderdetailsController {
   /* @Autowired
    OrderdetailsService orderdetailsService;

    @GetMapping("/orderdetails/all")
    public List<Orderdetails> getAllOrderdetais() {
        return orderdetailsService.getAllOrderdetails();
    }

    @RequestMapping(value = "/orderdetails/{id}", method = RequestMethod.GET)
    @RequestBody
    public Optional<Orderdetails> getById(@PathVariable Integer id) {
        return orderdetailsService.getById(id);
    }

    @PostMapping(value = "orderdetails/")
    public Orderdetails saveOrderdetails(@RequestBody Orderdetails details) {
        return orderdetailsService.saveOrderdetails(details);
    }

    @RequestMapping(value="/orderdetails/delete/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteOrderdetails(@PathVariable Integer id){
        orderdetailsService.deleteOrderdetails(id);
    }*/

}
