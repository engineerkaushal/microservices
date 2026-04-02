package com.micro.hotelservice.service.Impl;

import com.micro.hotelservice.entity.Hotel;
import com.micro.hotelservice.exception.ResourceNotFoundException;
import com.micro.hotelservice.repository.HotelRepository;
import com.micro.hotelservice.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelRepository repository;

    @Override
    public Hotel create(Hotel hotel) {
        String rendomKey = UUID.randomUUID().toString();
        hotel.setId(rendomKey);
        return (Hotel) repository.save(hotel);
    }

    @Override
    public List<Hotel> getAll() {
        return repository.findAll();
    }

    @Override
    public Hotel get(String id) throws Throwable {
        return (Hotel) repository.findById(id).orElseThrow(() -> new ResourceNotFoundException());
    }
}
