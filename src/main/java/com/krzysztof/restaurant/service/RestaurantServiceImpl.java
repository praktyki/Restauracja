package com.krzysztof.restaurant.service;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.krzysztof.restaurant.helpers.Receipt;
import com.krzysztof.restaurant.model.AbstractOrder;
import com.krzysztof.restaurant.model.Board;
import com.krzysztof.restaurant.model.GroupOrder;
import com.krzysztof.restaurant.model.SingleOrder;
import com.krzysztof.restaurant.repository.BoardRepositoryCrud;
import com.krzysztof.restaurant.repository.BoardRepositoryCustom;
import com.krzysztof.restaurant.repository.OrderRepositoryCrud;

@Service
@Transactional
public class RestaurantServiceImpl implements RestaurantService {
	private BoardRepositoryCrud boardRepositoryCrud;
	private BoardRepositoryCustom boardRepositoryCustom;
	private OrderRepositoryCrud orderRepositoryCrud;

	@Override
	public void addGroupOrder(GroupOrder groupOrder, long boardId) {
		Board board = boardRepositoryCrud.findOne(boardId);
		board.getOrdersCollection().add(groupOrder);
		board.getOrdersCollection().addAll(groupOrder.getCollectionOfOrders());

	}

	@Override
	public void addSingleOrder(SingleOrder singleOrder, long boardId) {
		Board board = boardRepositoryCrud.findOne(boardId);
		// singleOrder = orderRepositoryCrud.save(singleOrder);
		System.out.println(singleOrder);
		board.getOrdersCollection().add(singleOrder);
		boardRepositoryCrud.save(board);
	}

	@Override
	public Receipt fetchReceipt(long AbstractOrderId, long boardId) {
		AbstractOrder abstractOrder = orderRepositoryCrud.findOne(boardId);
		Receipt receipt = abstractOrder.fetchReceipt();
		orderRepositoryCrud.save(abstractOrder);
		return receipt;
	}

	@Override
	public Collection<Board> getAllBoards() {
		return boardRepositoryCustom.getAllBoards();
	}

	@Override
	public Collection<AbstractOrder> getAllOrders(long boardId) {
		Board board = boardRepositoryCrud.findOne(boardId);
		return board.getOrdersCollection();
	}

	// @Override
	// public Collection<Board> getFreeBoards() {
	// return boardRepositoryCustom.findAllFreeBoards();
	// }

	@Override
	public Board getBoardById(long boardId) {
		return boardRepositoryCrud.findOne(boardId);
	}

	@Autowired
	public void setRepositories(BoardRepositoryCustom boardRepositoryCustom, OrderRepositoryCrud orderRepositoryCrud,
			BoardRepositoryCrud boardRepositoryCrud) {
		this.boardRepositoryCustom = boardRepositoryCustom;
		this.orderRepositoryCrud = orderRepositoryCrud;
		this.boardRepositoryCrud = boardRepositoryCrud;
	}
}
