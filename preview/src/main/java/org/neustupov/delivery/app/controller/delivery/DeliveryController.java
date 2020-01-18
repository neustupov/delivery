package org.neustupov.delivery.app.controller.delivery;

import org.neustupov.delivery.app.service.delivery.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("delivery")
public class DeliveryController {

  @Lazy
  @Autowired
  private DeliveryService deliveryService;
}
