package com.delta.twrental.repositories;

import com.delta.twrental.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer> {
    @Query("SELECT c FROM Car c WHERE c.isBooked=?1")
    List<Car> findByAvailable(boolean isBooked);
}
