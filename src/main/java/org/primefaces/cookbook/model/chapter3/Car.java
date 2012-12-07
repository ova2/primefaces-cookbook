package org.primefaces.cookbook.model.chapter3;

import java.io.Serializable;

/**
 * User: mertcaliskan
 * Date: 7/9/12
 */
public class Car implements Serializable {

    public String name;
    public int year;

    public Car(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return getName();
    }
}