package org.neustupov.delivery.app.service.restaurant;

import static java.time.LocalDateTime.now;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.neustupov.delivery.app.model.entity.restaurant.MenuItem;
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
    HashSet<MenuItem> lineItems = new HashSet<>();
    MenuItem menuItem = new MenuItem("vine", 100);
    menuItem.setCreatedAt(now());
    lineItems.add(menuItem);

    Restaurant restaurant = new Restaurant("Ararat", 1L, lineItems);
    restaurant.setCreatedAt(now());
    restaurantRepository.save(restaurant);
    List<Restaurant> restList = new ArrayList<>();
    restaurantRepository.findAll().forEach(restList::add);
    return restList;
  }
}
