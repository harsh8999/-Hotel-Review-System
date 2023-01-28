package com.harsh.ratingservice.ratingservice.Service;

import com.harsh.ratingservice.ratingservice.Dto.RatingDto;

import java.util.List;

public interface RatingService {
    
    // create
    RatingDto create(RatingDto ratingDto);

    // get all ratings
    List<RatingDto> getRatings();

    // get all by userId
    List<RatingDto> getRatingsByUserId(String userId);

    // get all by hotelId
    List<RatingDto> getRatingByHotelId(String hotelId);
}
