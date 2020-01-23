package org.neustupov.delivery.app.repository.order;

import org.neustupov.delivery.app.model.entity.order.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
