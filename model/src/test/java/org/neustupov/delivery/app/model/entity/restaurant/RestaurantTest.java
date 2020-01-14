package org.neustupov.delivery.app.model.entity.restaurant;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RestaurantTest {

  @Test
  void addMenuItem() {

    MenuItem menuItem = new MenuItem("apple", 1, new Restaurant());
    Restaurant restaurant = new Restaurant();
    restaurant.addMenuItem(menuItem);
    assertTrue(containsMenuItem(restaurant, menuItem));
  }

  private boolean containsMenuItem(Restaurant restaurant, MenuItem menuItem) {
    return restaurant.getMenuItems().contains(menuItem);
  }
}