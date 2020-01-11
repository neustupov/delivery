package org.neustupov.delivery.app.model.entity.delivery;

import java.time.LocalDateTime;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.neustupov.delivery.app.model.entity.base.AbstractEntity;

@Data
@EqualsAndHashCode(callSuper=true)
public class DeliveryInfo extends AbstractEntity {

  private Long consumerId;
  private Courier courier;
  private LocalDateTime deliveryTime;
  private Address address;
}
