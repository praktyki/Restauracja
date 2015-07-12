package com.krzysztof.restaurant.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.krzysztof.restaurant.model.Board;

@RepositoryRestResource
public interface BoardRepository extends CrudRepository<Board, Long>{

}
