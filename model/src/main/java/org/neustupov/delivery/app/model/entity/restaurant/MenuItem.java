package org.neustupov.delivery.app.model.entity.restaurant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.neustupov.delivery.app.model.entity.base.AbstractEntity;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "MENU_ITEM")
@EqualsAndHashCode(callSuper=true)
public class MenuItem extends AbstractEntity {

  @Column(nullable=false)
  private String name;

  @Column(nullable=false)
  private int price;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "ID", insertable=false, updatable=false)
  private Restaurant restaurant;

  public MenuItem(String name, int price) {
    this.name = name;
    this.price = price;
  }
}
