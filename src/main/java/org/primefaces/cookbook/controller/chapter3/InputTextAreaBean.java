package org.primefaces.cookbook.controller.chapter3;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * User: mertcaliskan
 * Date: 6/25/12
 */
@Named
@ViewScoped
public class InputTextAreaBean implements Serializable {
    
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public List<String> complete(String query) {
        List<String> results = new ArrayList<String>();

        if(query.equals("PrimeFaces")) {
            results.add("PrimeFaces Rocks!!!");
            results.add("PrimeFaces has 100+ components.");
            results.add("PrimeFaces is lightweight.");
            results.add("PrimeFaces Cookbook is the best source for PrimeFaces!");
        }
        else {
            for(int i = 0; i < 10; i++) {
                results.add(query + i);
            }
        }

        return results;
    }
}
