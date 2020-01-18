package org.neustupov.delivery.app.service.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

  @Lazy
  @Autowired
  private OrderService orderService;
}
