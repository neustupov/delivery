package org.neustupov.delivery.app.model.entity.consumer;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.neustupov.delivery.app.model.entity.base.AbstractEntity;

@Data
@Entity
@MappedSuperclass
@EqualsAndHashCode(callSuper = true)
public class CreditCard extends AbstractEntity {

  private String bank;
  private int number;
  private String holderName;
  private String holderSurname;
  private Date date;
}
