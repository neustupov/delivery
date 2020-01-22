package org.neustupov.delivery.app.service.kitchen;

import org.neustupov.delivery.app.model.entity.kitchen.Ticket;
import org.neustupov.delivery.app.model.entity.order.Order;
import org.neustupov.delivery.app.repository.kitchen.KitchenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
public class KitchenService {

  @Lazy
  @Autowired
  private KitchenRepository kitchenRepository;

  public Ticket createTicket(){

  }

  public Ticket rejectTicket(){}

  public Ticket approveTicket(){}

  public Order acceptOrder(){

  }

  public Order noteOrderReadyForPickup(){

  }
}
