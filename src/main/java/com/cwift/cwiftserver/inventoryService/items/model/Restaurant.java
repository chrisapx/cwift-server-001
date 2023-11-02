package com.cwift.cwiftserver.inventoryService.items.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Blob;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private Blob profilePic;
    private Blob coverPage;
    private boolean verified;
    private float rating;
    @OneToMany
    private List<Reviews> reviews;
    private String deliveryTime;
    private boolean freeDelivery;
    private double deliveryFee;

//    add address of the Cafe
}
