package org.neustupov.delivery.app.service.restaurant;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.neustupov.delivery.app.model.entity.restaurant.Restaurant;
import org.neustupov.delivery.app.repository.restaurant.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
public class RestaurantService {

  @Lazy
  @Autowired
  private RestaurantRepository restaurantRepository;

  public void save(Restaurant restaurant){
    restaurantRepository.save(restaurant);
  }

  public List<Restaurant> findAll(){
    restaurantRepository.save(new Restaurant("Ararat", 1L, new HashSet<>()));
    List<Restaurant> restList = new ArrayList<>();
    restaurantRepository.findAll().forEach(restList::add);
    return restList;
  }
}
