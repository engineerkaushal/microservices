package com.micro.hotelservice.service;

import com.micro.hotelservice.entity.Hotel;

import java.util.List;

public interface HotelService {
    //create

    Hotel create(Hotel hotel);

    //get all
    List<Hotel> getAll();

    //get single
    Hotel get(String id) throws Throwable;
}
