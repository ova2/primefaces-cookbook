package org.primefaces.cookbook.controller.chapter9;

import org.primefaces.model.chart.OhlcChartModel;
import org.primefaces.model.chart.OhlcChartSeries;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

/**
 * User: mertcaliskan
 * Date: 10/17/12
 */
@Named
@ViewScoped
public class OhlcChartBean implements Serializable {

    private OhlcChartModel model;

    public OhlcChartBean() {
        model = new OhlcChartModel();

        model.add(new OhlcChartSeries(1, 136.01, 139.5, 134.53, 139.48));
        model.add(new OhlcChartSeries(2, 143.82, 144.56, 136.04, 136.97));
        model.add(new OhlcChartSeries(3, 136.47, 146.4, 136, 144.67));
        model.add(new OhlcChartSeries(4, 124.76, 135.9, 124.55, 135.81));
        model.add(new OhlcChartSeries(5, 123.73, 129.31, 121.57, 122.5));
        model.add(new OhlcChartSeries(6, 127.37, 130.96, 119.38, 122.42));
        model.add(new OhlcChartSeries(7, 128.24, 133.5, 126.26, 129.19));
        model.add(new OhlcChartSeries(8, 122.9, 127.95, 122.66, 127.24));
        model.add(new OhlcChartSeries(9, 121.73, 127.2, 118.6, 123.9));
        model.add(new OhlcChartSeries(10, 120.01, 124.25, 115.76, 123.42));
        model.add(new OhlcChartSeries(11, 114.94, 120, 113.28, 119.57));
        model.add(new OhlcChartSeries(12, 104.51, 116.13, 102.61, 115.99));
        model.add(new OhlcChartSeries(13, 102.71, 109.98, 101.75, 106.85));
        model.add(new OhlcChartSeries(14, 96.53, 103.48, 94.18, 101.59));
        model.add(new OhlcChartSeries(15, 84.18, 97.2, 82.57, 95.93));
        model.add(new OhlcChartSeries(16, 88.12, 92.77, 82.33, 85.3));
        model.add(new OhlcChartSeries(17, 91.65, 92.92, 86.51, 89.31));
        model.add(new OhlcChartSeries(18, 96.87, 97.04, 89, 91.2));
        model.add(new OhlcChartSeries(19, 100, 103, 95.77, 99.16));
        model.add(new OhlcChartSeries(20, 89.1, 100, 88.9, 99.72));
        model.add(new OhlcChartSeries(21, 88.86, 95, 88.3, 90.13));
        model.add(new OhlcChartSeries(22, 81.93, 90, 78.2, 88.36));
        model.add(new OhlcChartSeries(23, 90.46, 90.99, 80.05, 82.33));
        model.add(new OhlcChartSeries(24, 93.17, 97.17, 90.04, 90.58));
    }

    public String getDatatipFormat() {
        return "<table>" +
               "<tr><td>date:</td><td>%s</td></tr>" +
               "<tr><td>open:</td><td>%s</td></tr>" +
               "</table>";
    }

    public OhlcChartModel getModel() {
        return model;
    }

    public void setModel(OhlcChartModel model) {
        this.model = model;
    }
}
