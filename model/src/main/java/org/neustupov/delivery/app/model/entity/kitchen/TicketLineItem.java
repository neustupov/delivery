package org.neustupov.delivery.app.model.entity.kitchen;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.neustupov.delivery.app.model.entity.base.AbstractEntity;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TICKET_LINE_ITEM")
@EqualsAndHashCode(callSuper = true)
public class TicketLineItem extends AbstractEntity {

  @Column(nullable=false, name="QUANTITY")
  private int quantity;

  @Column(nullable=false, name="ITEM")
  private String item;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "ID", insertable=false, updatable=false)
  private Ticket ticket;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "ID", insertable=false, updatable=false)
  private TicketLineItem ticketLineItem;
}
