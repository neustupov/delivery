package org.neustupov.delivery.app.controller.order;

import org.neustupov.delivery.app.model.entity.common.Status;
import org.neustupov.delivery.app.model.entity.order.Order;
import org.neustupov.delivery.app.service.order.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("order")
public class OrderController {

  private static final Logger logger = LoggerFactory.getLogger(OrderController.class);

  @Lazy
  @Autowired
  private OrderService orderService;

  @PostMapping(value = "/create", consumes = "application/json")
  public ResponseEntity<Order> createOrder(@RequestBody Order order){
    Order createdOrder = new Order();
    createdOrder.setConsumerId(order.getConsumerId());
    createdOrder.setDeliveryInfo(order.getDeliveryInfo());
    createdOrder.setOrderLineItems(order.getOrderLineItems());
    createdOrder.setPaymentInfo(order.getPaymentInfo());
    createdOrder.setRestaurantId(order.getRestaurantId());
    createdOrder.setStatus(Status.CREATED);

    logger.info("Order " + order + " created");

    return ResponseEntity.ok(orderService.saveOrder(order));
  }
}
