package org.neustupov.delivery.app.model.entity.restaurant;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.neustupov.delivery.app.model.entity.base.AbstractEntity;

@Data
@EqualsAndHashCode(callSuper=true)
public class MenuItem extends AbstractEntity {

  private String name;
  private int price;

  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "ID")
  private Restaurant restaurant;
}
