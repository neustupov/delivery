package org.neustupov.delivery.app.model.entity.restaurant;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.neustupov.delivery.app.model.entity.base.AbstractEntity;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@MappedSuperclass
@EqualsAndHashCode(callSuper=true)
public class Restaurant extends AbstractEntity {

  private String name;
  private Long addressId;
  private Set<MenuItem> menuItems;

  public void addMenuItem(MenuItem menuItem){
    if(menuItems == null){
      menuItems = new HashSet<>();
    }
    menuItems.add(menuItem);
  }
}
