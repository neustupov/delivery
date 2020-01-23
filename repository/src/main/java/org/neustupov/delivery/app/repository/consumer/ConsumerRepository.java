package org.neustupov.delivery.app.repository.consumer;

import org.neustupov.delivery.app.model.entity.consumer.Consumer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsumerRepository extends JpaRepository<Consumer, Long> {

}
