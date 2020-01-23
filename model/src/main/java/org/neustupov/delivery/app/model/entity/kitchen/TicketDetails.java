package org.neustupov.delivery.app.model.entity.kitchen;

import java.time.LocalDateTime;
import java.util.Set;
import javax.persistence.Column;
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

  @Column(nullable=false, name="RESTAURANT_ID")
  private Long restaurantId;

  @Column(nullable=false, name="REQUESTED_DELIVERY_TIME")
  private LocalDateTime requestedDeliveryTime;

  @Column(nullable=false, name="PREPARED_BY_TIME")
  private LocalDateTime preparedByTime;

  @Column(nullable=false, name="PICKED_UP_TIME")
  private LocalDateTime pickedUpTime;

  @Column(nullable=false, name="READY_FOR_PICK_UP_TIME")
  private LocalDateTime readyForPickUpTime;

  @ElementCollection
  private Set<TicketLineItem> ticketLineItems;
}
