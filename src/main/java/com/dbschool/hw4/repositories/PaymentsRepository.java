package com.dbschool.hw4.repositories;

import com.dbschool.hw4.entity.Payments;
import org.springframework.data.repository.CrudRepository;

public interface PaymentsRepository extends CrudRepository<Payments, Integer> {
}
