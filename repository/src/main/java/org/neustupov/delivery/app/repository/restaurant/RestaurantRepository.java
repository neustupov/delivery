package org.neustupov.delivery.app.repository.restaurant;

import org.neustupov.delivery.app.model.entity.restaurant.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {

}
