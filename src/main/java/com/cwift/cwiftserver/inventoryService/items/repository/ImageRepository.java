package com.cwift.cwiftserver.inventoryService.items.repository;

import com.cwift.cwiftserver.inventoryService.items.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Long> {
}
