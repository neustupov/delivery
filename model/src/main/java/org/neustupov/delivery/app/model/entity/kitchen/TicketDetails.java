package org.neustupov.delivery.app.model.entity.kitchen;

import java.time.LocalDateTime;
import java.util.Set;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import lombok.Data;
import org.neustupov.delivery.app.model.entity.base.AbstractEntity;

@Data
@Entity
public class TicketDetails extends AbstractEntity {

  @Embedded
  private TicketState ticketState;
  private Long restaurantId;
  private LocalDateTime requestedDeliveryTime;
  private LocalDateTime preparedByTime;
  private LocalDateTime pickedUpTime;
  private LocalDateTime readyForPickUpTime;
  @ElementCollection
  private Set<TicketLineItem> ticketLineItems;
}
