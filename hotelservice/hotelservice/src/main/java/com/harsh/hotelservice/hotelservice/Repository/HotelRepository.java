package com.harsh.hotelservice.hotelservice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.harsh.hotelservice.hotelservice.Entity.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, String> {
    
}
