package org.neustupov.delivery.app.model.entity.restaurant;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.neustupov.delivery.app.model.entity.base.AbstractEntity;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "RESTAURANT")
@EqualsAndHashCode(callSuper=true)
public class Restaurant extends AbstractEntity {

  @Column(nullable=false, name="NAME")
  private String name;

  @Column(nullable=false, name="ADDRESS_ID")
  private Long addressId;

  @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "restaurant", orphanRemoval = true)
  private Set<MenuItem> menuItems;

  public void addMenuItem(MenuItem menuItem){
    if(menuItems == null){
      menuItems = new HashSet<>();
    }
    menuItems.add(menuItem);
  }
}
