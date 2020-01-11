package org.neustupov.delivery.app.model.entity.kitchen;

import java.time.LocalDateTime;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.neustupov.delivery.app.model.entity.base.AbstractEntity;

@Data
@Entity
@MappedSuperclass
@EqualsAndHashCode(callSuper = true)
public class Ticket extends AbstractEntity {

  private Long statusId;
  private LocalDateTime requestedDeliveryTime;
  private LocalDateTime preparedByTime;
  private Set<TicketLineItem> ticketLineItems;
}
