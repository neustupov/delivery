package org.neustupov.delivery.app.model.entity.consumer;

import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.neustupov.delivery.app.model.entity.base.AbstractEntity;
import org.neustupov.delivery.app.model.entity.delivery.DeliveryInfo;

@Data
@EqualsAndHashCode(callSuper=true)
@Entity
@Table(name = "CONSUMER")
public class Consumer extends AbstractEntity {

  private PaymentInfo paymentInfo;
  private DeliveryInfo deliveryInfo;
}
