package org.neustupov.delivery.app.service.kitchen;

import org.neustupov.delivery.app.model.entity.common.Status;
import org.neustupov.delivery.app.model.entity.kitchen.Ticket;
import org.neustupov.delivery.app.model.entity.kitchen.TicketDetails;
import org.neustupov.delivery.app.model.entity.order.Order;
import org.neustupov.delivery.app.repository.kitchen.KitchenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

@Service
public class KitchenService {

  @Lazy
  @Autowired
  private KitchenRepository kitchenRepository;

  public Ticket createTicket(TicketDetails ticketDetails){
    Ticket ticket = new Ticket(ticketDetails);
    kitchenRepository.save(ticket);
    return ticket;
  }

  public Ticket rejectTicket(Long ticketId){
    Ticket ticket = kitchenRepository.findById(ticketId).orElseGet(null);
    Assert.notNull(ticket, "Ticket not found!");
    ticket.setStatus(Status.REJECTED);
    kitchenRepository.save(ticket);
    return ticket;
  }

  public Ticket approveTicket(){}

  public Order acceptOrder(){

  }

  public Order noteOrderReadyForPickup(){

  }
}
