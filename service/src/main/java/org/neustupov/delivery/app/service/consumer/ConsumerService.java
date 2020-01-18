package org.neustupov.delivery.app.service.consumer;

import org.neustupov.delivery.app.repository.consumer.ConsumerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

  @Lazy
  @Autowired
  private ConsumerRepository consumerRepository;
}
