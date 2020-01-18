package org.neustupov.delivery.app.repository.kitchen;

import org.neustupov.delivery.app.model.entity.kitchen.Ticket;
import org.springframework.data.repository.CrudRepository;

public interface KitchenRepository extends CrudRepository<Ticket, Long> {

}
