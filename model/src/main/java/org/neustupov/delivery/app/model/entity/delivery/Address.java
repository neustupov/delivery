package org.neustupov.delivery.app.model.entity.delivery;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.neustupov.delivery.app.model.entity.base.AbstractEntity;

@Getter
@Setter
@EqualsAndHashCode
@Embeddable
public class Address {

  public Address() {
  }

  @Column(name = "STREET", length = 32)
  private String street;

  @Column(name = "CITY", length = 32)
  private String city;

  @Column(name = "STATE", length = 32)
  private String state;

  @Column(name = "ZIP_CODE", length = 10)
  private int zip;
}
