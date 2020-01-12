package org.neustupov.delivery.app.model.entity.kitchen;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.neustupov.delivery.app.model.entity.base.AbstractEntity;
import org.neustupov.delivery.app.model.entity.common.Status;

@Data
@NoArgsConstructor
@Entity
@Table(name = "TICKET")
@EqualsAndHashCode(callSuper = true)
public class Ticket extends AbstractEntity {

  @Enumerated
  @Column(nullable=false, name="STATUS")
  private Status status;

  @Column(nullable=false, name="REQUESTED_DELIVERY_TIME")
  private LocalDateTime requestedDeliveryTime;

  @Column(nullable=false, name="PREPARED_BY_TIME")
  private LocalDateTime preparedByTime;

  @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "ticket", orphanRemoval = true)
  private Set<TicketLineItem> ticketLineItems;

  public void addTicket(TicketLineItem ticketLineItem){
    if(ticketLineItems == null){
      ticketLineItems = new HashSet<>();
    }
    ticketLineItems.add(ticketLineItem);
  }
}
