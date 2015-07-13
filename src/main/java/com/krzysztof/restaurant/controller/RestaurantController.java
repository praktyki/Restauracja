package com.krzysztof.restaurant.controller;

import java.util.Collection;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.krzysztof.restaurant.helpers.Receipt;
import com.krzysztof.restaurant.model.Board;
import com.krzysztof.restaurant.model.SingleOrder;
import com.krzysztof.restaurant.service.RestaurantService;

@Controller
public class RestaurantController {

	private RestaurantService restaurantService;

	@RequestMapping(value = "/table/{boardId}/order", method = RequestMethod.POST)
	@ResponseBody
	public void addOrder(@PathVariable("boardId") int id, @Valid SingleOrder singleOrder) {
		restaurantService.addSingleOrder(singleOrder, id);
	}

	@RequestMapping(value = "/table/{boardId}/orders", method = RequestMethod.POST)
	@ResponseBody
	public void addOrders(@PathVariable("boardId") int id, @Valid Collection<SingleOrder> collectionOfOrders) {
		restaurantService.addGroupOrder(collectionOfOrders, id);
	}

	@RequestMapping(value = "/tables", method = RequestMethod.GET)
	@ResponseBody
	public Collection<Board> getAllBoards() {
		return restaurantService.getAllBoards();
	}

	@RequestMapping(value = "/table/{boardId}", method = RequestMethod.GET)
	@ResponseBody
	public Board getBoardById(@PathVariable("boardId") int id) {
		return restaurantService.getBoardById(id);
	}

	@RequestMapping("/tables/free")
	@ResponseBody
	public Collection<Board> getFreeBoards() {
		return restaurantService.getFreeBoards();
	}

	@RequestMapping(value = "/table/{boardId}/order/{orderId}", method = RequestMethod.GET)
	@ResponseBody
	public Receipt getReceipt(@PathVariable("boardId") int id, @PathVariable("orderId") int orderId) {
		return restaurantService.getReceipt(id, orderId);
	}

	@Autowired
	public void setRestaurantService(RestaurantService restaurantService) {
		this.restaurantService = restaurantService;
	}
}
