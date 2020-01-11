package org.neustupov.delivery.app.model.entity.kitchen;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.neustupov.delivery.app.model.entity.base.AbstractEntity;

@Data
@EqualsAndHashCode(callSuper = true)
public class TicketLineItem extends AbstractEntity {

  private int quantity;
  private String item;
}
