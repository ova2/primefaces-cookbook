package org.primefaces.cookbook.model.chapter5;

import java.io.Serializable;

/**
 * User: mertcaliskan
 * Date: 7/9/12
 */
public class DetailedCar implements Serializable {

    public String name;
    public int year;
    private String color;
    private int seatNumber;

    public DetailedCar(String name, int year, String color, int seatNumber) {
        this.name = name;
        this.year = year;
        this.color = color;
        this.seatNumber = seatNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    @Override
    public String toString() {
        return getName();
    }
}