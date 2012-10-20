package org.primefaces.cookbook.controller.chapter12;

import org.primefaces.context.RequestContext;

import org.primefaces.cookbook.model.chapter12.BookProperty;

import org.primefaces.extensions.model.dynaform.DynaFormControl;
import org.primefaces.extensions.model.dynaform.DynaFormLabel;
import org.primefaces.extensions.model.dynaform.DynaFormModel;
import org.primefaces.extensions.model.dynaform.DynaFormRow;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;


/**
 * DynaFormController
 *
 * @author Oleg Varaksin / last modified by $Author: $
 * @version $Revision: 1.0 $
 */
@ManagedBean
@ViewScoped
public class DynaFormController implements Serializable {

    private static final long serialVersionUID = 20120423L;

    private static List<SelectItem> LANGUAGES = new ArrayList<SelectItem>();

    private DynaFormModel model;

    public DynaFormController() {
        model = new DynaFormModel();

        // add rows, labels and editable controls
        // set relationship between label and editable controls
        // to support outputLabel with "for" attribute

        // 1. row
        DynaFormRow row = model.createRegularRow();

        DynaFormLabel label11 = row.addLabel("Author", 1, 1);
        DynaFormControl control12 = row.addControl(new BookProperty("Author", true), "input", 1, 1);
        label11.setForControl(control12);

        DynaFormLabel label13 = row.addLabel("ISBN", 1, 1);
        DynaFormControl control14 = row.addControl(new BookProperty("ISBN", true), "input", 1, 1);
        label13.setForControl(control14);

        // 2. row
        row = model.createRegularRow();

        DynaFormLabel label21 = row.addLabel("Title", 1, 1);
        DynaFormControl control22 = row.addControl(new BookProperty("Title", false), "input", 3, 1);
        label21.setForControl(control22);

        // 3. row
        row = model.createRegularRow();

        DynaFormLabel label31 = row.addLabel("Publisher", 1, 1);
        DynaFormControl control32 = row.addControl(new BookProperty("Publisher", false), "input", 1, 1);
        label31.setForControl(control32);

        DynaFormLabel label33 = row.addLabel("Published on", 1, 1);
        DynaFormControl control34 = row.addControl(new BookProperty("Published on", false), "calendar", 1, 1);
        label33.setForControl(control34);

        // 4. row
        row = model.createRegularRow();

        DynaFormLabel label41 = row.addLabel("Language", 1, 1);
        DynaFormControl control42 = row.addControl(new BookProperty("Language", false), "select", 1, 1);
        label41.setForControl(control42);

        DynaFormLabel label43 = row.addLabel("Description", 1, 2);
        DynaFormControl control44 = row.addControl(new BookProperty("Description", false), "textarea", 1, 2);
        label43.setForControl(control44);

        // 5. row
        row = model.createRegularRow();

        DynaFormLabel label51 = row.addLabel("Rating", 1, 1);
        DynaFormControl control52 = row.addControl(new BookProperty("Rating", 3, true), "rating", 1, 1);
        label51.setForControl(control52);
    }

    public DynaFormModel getModel() {
        return model;
    }

    public List<BookProperty> getBookProperties() {
        if (model == null) {
            return null;
        }

        List<BookProperty> bookProperties = new ArrayList<BookProperty>();
        for (DynaFormControl dynaFormControl : model.getControls()) {
            bookProperties.add((BookProperty) dynaFormControl.getData());
        }

        return bookProperties;
    }

    public String submitForm() {
        FacesMessage.Severity sev = FacesContext.getCurrentInstance().getMaximumSeverity();
        boolean hasErrors = ((sev != null) && (FacesMessage.SEVERITY_ERROR.compareTo(sev) >= 0));

        RequestContext requestContext = RequestContext.getCurrentInstance();
        requestContext.addCallbackParam("isValid", !hasErrors);

        return null;
    }

    public List<SelectItem> getLanguages() {
        if (LANGUAGES.isEmpty()) {
            LANGUAGES.add(new SelectItem("en", "English"));
            LANGUAGES.add(new SelectItem("de", "German"));
            LANGUAGES.add(new SelectItem("ru", "Russian"));
            LANGUAGES.add(new SelectItem("tr", "Turkish"));
        }

        return LANGUAGES;
    }
}
