package org.primefaces.cookbook.controller.chapter9;

import org.primefaces.model.chart.ChartSeries;
import org.primefaces.model.chart.LineChartModel;

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
public class LineChartBean implements Serializable {

    private LineChartModel model1;
    private LineChartModel model2;
    private LineChartModel model3;
    private LineChartModel model4;
    private LineChartModel model5;
    private LineChartModel model6;
    private LineChartModel model7;
    private LineChartModel model8;
    private LineChartModel model9;
    private LineChartModel model10;
    private LineChartModel model11;
    private LineChartModel model12;

    @PostConstruct
    public void setup() {
        model1 = createModel1();
        model2 = createModel2();
        model3 = createModel3();
        model4 = createModel4();
        model5 = createModel5();
        model6 = createModel6();
        model7 = createModel7();
        model8 = createModel8();
        model9 = createModel9();
        model10 = createModel10();
        model11 = createModel11();
        model12 = createModel12();
    }

    private LineChartModel createModel1() {
        return createBaseModel();
    }

    private LineChartModel createModel2() {
        LineChartModel baseModel = createBaseModel();
        baseModel.setLegendPosition("nw");

        return baseModel;
    }

    private LineChartModel createModel3() {
        LineChartModel baseModel = createBaseModel();
        baseModel.setLegendPosition("nw");
        baseModel.setAnimate(true);

        return baseModel;
    }

    private LineChartModel createModel4() {
        LineChartModel baseModel = createBaseModel();
        baseModel.setLegendPosition("nw");
        baseModel.setZoom(true);

        return baseModel;
    }

    private LineChartModel createModel5() {
        LineChartModel baseModel = createBaseModel();
        //TODO
        //baseModel.set
        //minY="400" maxY="800"

        return baseModel;
    }

    private LineChartModel createModel6() {
        LineChartModel baseModel = createBaseModel();
        //TODO
        //xaxisLabel="Year" yaxisLabel="Amount"
        //baseModel.set

        return baseModel;
    }

    private LineChartModel createModel7() {
        LineChartModel baseModel = createBaseModel();
        //TODO
        //xaxisAngle="45" yaxisAngle="45"
        //baseModel.set

        return baseModel;
    }

    private LineChartModel createModel8() {
        LineChartModel baseModel = createBaseModel();
        baseModel.setSeriesColors("FF0000,00FF00");
        baseModel.setLegendPosition("nw");

        return baseModel;
    }

    private LineChartModel createModel9() {
        LineChartModel model = new LineChartModel();
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

        model.addSeries(sales);
        model.addSeries(expenses);
        //TODO
        //breakOnNull="false"

        return model;
    }

    private LineChartModel createModel10() {
        LineChartModel baseModel = createBaseModel();
        baseModel.setDatatipFormat("<span style=\"display:none;\">%s</span><span>%s</span>");
        baseModel.setShowDatatip(true);

        return baseModel;
    }

    private LineChartModel createModel11() {
        LineChartModel baseModel = createBaseModel();
        //baseModel.setFill
        //fill="true"

        return baseModel;
    }

    private LineChartModel createModel12() {
        LineChartModel baseModel = createBaseModel();
        //baseModel.setSt
        //stacked="true"
        return baseModel;
    }

    private LineChartModel createBaseModel() {
        LineChartModel model = new LineChartModel();
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

        model.setTitle("Company Performance");

        return model;
    }

    public LineChartModel getModel1() {
        return model1;
    }

    public LineChartModel getModel2() {
        return model2;
    }

    public LineChartModel getModel3() {
        return model3;
    }

    public LineChartModel getModel4() {
        return model4;
    }

    public LineChartModel getModel5() {
        return model5;
    }

    public LineChartModel getModel6() {
        return model6;
    }

    public LineChartModel getModel7() {
        return model7;
    }

    public LineChartModel getModel8() {
        return model8;
    }

    public LineChartModel getModel9() {
        return model9;
    }

    public LineChartModel getModel10() {
        return model10;
    }

    public LineChartModel getModel11() {
        return model11;
    }

    public LineChartModel getModel12() {
        return model12;
    }
}
