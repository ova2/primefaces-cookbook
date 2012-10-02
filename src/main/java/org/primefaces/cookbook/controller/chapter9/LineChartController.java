package org.primefaces.cookbook.controller.chapter9;

import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.ChartSeries;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;

/**
 * User: mertcaliskan
 * Date: 9/18/12
 */
@ManagedBean
@ViewScoped
public class LineChartController implements Serializable {

    private CartesianChartModel model;

    private CartesianChartModel modelWithNull;

    public LineChartController() {
        model = new CartesianChartModel();
        modelWithNull = new CartesianChartModel();

        createModel();
        createModelWithNull();
    }

    private void createModelWithNull() {
        ChartSeries sales = new ChartSeries();
        sales.setLabel("Sales");
        sales.set("2004", 1000);
        sales.set("2005", null);
        sales.set("2006", null);
        sales.set("2007", 1030);

        ChartSeries expenses = new ChartSeries();
        expenses.setLabel("Expenses");
        expenses.set("2004", 400);
        expenses.set("2005", null);
        expenses.set("2006", 1120);
        expenses.set("2007", 540);

        modelWithNull.addSeries(sales);
        modelWithNull.addSeries(expenses);
    }

    private void createModel() {
        ChartSeries sales = new ChartSeries();
        sales.setLabel("Sales");
        sales.set("2004", 1000);
        sales.set("2005", 1170);
        sales.set("2006", 660);
        sales.set("2007", 1030);

        ChartSeries expenses = new ChartSeries();
        expenses.setLabel("Expenses");
        expenses.set("2004", 400);
        expenses.set("2005", 460);
        expenses.set("2006", 1120);
        expenses.set("2007", 540);

        model.addSeries(sales);
        model.addSeries(expenses);
    }

    public String getDatatipFormat() {
        return "<span style=\"display:none;\">%s</span><span>%s</span>";
    }
    
    public CartesianChartModel getModel() {
        return model;
    }

    public CartesianChartModel getModelWithNull() {
        return modelWithNull;
    }
}
