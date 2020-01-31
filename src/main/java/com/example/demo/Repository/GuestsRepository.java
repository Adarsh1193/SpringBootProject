package com.example.demo.Repository;

import org.springframework.data.repository.CrudRepository;
import com.example.demo.Entity.Guests;

public interface GuestsRepository extends CrudRepository<Guests, Integer>{

}
