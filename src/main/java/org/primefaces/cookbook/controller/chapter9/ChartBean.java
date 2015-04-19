package org.primefaces.cookbook.controller.chapter9;

import org.primefaces.cookbook.utils.MessageUtil;
import org.primefaces.event.ItemSelectEvent;
import org.primefaces.model.chart.*;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

/**
 * User: mertcaliskan
 * Date: 9/18/12
 */
@Named
@ViewScoped
public class ChartBean implements Serializable {

    private LineChartModel lineModel;
    private LineChartModel areaModel;
    private BarChartModel barModel;
    private PieChartModel pieModel;
    private PieChartModel liveChartModel;
    private CartesianChartModel combinedModel;

    @PostConstruct
    public void setup() {
        lineModel = createLineModel();
        areaModel = createAreaModel();
        barModel = createBarModel();
        pieModel = createPieChartModel();
        liveChartModel = new PieChartModel();
        combinedModel = new BarChartModel();
    }

    private LineChartModel createLineModel() {
        LineChartModel model = new LineChartModel();
        LineChartSeries sales = new LineChartSeries();
        sales.setLabel("Sales");
        sales.set(2004, 1000);
        sales.set(2005, 1170);
        sales.set(2006, 660);
        sales.set(2007, 1030);

        LineChartSeries expenses = new LineChartSeries();
        expenses.setLabel("Expenses");
        expenses.set(2004, 400);
        expenses.set(2005, 460);
        expenses.set(2006, 1120);
        expenses.set(2007, 540);

        model.addSeries(sales);
        model.addSeries(expenses);
        model.setExtender("chart");
        model.setTitle("Company Performance");

        return model;
    }

    private LineChartModel createAreaModel() {
        LineChartModel model = new LineChartModel();
        LineChartSeries sales = new LineChartSeries();
        sales.setFill(true);
        sales.setLabel("Sales");
        sales.set(2004, 1000);
        sales.set(2005, 1170);
        sales.set(2006, 660);
        sales.set(2007, 1030);

        LineChartSeries expenses = new LineChartSeries();
        expenses.setFill(true);
        expenses.setLabel("Expenses");
        expenses.set(2004, 400);
        expenses.set(2005, 460);
        expenses.set(2006, 1120);
        expenses.set(2007, 540);

        model.addSeries(sales);
        model.addSeries(expenses);
        model.setExtender("chart");
        model.setTitle("Company Performance");

        return model;
    }

    private BarChartModel createBarModel() {
        BarChartModel model = new BarChartModel();
        ChartSeries sales = new ChartSeries();
        sales.setLabel("Sales");
        sales.set(2004, 1000);
        sales.set(2005, 1170);
        sales.set(2006, 660);
        sales.set(2007, 1030);

        ChartSeries expenses = new ChartSeries();
        expenses.setLabel("Expenses");
        expenses.set("2004", 400);
        expenses.set("2005", 460);
        expenses.set("2006", 1120);
        expenses.set("2007", 540);

        model.addSeries(sales);
        model.addSeries(expenses);
        model.setTitle("Company Performance");

        return model;
    }

    private PieChartModel createPieChartModel() {
        PieChartModel model = new PieChartModel();
        model.setLegendPosition("w");
        model.setShowDataLabels(true);
        model.set("Work", 11);
        model.set("Eat", 2);
        model.set("Commute", 2);
        model.set("Watch TV", 2);
        model.set("Sleep", 7);

        return model;
    }

    public PieChartModel getLivePieModel() {
        int random1 = (int)(Math.random() * 1000);
        int random2 = (int)(Math.random() * 1000);

        liveChartModel.getData().put("Candidate 1", random1);
        liveChartModel.getData().put("Candidate 2", random2);
        liveChartModel.setLegendPosition("w");
        liveChartModel.setShowDataLabels(true);

        return liveChartModel;
    }

    public CartesianChartModel getCombinedModel() {
        LineChartSeries sales = new LineChartSeries();
        sales.setLabel("Sales");
        sales.set(2004, 1000);
        sales.set(2005, 1170);
        sales.set(2006, 660);
        sales.set(2007, 1030);

        BarChartSeries expenses = new BarChartSeries();
        expenses.setLabel("Expenses");
        expenses.set("2004", 400);
        expenses.set("2005", 460);
        expenses.set("2006", 1120);
        expenses.set("2007", 540);

        combinedModel.addSeries(sales);
        combinedModel.addSeries(expenses);

        return combinedModel;
    }

    public void itemSelect(ItemSelectEvent event) {
        MessageUtil.addInfoMessageWithoutKey("Item selected",
                "Item Index:" + event.getItemIndex() + ", Series Index: " + event.getSeriesIndex());
    }

    public LineChartModel getAreaModel() {
        return areaModel;
    }

    public LineChartModel getLineModel() {
        return lineModel;
    }

    public BarChartModel getBarModel() {
        return barModel;
    }

    public PieChartModel getPieModel() {
        return pieModel;
    }
}
