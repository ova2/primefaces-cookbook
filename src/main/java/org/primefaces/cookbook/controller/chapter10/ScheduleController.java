package org.primefaces.cookbook.controller.chapter10;

import org.primefaces.model.DefaultScheduleEvent;
import org.primefaces.model.LazyScheduleModel;
import org.primefaces.model.ScheduleModel;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

/**
 * ScheduleController
 *
 * @author Oleg Varaksin / last modified by $Author: $
 * @version $Revision: 1.0 $
 */
@ManagedBean
@ViewScoped
public class ScheduleController implements Serializable {

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
                    // ignore
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
}
