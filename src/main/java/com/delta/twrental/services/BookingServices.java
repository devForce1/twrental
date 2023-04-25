package com.delta.twrental.services;

import com.delta.twrental.entities.Booking;
import com.delta.twrental.repositories.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingServices implements BookingServiceInterface {
    //properties

    @Autowired
    private BookingRepository bookingRepository;

    @Override
    public Booking createBooking(Booking booking) {
        return bookingRepository.save(booking);
    }

    @Override
    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }

    @Override
    public List<Booking> getBookingByCustomer(int id) {
        return bookingRepository.findByCustomer(id);
    }

    @Override
    public void deleteBooking(int id) {
        bookingRepository.findById(id).orElseThrow(() -> new RuntimeException());
        bookingRepository.deleteById(id);

    }
}
