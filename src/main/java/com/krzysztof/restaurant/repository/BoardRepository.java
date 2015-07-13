package com.krzysztof.restaurant.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.krzysztof.restaurant.model.Board;

@Repository
public interface BoardRepository extends CrudRepository<Board, Long> {

	@Query("SELECT board FROM ... WHERE ")
	Collection<Board> findAllFreeBoards();
}
