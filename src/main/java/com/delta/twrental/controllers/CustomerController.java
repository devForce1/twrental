package com.delta.twrental.controllers;

import com.delta.twrental.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private BookingServices bookingServices;

    @Autowired
    private  CarServices carServices;

    @GetMapping("/api/v1/cars")
    public List<Car> getAllAvailableCars(); {
        return carServices.getCars();
    }

    @PostMapping("/api/v1/ordercar")
    public List<Car> OrderCar();{
        return carServices.getCars();
    }

    @PutMapping("/api/v1/cancelorder")
    public List<Car> CancelCarOrder(); {
        return carServices.getCars();
    }

    @GetMapping("api/v1/myorders") {
        return null;
    }


}
