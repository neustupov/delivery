package org.neustupov.delivery.app.model.entity.order;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.neustupov.delivery.app.model.entity.base.AbstractEntity;
import org.neustupov.delivery.app.model.entity.consumer.PaymentInfo;
import org.neustupov.delivery.app.model.entity.delivery.DeliveryInfo;

@Data
@Entity
@MappedSuperclass
@EqualsAndHashCode(callSuper=true)
public class Order extends AbstractEntity {

  private String state;
  private Long consumerId;
  private Long restaurantId;
  private PaymentInfo paymentInfo;
  private DeliveryInfo deliveryInfo;
  private Set<OrderLineItem> orderLineItems;
}
