package com.krzysztof.restaurant.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.krzysztof.restaurant.model.AbstractOrder;

@Repository
public interface OrderRepositoryCrud extends CrudRepository<AbstractOrder, Long> {

}
