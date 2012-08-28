package org.primefaces.cookbook.model.chapter3;

import java.io.Serializable;

/**
 * User: mertcaliskan
 * Date: 7/9/12
 */
public class Car implements Serializable {
    
    private String name;
    private int year;

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
}