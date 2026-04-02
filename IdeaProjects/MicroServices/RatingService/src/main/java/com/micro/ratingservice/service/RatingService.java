package com.micro.ratingservice.service;

import com.micro.ratingservice.entity.Rating;

import java.util.List;

public interface RatingService {
    //create
    Rating create(Rating rating);


    //get all ratings
    List<Rating> getRatings();

    //get all by UserId
    List<Rating> getRatingByUserId(String userId);

    //get all by hotel
    List<Rating> getRatingByHotelId(String hotelId);
}
