package org.primefaces.cookbook.controller.chapter3;

import org.primefaces.component.layout.LayoutUnit;
import org.primefaces.cookbook.utils.MessageUtil;
import org.primefaces.event.SelectEvent;

import javax.faces.event.AjaxBehaviorEvent;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

/**
 * Created by mertcaliskan
 * on 03/01/15.
 */
@Named
@ViewScoped
public class InplaceBean implements Serializable {
    private boolean value;

    public boolean isValue() {
        return value;
    }

    public void setValue(boolean value) {
        this.value = value;
    }

    public void handleSave(AjaxBehaviorEvent event) {
        MessageUtil.addInfoMessageWithoutKey("Input Saved!", null);
    }
}

