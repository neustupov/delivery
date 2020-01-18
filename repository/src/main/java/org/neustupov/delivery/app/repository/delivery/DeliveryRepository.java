package org.neustupov.delivery.app.repository.delivery;

import org.neustupov.delivery.app.model.entity.delivery.DeliveryInfo;
import org.springframework.data.repository.CrudRepository;

public interface DeliveryRepository extends CrudRepository<DeliveryInfo, Long> {

}
