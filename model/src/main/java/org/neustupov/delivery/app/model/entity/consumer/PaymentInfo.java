package org.neustupov.delivery.app.model.entity.consumer;

import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.neustupov.delivery.app.model.entity.base.AbstractEntity;

@Data
@Entity
@MappedSuperclass
@EqualsAndHashCode(callSuper=true)
public class PaymentInfo extends AbstractEntity {

  private CreditCard creditCard;
}
