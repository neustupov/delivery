package org.neustupov.delivery.app.model.entity.consumer;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.neustupov.delivery.app.model.entity.base.AbstractEntity;
import org.neustupov.delivery.app.model.entity.delivery.DeliveryInfo;

@Data
@EqualsAndHashCode(callSuper=true)
public class Consumer extends AbstractEntity {

  private PaymentInfo paymentInfo;
  private DeliveryInfo deliveryInfo;
}
