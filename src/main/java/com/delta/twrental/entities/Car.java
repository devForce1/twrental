package com.delta.twrental.entities;

import jakarta.persistence.*;

@Entity
public class Car {
    //properties

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "car_id")
    private int id;

    @Column(name = "pricePerDay")
    private int pricePerDay;

    @Column(name = "make")
    private String make;

    @Column(name = "model")
    private String model;

    @Column(name = "regNr")
    private String regNr;

    @Column(name = "isBooked")
    private boolean isBooked;

    //constructors


    public Car() {
    }

    public Car(int id, int pricePerDay, String make, String model, String regNr, boolean isBooked) {
        this.id = id;
        this.pricePerDay = pricePerDay;
        this.make = make;
        this.model = model;
        this.regNr = regNr;
        this.isBooked = isBooked;
    }

    //setters & getters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(int pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRegNr() {
        return regNr;
    }

    public void setRegNr(String regNr) {
        this.regNr = regNr;
    }

    public boolean getBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }

    //toString


    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", pricePerDay=" + pricePerDay +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", regNr='" + regNr + '\'' +
                ", isBooked=" + isBooked +
                '}';
    }
}
