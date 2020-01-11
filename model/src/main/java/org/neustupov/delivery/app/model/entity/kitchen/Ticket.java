package org.neustupov.delivery.app.model.entity.kitchen;

import java.time.LocalDateTime;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.neustupov.delivery.app.model.entity.base.AbstractEntity;

@Data
@EqualsAndHashCode(callSuper = true)
public class Ticket extends AbstractEntity {

  private int statusId;
  private LocalDateTime requestedDeliveryTime;
  private LocalDateTime preparedByTime;
}
