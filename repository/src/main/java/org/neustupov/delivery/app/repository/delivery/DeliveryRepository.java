package org.neustupov.delivery.app.repository.delivery;

import org.neustupov.delivery.app.model.entity.delivery.DeliveryInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeliveryRepository extends JpaRepository<DeliveryInfo, Long> {

}
