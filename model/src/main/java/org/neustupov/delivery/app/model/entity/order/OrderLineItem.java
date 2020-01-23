package org.neustupov.delivery.app.model.entity.order;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.neustupov.delivery.app.model.entity.base.AbstractEntity;

@Data
@Entity
@Table(name = "ORDER_LINE_ITEM")
@EqualsAndHashCode(callSuper=true)
public class OrderLineItem extends AbstractEntity {

  @Column(nullable=false, name="QUANTITY")
  private int quantity;

  @Column(nullable=false, name="NAME")
  private String name;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "ID", insertable=false, updatable=false)
  private Order order;
}
