package org.neustupov.delivery.app.model.entity.delivery;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.neustupov.delivery.app.model.entity.base.AbstractEntity;

@Data
@EqualsAndHashCode(callSuper=true)
public class Address extends AbstractEntity {

  private String street;
  private String city;
  private String state;
  private int zip;
}
