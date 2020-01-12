package org.neustupov.delivery.app.model.entity.base;

import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.neustupov.delivery.app.model.entity.consumer.Consumer;

@Data
@Entity
@EqualsAndHashCode
public abstract class AbstractEntity {

  @Id
  @GeneratedValue
  private Long id;
  private LocalDateTime createdAt;
  private LocalDateTime modifiedAt;
  private Consumer createdBy;
  private Consumer modifiedBy;
}
