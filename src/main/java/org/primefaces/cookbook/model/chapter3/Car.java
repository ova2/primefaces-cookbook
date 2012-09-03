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

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}