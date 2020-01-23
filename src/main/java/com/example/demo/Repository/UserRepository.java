package com.example.demo.Repository;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.Entity.User;
import com.example.demo.Entity.BookingRoom;

public interface UserRepository extends CrudRepository<User,Integer> {
}