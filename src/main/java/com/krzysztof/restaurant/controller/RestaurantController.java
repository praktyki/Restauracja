package com.krzysztof.restaurant.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.krzysztof.restaurant.helpers.Receipt;
import com.krzysztof.restaurant.model.Board;
import com.krzysztof.restaurant.model.GroupOrder;
import com.krzysztof.restaurant.model.SingleOrder;
import com.krzysztof.restaurant.service.RestaurantService;

@Controller
public class RestaurantController {

	private RestaurantService restaurantService;

	@RequestMapping(value = "/table/{boardId}/orders", method = RequestMethod.POST)
	@ResponseBody
	public void addGroupOrder(@PathVariable("boardId") int boardId, @RequestBody GroupOrder groupOrder) {
		restaurantService.addGroupOrder(groupOrder, boardId);
	}

	@RequestMapping(value = "/table/{boardId}/order", method = RequestMethod.POST)
	@ResponseBody
	public void addOrder(@PathVariable("boardId") int boardId, @RequestBody SingleOrder singleOrder) {
		System.out.println(singleOrder);
		restaurantService.addSingleOrder(singleOrder, boardId);
	}

	@RequestMapping(value = "/tables", method = RequestMethod.GET)
	@ResponseBody
	public Collection<Board> getAllBoards() {
		return restaurantService.getAllBoards();
	}

	@RequestMapping(value = "/table/{boardId}", method = RequestMethod.GET)
	@ResponseBody
	public Board getBoardById(@PathVariable("boardId") int boardId) {
		return restaurantService.getBoardById(boardId);
	}

	@RequestMapping(value = "/tables/free", method = RequestMethod.GET)
	@ResponseBody
	public Collection<Board> getFreeBoards() {
		return restaurantService.getFreeBoards();
	}

	@RequestMapping(value = "/table/{boardId}/order/{orderId}/receipt", method = RequestMethod.GET)
	@ResponseBody
	public Receipt sendReceipt(@PathVariable("orderId") long orderId, @PathVariable("boardId") long boardId) {
		return restaurantService.fetchReceipt(orderId, boardId);
	}

	@Autowired
	public void setRestaurantService(RestaurantService restaurantService) {
		this.restaurantService = restaurantService;
	}
}
