package org.primefaces.cookbook.controller.chapter5;

import org.primefaces.cookbook.utils.MessageUtil;
import org.primefaces.event.ScheduleEntryMoveEvent;
import org.primefaces.event.ScheduleEntryResizeEvent;
import org.primefaces.event.SelectEvent;
import org.primefaces.model.DefaultScheduleEvent;
import org.primefaces.model.LazyScheduleModel;
import org.primefaces.model.ScheduleModel;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

/**
 * ScheduleController
 *
 * User: mertcaliskan
 * Date: 3/18/15
 */
@Named
@ViewScoped
public class ScheduleBean implements Serializable {

    private ScheduleModel lazyEventModel;

    @PostConstruct
    public void initialize() {
        lazyEventModel = new LazyScheduleModel() {

            @Override
            public void loadEvents(Date start, Date end) {
                try {
                    // simulate a long running task
                    Thread.sleep(1500);
                } catch (Exception e) {
                }

                clear();

                Date random = getRandomDate(start);
                addEvent(new DefaultScheduleEvent("Lazy Event 1", random, random));

                random = getRandomDate(start);
                addEvent(new DefaultScheduleEvent("Lazy Event 2", random, random));
            }
        };
    }

    public Date getRandomDate(Date base) {
        Calendar date = Calendar.getInstance();
        date.setTime(base);
        date.add(Calendar.DATE, ((int) (Math.random() * 30)) + 1);

        return date.getTime();
    }

    public ScheduleModel getLazyScheduleModel() {
        return lazyEventModel;
    }

    public void onDateSelect(SelectEvent event) {
        MessageUtil.addInfoMessage("date.selected", event.getObject());
    }

    public void onEventSelect(SelectEvent event) {
        MessageUtil.addInfoMessage("event.selected", ((DefaultScheduleEvent)event.getObject()).getTitle());
    }

    public void onEventMove(ScheduleEntryMoveEvent event) {
        MessageUtil.addInfoMessage("event.moved", event.getScheduleEvent().getTitle(), event.getDayDelta(), event.getMinuteDelta());
    }

    public void onEventResize(ScheduleEntryResizeEvent event) {
        MessageUtil.addInfoMessage("event.resized", event.getScheduleEvent().getTitle(), event.getDayDelta(), event. getMinuteDelta());
    }

    public void onViewChange(SelectEvent event) {
        MessageUtil.addInfoMessage("view.changed", event.getObject());
    }
}
