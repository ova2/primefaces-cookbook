package org.primefaces.cookbook.model.chapter12;

import java.io.Serializable;

import java.text.SimpleDateFormat;

import java.util.Date;


/**
 * BookProperty
 *
 * @author Oleg Varaksin / last modified by $Author: $
 * @version $Revision: 1.0 $
 */
public class BookProperty implements Serializable {

    private static final long serialVersionUID = 20120521L;

    private String name;
    private Object value;
    private boolean required;

    public BookProperty(String name, boolean required) {
        this.name = name;
        this.required = required;
    }

    public BookProperty(String name, Object value, boolean required) {
        this.name = name;
        this.value = value;
        this.required = required;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getValue() {
        return value;
    }

    public Object getFormattedValue() {
        if (value instanceof Date) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("d MMM yyyy");

            return simpleDateFormat.format(value);
        }

        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public boolean isRequired() {
        return required;
    }

    public void setRequired(boolean required) {
        this.required = required;
    }
}
