package org.neustupov.delivery.app.repository.restaurant;

import org.neustupov.delivery.app.model.entity.restaurant.Restaurant;
import org.springframework.data.repository.CrudRepository;

public interface RestaurantRepository extends CrudRepository<Restaurant, Long> {

}
