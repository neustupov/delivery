package org.neustupov.delivery.app.model.entity.restaurant;

import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.neustupov.delivery.app.model.entity.base.AbstractEntity;

@Data
@AllArgsConstructor
@Entity
@MappedSuperclass
@EqualsAndHashCode(callSuper=true)
public class MenuItem extends AbstractEntity {

  private String name;
  private int price;
}
