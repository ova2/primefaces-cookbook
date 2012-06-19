package org.primefaces.cookbook.controller.chapter3;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.util.ArrayList;
import java.util.List;

/**
 * User: mertcaliskan
 * Date: 6/11/12
 */
@ManagedBean
@ViewScoped
public class AutoCompleteController {
    
    private String txt1;

    public List<String> complete(String input) {
        List<String> result = new ArrayList<String>();

        for (int i = 0; i < 10; i++) {
            result.add(input + i);
        }

        return result;
    }
    public String getTxt1() {
        return txt1;
    }

    public void setTxt1(String txt1) {
        this.txt1 = txt1;
    }
}
