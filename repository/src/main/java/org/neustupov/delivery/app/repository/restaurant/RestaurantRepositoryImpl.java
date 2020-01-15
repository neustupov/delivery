package org.neustupov.delivery.app.repository.restaurant;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import org.neustupov.delivery.app.model.entity.restaurant.MenuItem;
import org.neustupov.delivery.app.model.entity.restaurant.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

@Repository
public class RestaurantRepositoryImpl implements RestaurantRepository {

  @Lazy
  @Autowired
  private RestaurantRepository restaurantRepository;

  @Override
  public List<Restaurant> findByName() {
    return restaurantRepository.findByName();
  }

  @Override
  public <S extends Restaurant> S save(S s) {
    return restaurantRepository.save(s);
  }

  @Override
  public <S extends Restaurant> Iterable<S> saveAll(Iterable<S> iterable) {
    return restaurantRepository.saveAll(iterable);
  }

  @Override
  public Optional<Restaurant> findById(Long aLong) {
    return Optional.empty();
  }

  @Override
  public boolean existsById(Long aLong) {
    return false;
  }

  @Override
  public Iterable<Restaurant> findAll() {
    return restaurantRepository.findAll();
  }

  @Override
  public Iterable<Restaurant> findAllById(Iterable<Long> iterable) {
    return null;
  }

  @Override
  public long count() {
    return 0;
  }

  @Override
  public void deleteById(Long aLong) {

  }

  @Override
  public void delete(Restaurant restaurant) {

  }

  @Override
  public void deleteAll(Iterable<? extends Restaurant> iterable) {

  }

  @Override
  public void deleteAll() {

  }
}
