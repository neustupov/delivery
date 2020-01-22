package org.neustupov.delivery.app.service.order;

import org.neustupov.delivery.app.model.entity.order.Order;
import org.neustupov.delivery.app.repository.order.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

  @Lazy
  @Autowired
  private OrderRepository orderRepository;

  public Order createOrder(Order order){
    return orderRepository.save(order);
  }

  public Order updateOrder(){

  }

  public Order approveOrder(){}

  public Order rejectOrder(){}

  public Order validateOrderDetails(){

  }
}
