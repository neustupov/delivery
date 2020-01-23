package org.neustupov.delivery.app.model.entity.delivery;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
@EqualsAndHashCode
public class Address {

  @Column(name = "STREET", length = 32)
  private String street;

  @Column(name = "CITY", length = 32)
  private String city;

  @Column(name = "STATE", length = 32)
  private String state;

  @Column(name = "ZIP_CODE", length = 10)
  private int zip;
}
