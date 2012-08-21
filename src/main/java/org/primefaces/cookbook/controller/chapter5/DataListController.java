package org.primefaces.cookbook.controller.chapter5;

import org.primefaces.cookbook.converter.CarConverter;
import org.primefaces.cookbook.model.chapter3.Car;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * User: mertcaliskan
 * Date: 8/19/12
 */
@ManagedBean
@ViewScoped
public class DataListController implements Serializable {

    private List<String> countriesShort = new ArrayList<String>();
    private List<String> countries = new ArrayList<String>();

    public DataListController() {
        countriesShort.add("Armenia");
        countriesShort.add("Australia");
        countriesShort.add("Albania");
        countriesShort.add("Afghanistan");
        countriesShort.add("Andorra");
        countriesShort.add("Algeria");
        countriesShort.add("Azerbaijan");
        countriesShort.add("Argentina");
        countriesShort.add("Angola");
        countriesShort.add("Austria");

        countries.add("Afghanistan");
        countries.add("Albania");
        countries.add("Algeria");
        countries.add("Andorra");
        countries.add("Angola");
        countries.add("Argentina");
        countries.add("Armenia");
        countries.add("Australia");
        countries.add("Austria");
        countries.add("Azerbaijan");
        countries.add("Bahamas");
        countries.add("Bahrain");
        countries.add("Bangladesh");
        countries.add("Barbados");
        countries.add("Belarus");
        countries.add("Belgium");
        countries.add("Belize");
        countries.add("Benin");
        countries.add("Bhutan");
        countries.add("Bolivia");
        countries.add("Bosnia");
        countries.add("Botswana");
        countries.add("Brazil");
        countries.add("Brunei");
        countries.add("Bulgaria");
        countries.add("Burkina");
        countries.add("Burundi");
        countries.add("Cambodia");
        countries.add("Cameroon");
        countries.add("Canada");
        countries.add("Chad");
        countries.add("Chile");
        countries.add("China");
        countries.add("Colombia");
        countries.add("Comoros");
        countries.add("Congo");
        countries.add("Croatia");
        countries.add("Cuba");
        countries.add("Denmark");
        countries.add("Djibouti");
        countries.add("Dominica");
        countries.add("Ecuador");
        countries.add("Egypt");
        countries.add("Eritrea");
        countries.add("Estonia");
        countries.add("Ethiopia");
        countries.add("Fiji");
        countries.add("Finland");
        countries.add("France");
        countries.add("Gabon");
        countries.add("Gambia");
        countries.add("Georgia");
        countries.add("Germany");
        countries.add("Ghana");
        countries.add("Greece");
        countries.add("Grenada");
        countries.add("Guatemala");
        countries.add("Guinea");
        countries.add("Guyana");
        countries.add("Haiti");
        countries.add("Honduras");
        countries.add("Hungary");
        countries.add("Iceland");
        countries.add("India");
        countries.add("Indonesia");
        countries.add("Iran");
        countries.add("Iraq");
        countries.add("Israel");
        countries.add("Italy");
        countries.add("Jamaica");
        countries.add("Japan");
        countries.add("Jordan");
        countries.add("Kazakhstan");
        countries.add("Kenya");
        countries.add("Kiribati");
        countries.add("Kosovo");
        countries.add("Kuwait");
        countries.add("Laos");
        countries.add("Latvia");
        countries.add("Lebanon");
        countries.add("Lesotho");
        countries.add("Liberia");
        countries.add("Libya");
        countries.add("Liechtenstein");
        countries.add("Lithuania");
        countries.add("Luxembourg");
        countries.add("Macedonia");
        countries.add("Madagascar");
        countries.add("Malawi");
        countries.add("Malaysia");
        countries.add("Maldives");
        countries.add("Mali");
        countries.add("Malta");
        countries.add("Mauritania");
        countries.add("Mauritius");
        countries.add("Mexico");
        countries.add("Micronesia");
        countries.add("Moldova");
        countries.add("Monaco");
        countries.add("Mongolia");
        countries.add("Montenegro");
        countries.add("Morocco");
        countries.add("Mozambique");
        countries.add("Namibia");
        countries.add("Nauru");
        countries.add("Nepal");
        countries.add("Netherlands");
        countries.add("Nicaragua");
        countries.add("Niger");
        countries.add("Nigeria");
        countries.add("Norway");
        countries.add("Oman");
        countries.add("Pakistan");
        countries.add("Palau");
        countries.add("Panama");
        countries.add("Paraguay");
        countries.add("Peru");
        countries.add("Philippines");
        countries.add("Poland");
        countries.add("Portugal");
        countries.add("Qatar");
        countries.add("Romania");
        countries.add("Rwanda");
        countries.add("Senegal");
        countries.add("Serbia");
        countries.add("Seychelles");
        countries.add("Singapore");
        countries.add("Slovakia");
        countries.add("Slovenia");
        countries.add("Somalia");
        countries.add("Spain");
        countries.add("Sudan");
        countries.add("Suriname");
        countries.add("Swaziland");
        countries.add("Sweden");
        countries.add("Switzerland");
        countries.add("Syria");
        countries.add("Taiwan");
        countries.add("Tajikistan");
        countries.add("Tanzania");
        countries.add("Thailand");
        countries.add("Togo");
        countries.add("Tonga");
        countries.add("Tunisia");
        countries.add("Turkey");
        countries.add("Turkmenistan");
        countries.add("Tuvalu");
        countries.add("Uganda");
        countries.add("Ukraine");
        countries.add("Uruguay");
        countries.add("Uzbekistan");
        countries.add("Vanuatu");
        countries.add("Venezuela");
        countries.add("Vietnam");
        countries.add("Yemen");
        countries.add("Zambia");
        countries.add("Zimbabwe");
    }

    public Collection<Car> getCars() {
        return new ArrayList<Car>(CarConverter.cars.values());
    }

    public List<String> getCountriesShort() {
        return countriesShort;
    }

    public List<String> getCountries() {
        return countries;
    }
}