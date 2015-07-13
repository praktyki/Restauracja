package com.krzysztof.restaurant.service;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.krzysztof.restaurant.helpers.Receipt;
import com.krzysztof.restaurant.model.AbstractOrder;
import com.krzysztof.restaurant.model.Board;
import com.krzysztof.restaurant.model.SingleOrder;
import com.krzysztof.restaurant.repository.BoardRepositoryCustom;
import com.krzysztof.restaurant.repository.OrderRepository;

@Service
public class RestaurantServiceImpl implements RestaurantService {
	private BoardRepositoryCustom boardRepositoryCustom;
	private OrderRepository orderRepository;

	@Override
	public void addGroupOrder(Collection<SingleOrder> collectionOfOrders, int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addSingleOrder(SingleOrder singleOrder, int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Collection<Board> getAllBoards() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<AbstractOrder> getAllOrders(long tableId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Board getBoardById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public Collection<Board> getFreeBoards() {
		return boardRepositoryCustom.findAllFreeBoards();
	}

	@Override
	public Receipt getReceipt(long AbstractOrderId, int orderId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Autowired
	public void setRepositories(BoardRepositoryCustom boardRepositoryCustom, OrderRepository orderRepository) {
		this.boardRepositoryCustom = boardRepositoryCustom;
		this.orderRepository = orderRepository;
	}
}
