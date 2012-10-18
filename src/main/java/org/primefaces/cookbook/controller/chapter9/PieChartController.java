package org.primefaces.cookbook.controller.chapter9;

import org.primefaces.model.chart.PieChartModel;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;

/**
 * User: mertcaliskan
 * Date: 10/2/12
 */
@ManagedBean
@ViewScoped
public class PieChartController implements Serializable {

    private PieChartModel model;
    private PieChartModel liveChartModel;

    public PieChartController() {
        createPieModel();
    }

    private void createPieModel() {
        model = new PieChartModel();

        model.set("Work", 11);
        model.set("Eat", 2);
        model.set("Commute", 2);
        model.set("Watch TV", 2);
        model.set("Sleep", 7);

        liveChartModel = new PieChartModel();

        liveChartModel.set("Candidate 1", 540);
        liveChartModel.set("Candidate 2", 325);
    }

    public PieChartModel getModel() {
        return model;
    }

    public PieChartModel getLivePieModel() {
        int random1 = (int)(Math.random() * 1000);
        int random2 = (int)(Math.random() * 1000);

        liveChartModel.getData().put("Candidate 1", random1);
        liveChartModel.getData().put("Candidate 2", random2);

        return liveChartModel;
    }
}
