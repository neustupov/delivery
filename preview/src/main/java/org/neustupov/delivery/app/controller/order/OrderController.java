package org.neustupov.delivery.app.controller.order;

import org.neustupov.delivery.app.service.order.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("order")
public class OrderController {

  @Lazy
  @Autowired
  private OrderService orderService;
}
