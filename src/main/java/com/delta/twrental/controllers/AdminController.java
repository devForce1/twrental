package com.delta.twrental.controllers;


import com.delta.twrental.entities.Booking;
import com.delta.twrental.entities.Car;
import com.delta.twrental.entities.Customer;
import com.delta.twrental.services.BookingServices;
import com.delta.twrental.services.CarServices;
import com.delta.twrental.services.CustomerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AdminController {
    //properties
    @Autowired
    private CustomerServices customerServices;

    @Autowired
    private BookingServices bookingServices;

    @Autowired
    private CarServices carServices;

    //(GET) list customers /api/v1/customers
    @GetMapping("/api/v1/customers")
    public List<Customer> getAllCustomers() {
        return customerServices.getAllCustomers();
    }

    //(GET) get all cars /api/v1/allcars

    @RequestMapping(value = "/api/v1/allcars", method = RequestMethod.GET)
    public List<Car> getAllCars() {
        return carServices.getAllCars();
    }

    //(GET) list booking /api/v1/orders
    @GetMapping("/api/v1/orders")
    public List<Booking> getAllBooking() {
        return bookingServices.getAllBookings();
    }

    //(POST) add car /api/v1/addcar
    @PostMapping("/api/v1/addcar")
    public ResponseEntity<Car> addCar(@RequestBody Car car) {
        return new ResponseEntity<>(carServices.addCar(car), HttpStatus.OK);
    }

    //(POST) add customer /api/v1/addcustomer
    @PostMapping("/api/v1/addcustomer")
    public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer) {
        return new ResponseEntity<>(customerServices.addCustomer(customer), HttpStatus.OK);
    }

    //(PUT) update car /api/v1/updatecar
    @PutMapping("/api/v1/updatecar")
    public ResponseEntity<Car> updateCar(@PathVariable("id") int id, @RequestBody Car car) {
        return ResponseEntity.ok(carServices.updateCar(car,id));
    }

    //(PUT) update customer /api/v1/updatecustomer
    @PutMapping("/api/v1/updatecustomer")
    public ResponseEntity<Customer> updateCustomer(@PathVariable("id") int id, @RequestBody Customer customer) {
        return ResponseEntity.ok(customerServices.updateCustomer(customer, id));
    }

    //(DELETE) delete car /api/v1/deletecar
    @DeleteMapping("/api/v1/deletecar/{id}")
    public ResponseEntity<String> deleteCar(@PathVariable("id") int id) {
        customerServices.deleteCustomer(id);
        return new ResponseEntity<>("Car deleted from database", HttpStatus.OK);
    }

    //(DELETE) delete customer /api/v1/deletecustomer
    @DeleteMapping("/api/v1/deletecustomer/{id}")
    public ResponseEntity<String> deleteCustomer(@PathVariable("id") int id) {
        customerServices.deleteCustomer(id);
        return new ResponseEntity<>("Customer deleted from database", HttpStatus.OK);
    }

    //(DELETE) delete booking /api/v1/deleteorder
    @DeleteMapping("/api/v1/deleteorder/{id}")
    public ResponseEntity<String> deleteBooking(@PathVariable("id") int id) {
        bookingServices.deleteBooking(id);
        return new ResponseEntity<>("Booking deleted from database", HttpStatus.OK);
    }
}
