package com.cwift.cwiftserver.inventoryService.items.service;

import com.cwift.cwiftserver.inventoryService.items.model.Restaurant;
import com.cwift.cwiftserver.inventoryService.items.repository.RestaurantRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class RestaurantService {

    private final RestaurantRepository restaurantRepository;

    public Restaurant addRestaurant(Restaurant restaurant){
        return restaurantRepository.save ( restaurant );
    }

//    public Restaurant editRestaurant(long id, Restaurant restaurant){
//        return restaurantRepository.save ( restaurant );
//    }

    public void deleteRestaurant(long id){
        restaurantRepository.deleteById ( id );
    }

    public Restaurant viewRestaurant(long id){
        return restaurantRepository.findById ( id ).get ();
    }

    public List<Restaurant> findAll(){
        return restaurantRepository.findAll ();
    }
}
