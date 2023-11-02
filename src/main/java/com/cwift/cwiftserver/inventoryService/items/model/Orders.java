package com.cwift.cwiftserver.inventoryService.items.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String orderID;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Item> itemList;
    private Status status;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Reviews> reviews;
    private String additionalInfo;
//    private String
}
