package org.primefaces.cookbook.model.chapter3;

import java.io.Serializable;

/**
 * User: mertcaliskan
 * Date: 7/9/12
 */
public class Car implements Serializable {
    
    private String name;

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
