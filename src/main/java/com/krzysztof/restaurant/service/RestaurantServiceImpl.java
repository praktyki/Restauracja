package com.krzysztof.restaurant.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.krzysztof.restaurant.helpers.Receipt;
import com.krzysztof.restaurant.model.AbstractOrder;
import com.krzysztof.restaurant.model.Board;
import com.krzysztof.restaurant.model.SingleOrder;
import com.krzysztof.restaurant.repository.BoardRepository;
import com.krzysztof.restaurant.repository.OrderRepository;

@Service
public class RestaurantServiceImpl implements RestaurantService {
	private BoardRepository boardRepository;
	private OrderRepository orderRepository;

	@Override
	public void addGroupOrder(Collection<SingleOrder> collectionOfOrders) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addSingleOrder(SingleOrder singleOrder) {
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
	@Transactional
	public Collection<Board> getFreeBoards() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Receipt getReceipt(long AbstractOrderId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Autowired
	public void setRepositories(BoardRepository boardRepository, OrderRepository orderRepository) {
		this.boardRepository = boardRepository;
		this.orderRepository = orderRepository;
	}
}
