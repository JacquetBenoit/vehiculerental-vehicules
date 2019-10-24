package com.vehiculerental.vehicules;

import javax.persistence.*;

@Entity
@Table(name = "vehicules")
public class VehiculeEntity implements Vehicule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String registrationNumber;

    private String brand;

    private String model;

    private String color;

    private int reservationPrice;

    private int kilometerPrice;

    private int fiscalHorsePower;

    public VehiculeEntity() {

    }


    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getRegistrationNumber() {
        return this.registrationNumber;
    }

    @Override
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    @Override
    public String getBrand() {
        return this.brand;
    }

    @Override
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public int getReservationPrice() {
        return this.reservationPrice;
    }

    @Override
    public void setReservationPrice(int reservationPrice) {
        this.reservationPrice = reservationPrice;
    }

    @Override
    public int getKilometerPrice() {
        return this.kilometerPrice;
    }

    @Override
    public void setKilometerPrice(int kilometerPrice) {
        this.kilometerPrice = kilometerPrice;
    }

    @Override
    public int getFiscalHorsepower() {
        return this.fiscalHorsePower;
    }

    @Override
    public void setFiscalHorsepower(int fiscalHorsepower) {
        this.fiscalHorsePower = fiscalHorsepower;
    }
}
