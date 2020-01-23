package org.neustupov.delivery.app.service.restaurant;

import java.util.ArrayList;
import java.util.List;
import org.neustupov.delivery.app.model.entity.restaurant.Restaurant;
import org.neustupov.delivery.app.repository.restaurant.RestaurantRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
public class RestaurantService {

  private static final Logger logger = LoggerFactory.getLogger(RestaurantService.class);

  @Lazy
  @Autowired
  private RestaurantRepository restaurantRepository;

  public void save(Restaurant restaurant){
    restaurantRepository.save(restaurant);
  }

  public List<Restaurant> findAll(){
    logger.info("Get all restaurants GET method");
    List<Restaurant> restList = new ArrayList<>();
    restaurantRepository.findAll().forEach(restList::add);
    return restList;
  }

  public boolean verifyOrderDetails(){
    return true;
  }

  public boolean verifyConsumerDetails(){
    return true;
  }

  public Restaurant findAvailableRestaurant(){
    return restaurantRepository.findAll().get(0);
  }
}
