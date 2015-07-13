package com.krzysztof.restaurant.repository;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.LockModeType;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.krzysztof.restaurant.model.Board;

public class BoardRepositoryImpl implements BoardRepositoryCustom {

	@PersistenceContext
	EntityManager entityManager;

	@Override
	public Collection<Board> findAllFreeBoards() {
		TypedQuery<Board> createQuery = entityManager.createQuery("", Board.class);
		createQuery.setLockMode(LockModeType.OPTIMISTIC_FORCE_INCREMENT);
		List<Board> resultList = createQuery.getResultList();
		return resultList == null ? Collections.emptyList() : resultList;
	}

}
