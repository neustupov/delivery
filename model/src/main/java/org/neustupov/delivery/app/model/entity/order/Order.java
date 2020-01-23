package org.neustupov.delivery.app.model.entity.order;

import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.neustupov.delivery.app.model.entity.base.AbstractEntity;
import org.neustupov.delivery.app.model.entity.common.Status;
import org.neustupov.delivery.app.model.entity.consumer.PaymentInfo;
import org.neustupov.delivery.app.model.entity.delivery.DeliveryInfo;

@Data
@Entity
@Table(name = "ORDERS")
@EqualsAndHashCode(callSuper=true)
public class Order extends AbstractEntity {

  @Enumerated
  @Column(nullable=false, name="STATUS")
  private Status status;

  @Column(nullable=false, name="CONSUMER_ID")
  private Long consumerId;

  @Column(nullable=false, name="RESTAURANT_ID")
  private Long restaurantId;

  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "PAYMENT_INFO")
  private PaymentInfo paymentInfo;

  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "DELIVERY_INFO")
  private DeliveryInfo deliveryInfo;

  @ElementCollection
  private Set<OrderLineItem> orderLineItems;
}
