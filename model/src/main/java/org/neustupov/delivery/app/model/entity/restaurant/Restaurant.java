package org.neustupov.delivery.app.model.entity.restaurant;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.neustupov.delivery.app.model.entity.base.AbstractEntity;

@Data
@EqualsAndHashCode(callSuper=true)
public class Restaurant extends AbstractEntity {

  private String name;
  private Long addressId;
  @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "city", orphanRemoval = true)
  private Set<MenuItem> menuItems;

  public void addMenuItem(MenuItem menuItem){
    if(menuItems == null){
      menuItems = new HashSet<>();
    }
    menuItems.add(menuItem);
  }
}
