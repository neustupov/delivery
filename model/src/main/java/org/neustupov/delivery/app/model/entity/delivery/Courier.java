package org.neustupov.delivery.app.model.entity.delivery;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.neustupov.delivery.app.model.entity.base.AbstractEntity;

@Data
@Entity
@Table(name = "COURIER")
@EqualsAndHashCode(callSuper=true)
public class Courier extends AbstractEntity {

  @Column(nullable=false, name="AVAILABLE")
  private boolean available;

  @Embedded
  private Location location;
}
