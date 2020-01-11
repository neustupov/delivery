package org.neustupov.delivery.app.model.entity.delivery;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.neustupov.delivery.app.model.entity.base.AbstractEntity;

@Data
@EqualsAndHashCode(callSuper=true)
public class Location extends AbstractEntity {

  private String lat;
  private String ion;
}