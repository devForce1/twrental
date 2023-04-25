package com.delta.twrental.entities;

import jakarta.persistence.*;

@Entity
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "car_id")
    private Car car;

    @Column(name = "timeOfBooking")
    private String timeOfBooking;

    @Column(name = "nrOfDays")
    private int nrOfDays;

    //CONSTRUCTORS

    public Booking() {
    }

    public Booking(int id, Customer customer, String timeOfBooking, int nrOfDays) {
        this.id = id;
        this.customer = customer;
        this.timeOfBooking = timeOfBooking;
        this.nrOfDays = nrOfDays;
    }

    //GETTERS

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public String getTimeOfBooking() {
        return timeOfBooking;
    }

    public int getNrOfDays() {
        return nrOfDays;
    }

    //SETTERS

    public void setId(int id) {
        this.id = id;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setTimeOfBooking(String timeOfBooking) {
        this.timeOfBooking = timeOfBooking;
    }

    public void setNrOfDays(int nrOfDays) {
        this.nrOfDays = nrOfDays;
    }

    //toString

    @Override
    public String toString() {
        return "Booking{" +
                "id=" + id +
                ", customer=" + customer +
                ", timeOfBooking='" + timeOfBooking + '\'' +
                ", nrOfDays=" + nrOfDays +
                '}';
    }
}
