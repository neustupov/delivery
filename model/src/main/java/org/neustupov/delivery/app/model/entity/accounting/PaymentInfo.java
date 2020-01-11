package org.neustupov.delivery.app.model.entity.accounting;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.neustupov.delivery.app.model.entity.base.AbstractEntity;

@Data
@EqualsAndHashCode(callSuper=true)
public class PaymentInfo extends AbstractEntity {

  private int creditCardId;
}
