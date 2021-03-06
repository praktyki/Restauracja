package com.krzysztof.restaurant.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.krzysztof.restaurant.model.Board;

@Repository
public interface BoardRepositoryCrud extends CrudRepository<Board, Long> {

}
