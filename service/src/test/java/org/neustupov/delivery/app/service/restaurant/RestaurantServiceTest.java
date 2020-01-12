package org.neustupov.delivery.app.service.restaurant;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.neustupov.delivery.app.model.entity.restaurant.Restaurant;
import org.neustupov.delivery.app.repository.restaurant.RestaurantRepository;

@ExtendWith(MockitoExtension.class)
class RestaurantServiceTest {

  @Mock
  RestaurantRepository restaurantRepository;

  @Test
  void save() {
    Restaurant restaurant = new Restaurant("Ararat", 1L, new HashSet<>());
    restaurantRepository.save(restaurant);
    System.out.print(restaurantRepository.findAll());
  }
}