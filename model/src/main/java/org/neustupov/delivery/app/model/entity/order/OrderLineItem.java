package org.neustupov.delivery.app.model.entity.order;

import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.neustupov.delivery.app.model.entity.base.AbstractEntity;

@Data
@Entity
@MappedSuperclass
@EqualsAndHashCode(callSuper=true)
public class OrderLineItem extends AbstractEntity {

  private int quantity;
  private String name;
}
