package org.primefaces.cookbook.controller.chapter9;

import org.primefaces.model.chart.MeterGaugeChartModel;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * User: mertcaliskan
 * Date: 10/17/12
 */
@ManagedBean
@ViewScoped
public class MeterGaugeController implements Serializable {

    private MeterGaugeChartModel model;

    public MeterGaugeController() {
        List<Number> intervals = new ArrayList<Number>(){{
            add(22000);
            add(55000);
            add(70000);
        }};
        List<Number> ticks = new ArrayList<Number>(){{
            add(10000);
            add(20000);
            add(30000);
            add(50000);
            add(70000);
        }};
        model = new MeterGaugeChartModel(52200, intervals, ticks);
    }

    public MeterGaugeChartModel getModel() {
        return model;
    }

    public void setModel(MeterGaugeChartModel model) {
        this.model = model;
    }
}
