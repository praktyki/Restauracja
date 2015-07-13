package com.krzysztof.restaurant.controller;

import java.util.Collection;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.krzysztof.restaurant.model.SingleOrder;
import com.krzysztof.restaurant.service.RestaurantService;

@Controller
public class RestaurantController {

	private RestaurantService restaurantService;

	@RequestMapping(value = "/table/{id}/order", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<String> addOrder(@PathVariable("id") int id, @Valid SingleOrder singleOrder) {
		restaurantService.addSingleOrder(singleOrder, id);
	}

	@RequestMapping(value = "/table/{id}/orders", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<String> addOrders(@PathVariable("id") int id,
			@Valid Collection<SingleOrder> collectionOfOrders) {
		restaurantService.addGroupOrder(collectionOfOrders, id);
	}

	@RequestMapping(value = "/tables", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<String> getAllBoards() {
		return restaurantService.getAllBoards();
	}

	@RequestMapping(value = "/table/{id}", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<String> getBoardById(@PathVariable("id") int id) {
		return restaurantService.getBoardById(id);
	}

	@RequestMapping("/tables/free")
	@ResponseBody
	public ResponseEntity<String> getFreeBoards() {
		return restaurantService.getFreeBoards();
	}

	@RequestMapping(value = "/table/{id}/order/{orderId}", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<String> getReceipt(@PathVariable("id") int id, @PathVariable("orderId") int orderId) {
		return restaurantService.getReceipt(id, orderId);
	}

	@Autowired
	public void setRestaurantService(RestaurantService restaurantService) {
		this.restaurantService = restaurantService;
	}
}
