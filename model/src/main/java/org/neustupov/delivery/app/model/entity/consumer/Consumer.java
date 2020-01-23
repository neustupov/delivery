package org.neustupov.delivery.app.model.entity.consumer;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.neustupov.delivery.app.model.entity.base.AbstractEntity;
import org.neustupov.delivery.app.model.entity.delivery.DeliveryInfo;

@Data
@Entity
@Table(name = "CONSUMER")
@EqualsAndHashCode(callSuper=true)
public class Consumer extends AbstractEntity {

  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "PAYMENT_INFO")
  private PaymentInfo paymentInfo;

  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "DELIVERY_INFO")
  private DeliveryInfo deliveryInfo;
}
