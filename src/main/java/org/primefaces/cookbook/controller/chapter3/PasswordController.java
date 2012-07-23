package org.primefaces.cookbook.controller.chapter3;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;

/**
 * User: mertcaliskan
 * Date: 7/19/12
 */
@ManagedBean
@ViewScoped
public class PasswordController implements Serializable {
    
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
