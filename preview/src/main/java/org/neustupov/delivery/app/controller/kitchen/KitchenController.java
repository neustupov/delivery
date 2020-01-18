package org.neustupov.delivery.app.controller.kitchen;

import org.neustupov.delivery.app.service.kitchen.KitchenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kitchen")
public class KitchenController {

  @Lazy
  @Autowired
  private KitchenService kitchenService;
}
