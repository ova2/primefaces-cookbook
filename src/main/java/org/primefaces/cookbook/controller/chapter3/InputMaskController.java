package org.primefaces.cookbook.controller.chapter3;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;

/**
 * User: mertcaliskan
 * Date: 6/11/12
 */
@ManagedBean
@ViewScoped
public class InputMaskController implements Serializable {

    private String phone;
    private String phoneExt;
    private String productKey;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhoneExt() {
        return phoneExt;
    }

    public void setPhoneExt(String phoneExt) {
        this.phoneExt = phoneExt;
    }

    public String getProductKey() {
        return productKey;
    }

    public void setProductKey(String productKey) {
        this.productKey = productKey;
    }
}