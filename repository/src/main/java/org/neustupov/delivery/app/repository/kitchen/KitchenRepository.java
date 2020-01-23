package org.neustupov.delivery.app.repository.kitchen;

import org.neustupov.delivery.app.model.entity.kitchen.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KitchenRepository extends JpaRepository<Ticket, Long> {

}
