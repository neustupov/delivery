package org.neustupov.delivery.app.repository.order;

import org.neustupov.delivery.app.model.entity.order.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {

}
