package com.krzysztof.restaurant.service;

import java.util.Collection;

import com.krzysztof.restaurant.helpers.Receipt;
import com.krzysztof.restaurant.model.AbstractOrder;
import com.krzysztof.restaurant.model.Board;
import com.krzysztof.restaurant.model.SingleOrder;

public interface RestaurantService {
	void addGroupOrder(Collection<SingleOrder> collectionOfOrders);

	void addSingleOrder(SingleOrder singleOrder);

	Collection<Board> getAllBoards();

	Collection<AbstractOrder> getAllOrders(long tableId);

	Collection<Board> getFreeBoards();

	Receipt getReceipt(long AbstractOrderId);
}
