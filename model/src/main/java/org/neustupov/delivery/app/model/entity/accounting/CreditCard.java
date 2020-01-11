package org.neustupov.delivery.app.model.entity.accounting;

import java.util.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.neustupov.delivery.app.model.entity.base.AbstractEntity;

@Data
@EqualsAndHashCode(callSuper = true)
public class CreditCard extends AbstractEntity {

  private int number;
  private String holderName;
  private String holderSurname;
  private Date date;
}
