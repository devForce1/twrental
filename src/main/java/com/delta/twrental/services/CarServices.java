package com.delta.twrental.services;

import com.delta.twrental.entities.Car;
import com.delta.twrental.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServices implements CarServiceInterface {
    @Autowired
    private CarRepository carRepository;

    @Override
    public Car addCar(Car car) {
        return carRepository.save(car);
    }

    @Override
    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    @Override
    public List<Car> getAvailbleCars() {
        return carRepository.findByAvailable(false);
    }

    @Override
    public Car updateCar(Car car, int id) {
        Car c = carRepository.findById(id).orElseThrow(() -> new RuntimeException());
        c.setPricePerDay(car.getPricePerDay());
        c.setMake(car.getMake());
        c.setModel(car.getModel());
        c.setRegNr(car.getRegNr());
        c.setBooked(car.getBooked());
        carRepository.save(c);

        return c;
    }


    @Override
    public void deleteCar(int id) {
        carRepository.findById(id).orElseThrow(() -> new RuntimeException());
        carRepository.deleteById(id);
    }
}
