package com.cwift.cwiftserver.inventoryService.items.repository;

import com.cwift.cwiftserver.inventoryService.items.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
}
