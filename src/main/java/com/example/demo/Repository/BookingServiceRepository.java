package com.example.demo.Repository;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.Entity.BookingService;


public interface BookingServiceRepository extends CrudRepository<BookingService,Integer> {
}