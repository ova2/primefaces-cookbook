package org.primefaces.cookbook.controller.chapter5;

import com.lowagie.text.Document;
import com.lowagie.text.HeaderFooter;
import com.lowagie.text.Phrase;
import org.primefaces.cookbook.model.chapter5.CountryList;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

/**
 * User: mertcaliskan
 * Date: 8/28/12
 */
@Named
@ViewScoped
public class DataExportBean implements Serializable {

    private String[] selectedCountries;
    
    public List<String> getCountries() {
        return CountryList.countries;
    }

    public void preProcessPDF(Object document) {
        Document pdf = (Document) document;
        HeaderFooter footer = new HeaderFooter(new Phrase("This is page: "), true);
        pdf.setFooter(footer);
    }

    public String[] getSelectedCountries() {
        return selectedCountries;
    }

    public void setSelectedCountries(String[] selectedCountries) {
        this.selectedCountries = selectedCountries;
    }
}