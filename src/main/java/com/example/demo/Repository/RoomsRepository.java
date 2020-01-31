package com.example.demo.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Entity.Rooms;

public interface RoomsRepository extends CrudRepository<Rooms, Integer> {

}
