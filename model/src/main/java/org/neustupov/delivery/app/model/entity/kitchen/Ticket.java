package org.neustupov.delivery.app.model.entity.kitchen;

import static java.time.LocalDateTime.now;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.neustupov.delivery.app.model.entity.base.AbstractEntity;
import org.neustupov.delivery.app.model.entity.common.Status;

@Data
@Entity
@NoArgsConstructor
@Table(name = "TICKETS")
@EqualsAndHashCode(callSuper = true)
public class Ticket extends AbstractEntity {

  @Enumerated
  @Column(nullable=false, name="STATUS")
  private Status status;

  @Embedded
  private TicketState state;

  private Long restaurantId;

  @Column(nullable=false, name="REQUESTED_DELIVERY_TIME")
  private LocalDateTime requestedDeliveryTime;

  @Column(nullable=false, name="PREPARED_BY_TIME")
  private LocalDateTime preparedByTime;

  private LocalDateTime acceptTime;

  private LocalDateTime pickedUpTime;

  private LocalDateTime readyForPickUpTime;

  @ElementCollection
  private Set<TicketLineItem> ticketLineItems;

  public Ticket(TicketDetails details) {
    this.status = Status.CREATED;
    this.state = details.getTicketState();
    this.restaurantId = details.getRestaurantId();
    this.requestedDeliveryTime = details.getRequestedDeliveryTime();
    this.preparedByTime = details.getPreparedByTime();
    this.acceptTime = now();
    this.pickedUpTime = details.getPickedUpTime();
    this.readyForPickUpTime = details.getReadyForPickUpTime();
    this.ticketLineItems = details.getTicketLineItems();
  }

  public static Ticket create(TicketDetails details){
    return new Ticket(details);
  }

  public void addTicket(TicketLineItem ticketLineItem){
    if(ticketLineItems == null){
      ticketLineItems = new HashSet<>();
    }
    ticketLineItems.add(ticketLineItem);
  }
}
