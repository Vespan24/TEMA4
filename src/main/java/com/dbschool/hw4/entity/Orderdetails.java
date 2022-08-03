package com.dbschool.hw4.entity;

import org.springframework.lang.NonNull;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Orderdetails {
    @Id
    @GeneratedValue
    private Integer id;
    @NonNull
    private String product_code;
    @NonNull
    private Integer order_id;
    private Integer quantity;
    private Double priceEach;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @NonNull
    public String getProduct_code() {
        return product_code;
    }

    public void setProduct_code(@NonNull String product_code) {
        this.product_code = product_code;
    }

    @NonNull
    public Integer getOrder_id() {
        return order_id;
    }

    public void setOrder_id(@NonNull Integer order_id) {
        this.order_id = order_id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPriceEach() {
        return priceEach;
    }

    public void setPriceEach(Double priceEach) {
        this.priceEach = priceEach;
    }
}
