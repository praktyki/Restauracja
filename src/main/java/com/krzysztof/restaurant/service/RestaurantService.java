package com.krzysztof.restaurant.service;

import java.util.Collection;

import com.krzysztof.restaurant.helpers.Receipt;
import com.krzysztof.restaurant.model.AbstractOrder;
import com.krzysztof.restaurant.model.Board;
import com.krzysztof.restaurant.model.GroupOrder;
import com.krzysztof.restaurant.model.SingleOrder;

public interface RestaurantService {
	void addGroupOrder(GroupOrder groupOrder, long boardId);

	void addSingleOrder(SingleOrder singleOrder, long boardId);

	Receipt fetchReceipt(long AbstractOrderId, long boardId);

	Collection<Board> getAllBoards();

	Collection<AbstractOrder> getAllOrders(long tableId);

	// Collection<Board> getFreeBoards();

	Board getBoardById(long boardId);
}
