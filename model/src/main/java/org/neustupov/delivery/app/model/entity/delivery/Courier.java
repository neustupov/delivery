package org.neustupov.delivery.app.model.entity.delivery;

import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.neustupov.delivery.app.model.entity.base.AbstractEntity;

@Data
@Entity
@MappedSuperclass
@EqualsAndHashCode(callSuper=true)
public class Courier extends AbstractEntity {

  private boolean available;
  private Long locationId;
}
