package org.neustupov.delivery.app.model.entity.base;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.neustupov.delivery.app.model.entity.consumer.Consumer;

@Data
@EqualsAndHashCode
@MappedSuperclass
public abstract class AbstractEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID")
  private Long id;

  @Column(name = "CREATED_AT", nullable = false, updatable = false)
  private LocalDateTime createdAt;

  @Column(name = "MODIFIED_AT", insertable = false)
  private LocalDateTime modifiedAt;

  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "CREATED_BY", updatable = false)
  private Consumer createdBy;

  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "MODIFIED_BY", insertable = false)
  private Consumer modifiedBy;
}
