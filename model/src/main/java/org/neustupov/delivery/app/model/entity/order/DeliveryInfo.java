package org.neustupov.delivery.app.model.entity.order;

import java.time.LocalDateTime;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.neustupov.delivery.app.model.entity.base.AbstractEntity;

@Data
@EqualsAndHashCode(callSuper=true)
public class DeliveryInfo extends AbstractEntity {

  private LocalDateTime deliveryTime;
}
