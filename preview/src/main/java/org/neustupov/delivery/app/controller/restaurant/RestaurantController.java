package org.neustupov.delivery.app.controller.restaurant;

import java.util.List;
import org.neustupov.delivery.app.model.entity.restaurant.Restaurant;
import org.neustupov.delivery.app.service.restaurant.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("restaurant")
public class RestaurantController {

  @Autowired
  private RestaurantService restaurantService;

  @GetMapping(value = "/", produces = "application/json")
  public List<Restaurant> getAllRestaurants(){
    return restaurantService.findAll();
  }
}
