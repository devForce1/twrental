package com.delta.twrental.services;

import com.delta.twrental.entities.Booking;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingServiceInterface {

    Booking createBooking (Booking booking);

    List<Booking> getAllBookings();

    List<Booking> getBookingByCustomer(int id);

    void deleteBooking(int id);
}
