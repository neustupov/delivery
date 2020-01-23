package org.neustupov.delivery.app.model.entity.delivery;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.neustupov.delivery.app.model.entity.base.AbstractEntity;

@Data
@Entity
@Table(name = "DELIVERY_INFO")
@EqualsAndHashCode(callSuper=true)
public class DeliveryInfo extends AbstractEntity {

  @Column(nullable=false)
  private Long consumerId;

  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "COURIER")
  private Courier courier;

  @Column(nullable=false, name="DELIVERY_TIME")
  private LocalDateTime deliveryTime;

  @Embedded
  private Address address;
}
