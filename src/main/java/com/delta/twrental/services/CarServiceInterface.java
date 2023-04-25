package com.delta.twrental.services;

import com.delta.twrental.entities.Car;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface CarServiceInterface {

    Car addCar(Car car);

    List<Car> getAllCars();

    Car updateCar(Car car, int id);

    List<Car> getAvailbleCars();

    void deleteCar(int id);
}
