package org.primefaces.cookbook.model.chapter5;

import java.io.Serializable;

/**
 * User: mertcaliskan
 * Date: 8/31/12
 */
public class TreeTableElement implements Serializable {
    
    private String name;
    private String column1;
    private String column2;

    public TreeTableElement(String name, String column1, String column2) {
        this.name = name;
        this.column1 = column1;
        this.column2 = column2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColumn1() {
        return column1;
    }

    public void setColumn1(String column1) {
        this.column1 = column1;
    }

    public String getColumn2() {
        return column2;
    }

    public void setColumn2(String column2) {
        this.column2 = column2;
    }
}