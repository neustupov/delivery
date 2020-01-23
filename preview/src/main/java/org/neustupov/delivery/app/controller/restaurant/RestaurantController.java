package org.neustupov.delivery.app.controller.restaurant;

import java.util.List;
import org.neustupov.delivery.app.model.entity.restaurant.Restaurant;
import org.neustupov.delivery.app.service.restaurant.RestaurantService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("restaurants")
public class RestaurantController {

  private static final Logger logger = LoggerFactory.getLogger(RestaurantController.class);

  @Lazy
  @Autowired
  private RestaurantService restaurantService;

  @GetMapping(value = "/", produces = "application/json")
  public List<Restaurant> getAllRestaurants(){
    logger.info("Get all restaurants GET method");
    return restaurantService.findAll();
  }
}
