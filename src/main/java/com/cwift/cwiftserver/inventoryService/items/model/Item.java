package com.cwift.cwiftserver.inventoryService.items.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.sql.Blob;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private double price;
    private float rating;
    @OneToMany
    private List<Reviews> reviews;
    private String restaurant;
    @OneToOne
    private Image coverPic;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Image> image;
    private int orderQuantity;
    private String quantity;

    private boolean featured;
    private int clicks;
}
