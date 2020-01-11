package org.neustupov.delivery.app.model.entity.common;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.neustupov.delivery.app.model.entity.base.AbstractEntity;

@Data
@EqualsAndHashCode(callSuper = true)
public class Status extends AbstractEntity {

  private String status;
}
