package org.neustupov.delivery.app.model.entity.restaurant;

import java.util.Set;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.neustupov.delivery.app.model.entity.base.AbstractEntity;

@Data
@EqualsAndHashCode(callSuper=true)
public class Restaurant extends AbstractEntity {

  private String name;
  private Long addressId;
  private Set<MenuItem> menuItems;
}
