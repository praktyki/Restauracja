package com.krzysztof.restaurant.repository;

import java.util.Collection;

import com.krzysztof.restaurant.model.Board;

public interface BoardRepositoryCustom {
	Collection<Board> findAllFreeBoards();

}
