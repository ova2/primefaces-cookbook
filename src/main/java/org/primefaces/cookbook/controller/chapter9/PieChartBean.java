package org.primefaces.cookbook.controller.chapter9;

import org.primefaces.model.chart.PieChartModel;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

/**
 * User: mertcaliskan
 * Date: 10/2/12
 */
@Named
@ViewScoped
public class PieChartBean implements Serializable {

    private PieChartModel model1;
    private PieChartModel model2;
    private PieChartModel model3;
    private PieChartModel model4;
    private PieChartModel model5;
    private PieChartModel liveChartModel;

    @PostConstruct
    public void setup() {
        model1 = createPieChartModel1();
        model2 = createPieChartModel2();
        model3 = createPieChartModel3();
        model4 = createPieChartModel4();
        model5 = createPieChartModel5();

        liveChartModel = new PieChartModel();
        liveChartModel.set("Candidate 1", 540);
        liveChartModel.set("Candidate 2", 325);
    }

    private PieChartModel createPieChartModel1() {
        PieChartModel model = new PieChartModel();
        model.set("Work", 11);
        model.set("Eat", 2);
        model.set("Commute", 2);
        model.set("Watch TV", 2);
        model.set("Sleep", 7);

        return model;
    }

    private PieChartModel createPieChartModel2() {
        PieChartModel model = new PieChartModel();
        model.set("Work", 11);
        model.set("Eat", 2);
        model.set("Commute", 2);
        model.set("Watch TV", 2);
        model.set("Sleep", 7);
        model.setLegendPosition("nw");

        return model;
    }

    private PieChartModel createPieChartModel3() {
        PieChartModel model = new PieChartModel();
        model.set("Work", 11);
        model.set("Eat", 2);
        model.set("Commute", 2);
        model.set("Watch TV", 2);
        model.set("Sleep", 7);
        model.setLegendPosition("nw");
        model.setSeriesColors("FF0000,00FF00,0000FF,F0F0F0,0F0F0F");

        return model;
    }

    private PieChartModel createPieChartModel4() {
        PieChartModel model = new PieChartModel();
        model.set("Work", 11);
        model.set("Eat", 2);
        model.set("Commute", 2);
        model.set("Watch TV", 2);
        model.set("Sleep", 7);
        model.setShowDataLabels(true);
        model.setDataFormat("percent");

        return model;
    }

    private PieChartModel createPieChartModel5() {
        PieChartModel model = new PieChartModel();
        model.set("Work", 11);
        model.set("Eat", 2);
        model.set("Commute", 2);
        model.set("Watch TV", 2);
        model.set("Sleep", 7);
        model.setSliceMargin(5);
        model.setDiameter(200);
        model.setFill(false);

        return model;
    }

    public PieChartModel getModel1() {
        return model1;
    }

    public PieChartModel getModel2() {
        return model2;
    }

    public PieChartModel getModel3() {
        return model3;
    }

    public PieChartModel getModel4() {
        return model4;
    }

    public PieChartModel getModel5() {
        return model5;
    }

    public PieChartModel getLivePieModel() {
        int random1 = (int)(Math.random() * 1000);
        int random2 = (int)(Math.random() * 1000);

        liveChartModel.getData().put("Candidate 1", random1);
        liveChartModel.getData().put("Candidate 2", random2);

        return liveChartModel;
    }
}
