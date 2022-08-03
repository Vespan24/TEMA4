package com.dbschool.hw4.entity;

import org.springframework.lang.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Orders {
    @Id
    @GeneratedValue
    Integer id;
    Date order_date;
    Date shipped_date;
    String status;
    String comments;
    @NonNull
    Integer customer_id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getOrder_date() {
        return order_date;
    }

    public void setOrder_date(Date order_date) {
        this.order_date = order_date;
    }

    public Date getShipped_date() {
        return shipped_date;
    }

    public void setShipped_date(Date shipped_date) {
        this.shipped_date = shipped_date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @NonNull
    public Integer getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(@NonNull Integer customer_id) {
        this.customer_id = customer_id;
    }
}
