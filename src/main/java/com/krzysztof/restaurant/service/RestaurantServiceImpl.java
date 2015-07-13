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
import com.krzysztof.restaurant.repository.BoardRepository;
import com.krzysztof.restaurant.repository.BoardRepositoryCustom;
import com.krzysztof.restaurant.repository.OrderRepository;

@Service
@Transactional
public class RestaurantServiceImpl implements RestaurantService {
	private BoardRepository boardRepository;
	private BoardRepositoryCustom boardRepositoryCustom;
	private OrderRepository orderRepository;

	@Override
	public void addGroupOrder(Collection<SingleOrder> collectionOfOrders,
			long boardId) {
		Board board = boardRepository.findOne(boardId);
		board.getOrdersCollection().addAll(collectionOfOrders);
		GroupOrder groupOrder = new GroupOrder();

	}

	@Override
	public void addSingleOrder(SingleOrder singleOrder, long boardId) {
		// TODO Auto-generated method stub

	}

	@Override
	public Collection<Board> getAllBoards() {
		return null;
	}

	@Override
	public Collection<AbstractOrder> getAllOrders(long boardId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Board getBoardById(long boardId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Board> getFreeBoards() {
		return boardRepositoryCustom.findAllFreeBoards();
	}

	@Override
	public Receipt getReceipt(long AbstractOrderId, long boardId) {
		AbstractOrder abstractOrder = orderRepository.findOne(boardId);
		Receipt receipt = abstractOrder.getReceipt();
		orderRepository.save(abstractOrder);
		return receipt;
	}

	@Autowired
	public void setRepositories(BoardRepositoryCustom boardRepositoryCustom,
			OrderRepository orderRepository, BoardRepository boardRepository) {
		this.boardRepositoryCustom = boardRepositoryCustom;
		this.orderRepository = orderRepository;
		this.boardRepository = boardRepository;
	}
}
