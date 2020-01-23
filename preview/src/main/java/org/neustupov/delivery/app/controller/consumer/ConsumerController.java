package org.neustupov.delivery.app.controller.consumer;

import org.neustupov.delivery.app.service.consumer.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("consumer")
public class ConsumerController {

  @Lazy
  @Autowired
  private ConsumerService consumerService;
}
