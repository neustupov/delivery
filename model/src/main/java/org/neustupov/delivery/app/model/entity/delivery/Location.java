package org.neustupov.delivery.app.model.entity.delivery;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.neustupov.delivery.app.model.entity.base.AbstractEntity;

@Data
@Embeddable
@EqualsAndHashCode(callSuper=true)
public class Location extends AbstractEntity {

  @Column(nullable=false, name="LAT")
  private String lat;

  @Column(nullable=false, name="LON")
  private String ion;
}
