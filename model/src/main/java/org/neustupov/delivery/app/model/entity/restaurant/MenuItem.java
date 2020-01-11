package org.neustupov.delivery.app.model.entity.restaurant;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.neustupov.delivery.app.model.entity.base.AbstractEntity;

@Data
@EqualsAndHashCode(callSuper=true)
public class MenuItem extends AbstractEntity {

  private String name;
  private int price;
}
