package org.neustupov.delivery.app.model.entity.consumer;

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
@Table(name = "PAYMENT_INFO")
@EqualsAndHashCode(callSuper=true)
public class PaymentInfo extends AbstractEntity {

  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "CREDIT_CARD")
  private CreditCard creditCard;
}
