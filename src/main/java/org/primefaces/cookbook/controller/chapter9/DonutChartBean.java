package org.primefaces.cookbook.controller.chapter9;

import org.primefaces.model.chart.DonutChartModel;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * User: mertcaliskan
 * Date: 10/3/12
 */
@Named
@ViewScoped
public class DonutChartBean implements Serializable {

    private DonutChartModel model;

    public DonutChartBean() {
        createDonutChart();
    }

    private void createDonutChart() {
        model = new DonutChartModel();

        Map<String, Number> circle1 = new LinkedHashMap<String, Number>();
        circle1.put("APPL", 150);
        circle1.put("IBM", 180);
        circle1.put("AMD", 30);
        circle1.put("INTC", 120);

        model.addCircle(circle1);

        Map<String, Number> circle2 = new LinkedHashMap<String, Number>();
        circle2.put("APPL", 180);
        circle2.put("IBM", 90);
        circle2.put("AMD", 100);
        circle2.put("INTC", 80);
        model.addCircle(circle2);

        Map<String, Number> circle3 = new LinkedHashMap<String, Number>();
        circle3.put("APPL", 210);
        circle3.put("IBM", 40);
        circle3.put("AMD", 80);
        circle3.put("INTC", 160);
        model.addCircle(circle3);
    }

    public DonutChartModel getModel() {
        return model;
    }
}