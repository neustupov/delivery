package org.neustupov.delivery.app.service.restaurant;

import org.neustupov.delivery.app.model.entity.restaurant.Restaurant;
import org.neustupov.delivery.app.repository.restaurant.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RestaurantService {

  @Autowired
  private RestaurantRepository restaurantRepository;

  public void save(Restaurant restaurant){
    restaurantRepository.save(restaurant);
  }
}
