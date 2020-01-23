package org.neustupov.delivery.app.controller.kitchen;

import org.neustupov.delivery.app.model.entity.kitchen.Ticket;
import org.neustupov.delivery.app.model.entity.kitchen.TicketDetails;
import org.neustupov.delivery.app.service.kitchen.KitchenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kitchen")
public class KitchenController {

  @Lazy
  @Autowired
  private KitchenService kitchenService;

  @GetMapping(value = "/ticket/{id}", produces = "application/json")
  public Ticket getTicketById(@PathVariable("id") Long ticketId){
    Ticket ticket = kitchenService.getTicketById(ticketId);
    return ticket;
  }

  @PostMapping(value = "/create", consumes = "application/json")
  public ResponseEntity<Ticket> createTicket(@RequestBody TicketDetails ticketDetails){
    Ticket ticket = kitchenService.createTicket(ticketDetails);
    return ResponseEntity.ok(ticket);
  }

  @GetMapping(value = "/ticket/reject/{id}", produces = "application/json")
  public Ticket rejectTicket(@PathVariable("id") Long ticketId){
    return kitchenService.rejectTicket(ticketId);
  }

  @GetMapping(value = "/ticket/approve/{id}", produces = "application/json")
  public Ticket approveTicket(@PathVariable("id") Long ticketId){
    return kitchenService.approveTicket(ticketId);
  }

  public boolean acceptOrder(){
    return true;
  }

  public boolean noteOrderReadyForPickup(){
    return true;
  }
}
