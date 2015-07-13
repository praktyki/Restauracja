package com.krzysztof.restaurant.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.krzysztof.restaurant.model.Board;
import com.krzysztof.restaurant.service.RestaurantService;

@Controller
public class RestaurantController {

	private RestaurantService restaurantService;

	@RequestMapping("/tables")
	@ResponseBody
	public Collection<Board> getAllBoards() {
		return restaurantService.getAllBoards();
	}

	@RequestMapping("/tables/free")
	@ResponseBody
	public Collection<Board> getFreeBoards() {
		return restaurantService.getFreeBoards();
	}

	@Autowired
	public void setRestaurantService(RestaurantService restaurantService) {
		this.restaurantService = restaurantService;
	}
}
