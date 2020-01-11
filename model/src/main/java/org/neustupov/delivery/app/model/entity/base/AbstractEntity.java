package org.neustupov.delivery.app.model.entity.base;

import java.time.LocalDateTime;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.neustupov.delivery.app.model.entity.accounting.Consumer;

@Data
@EqualsAndHashCode
public abstract class AbstractEntity {

  private int id;
  private LocalDateTime createdAt;
  private LocalDateTime modifiedAt;
  private Consumer createdBy;
  private Consumer modifiedBy;
}
