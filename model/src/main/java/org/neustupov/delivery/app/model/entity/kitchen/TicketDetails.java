package org.neustupov.delivery.app.model.entity.kitchen;

import java.time.LocalDateTime;
import java.util.Set;
import javax.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class TicketDetails {

  private TicketState ticketState;
  private Long restaurantId;
  private LocalDateTime requestedDeliveryTime;
  private LocalDateTime preparedByTime;
  private LocalDateTime pickedUpTime;
  private LocalDateTime readyForPickUpTime;
  private Set<TicketLineItem> ticketLineItems;
}
