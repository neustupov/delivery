package org.neustupov.delivery.app.model.entity.delivery;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class Location {

  @Column(nullable=false, name="LAT")
  private String lat;

  @Column(nullable=false, name="LON")
  private String ion;
}
