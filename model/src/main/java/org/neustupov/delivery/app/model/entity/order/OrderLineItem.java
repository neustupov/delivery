package org.neustupov.delivery.app.model.entity.order;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.neustupov.delivery.app.model.entity.base.AbstractEntity;

@Data
@EqualsAndHashCode(callSuper=true)
public class OrderLineItem extends AbstractEntity {

  private int quantity;
}
