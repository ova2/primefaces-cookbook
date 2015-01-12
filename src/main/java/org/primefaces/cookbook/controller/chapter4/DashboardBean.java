package org.primefaces.cookbook.controller.chapter4;

import org.primefaces.cookbook.utils.MessageUtil;
import org.primefaces.event.DashboardReorderEvent;
import org.primefaces.model.DashboardColumn;
import org.primefaces.model.DashboardModel;
import org.primefaces.model.DefaultDashboardColumn;
import org.primefaces.model.DefaultDashboardModel;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

/**
 * User: mertcaliskan
 * Date: 8/1/12
 */
@Named
@ViewScoped
public class DashboardBean implements Serializable {

    private DashboardModel model;

    public DashboardBean() {
        model = new DefaultDashboardModel();

        DashboardColumn column1 = new DefaultDashboardColumn();
        DashboardColumn column2 = new DefaultDashboardColumn();
        DashboardColumn column3 = new DefaultDashboardColumn();

        column1.addWidget("calculator");
        column1.addWidget("calendar");
        column1.addWidget("contact");

        column2.addWidget("dictionary");

        column3.addWidget("weather");
        column3.addWidget("translation");

        model.addColumn(column1);
        model.addColumn(column2);
        model.addColumn(column3);
    }

    public void handleReorder(DashboardReorderEvent event) {
        MessageUtil.addInfoMessageWithoutKey("Reordered: " + event.getWidgetId(),
                "Item index: " + event.getItemIndex() + ", Column index: " + event.getColumnIndex() + ", Sender column index: " + event.getSenderColumnIndex());
    }

    public DashboardModel getModel() {
        return model;
    }
}
