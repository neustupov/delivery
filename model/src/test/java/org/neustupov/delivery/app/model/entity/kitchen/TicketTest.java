package org.neustupov.delivery.app.model.entity.kitchen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TicketTest {

  @Test
  void addTicket() {
    Ticket ticket = new Ticket();
    TicketLineItem ticketLineItem = new TicketLineItem(1, "apple", new Ticket());
    ticket.addTicket(ticketLineItem);
    assertTrue(containsTicketLineItem(ticket, ticketLineItem));
  }

  private boolean containsTicketLineItem(Ticket ticket, TicketLineItem ticketLineItem) {
    return ticket.getTicketLineItems().contains(ticketLineItem);
  }
}