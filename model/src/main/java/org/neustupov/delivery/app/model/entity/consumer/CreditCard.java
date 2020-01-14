package org.neustupov.delivery.app.model.entity.consumer;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.neustupov.delivery.app.model.entity.base.AbstractEntity;

@Data
@Entity
@Table(name = "CREDIT_CARD")
@EqualsAndHashCode(callSuper = true)
public class CreditCard extends AbstractEntity {

  @Column(nullable=false, name="BANK")
  private String bank;

  @Column(nullable=false, name="NUMBER")
  private int number;

  @Column(nullable=false, name="HOLDER_NAME")
  private String holderName;

  @Column(nullable=false, name="HOLDER_SURNAME")
  private String holderSurname;

  @Column(nullable=false, name="DATE")
  private Date date;
}
