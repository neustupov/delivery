package org.neustupov.delivery.app.service.delivery;

import org.neustupov.delivery.app.repository.delivery.DeliveryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
public class DeliveryService {

  @Lazy
  @Autowired
  private DeliveryRepository deliveryRepository;
}
