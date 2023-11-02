package com.cwift.cwiftserver.inventoryService.items.repository;

import com.cwift.cwiftserver.inventoryService.items.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Orders, Long> {
}
