package org.primefaces.cookbook.controller.chapter12;

import org.primefaces.extensions.model.timeline.DefaultTimeLine;
import org.primefaces.extensions.model.timeline.DefaultTimelineEvent;
import org.primefaces.extensions.model.timeline.Timeline;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.annotation.PostConstruct;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;


/**
 * TimelineController
 *
 * @author Oleg Varaksin / last modified by $Author: $
 * @version $Revision: 1.0 $
 */
@ManagedBean
@ViewScoped
public class TimelineController implements Serializable {

    private List<Timeline> timelines;

    private String eventStyle = "dot";
    private String axisPosition = "bottom";

    @PostConstruct
    public void initialize() {
        timelines = new ArrayList<Timeline>();

        Calendar cal = Calendar.getInstance();
        Timeline timeline = new DefaultTimeLine("prh", "Primefaces Release History");
        cal.set(2011, Calendar.MARCH, 10);
        timeline.addEvent(new DefaultTimelineEvent("Primefaces-Extensions 0.1", cal.getTime()));
        cal.set(2012, Calendar.JANUARY, 23);
        timeline.addEvent(new DefaultTimelineEvent("Primefaces-Extensions 0.2.0", cal.getTime()));
        cal.set(2012, Calendar.FEBRUARY, 2);
        timeline.addEvent(new DefaultTimelineEvent("Primefaces Extensions 0.3.0", cal.getTime()));
        cal.set(2012, Calendar.FEBRUARY, 16);
        timeline.addEvent(new DefaultTimelineEvent("Primefaces-Extensions 0.4.0", cal.getTime()));
        cal.set(2012, Calendar.APRIL, 10);
        timeline.addEvent(new DefaultTimelineEvent("Primefaces-Extensions 0.5.0", cal.getTime()));
        cal.set(2012, Calendar.APRIL, 19);
        timeline.addEvent(new DefaultTimelineEvent("Primefaces-Extensions 0.5.1", cal.getTime()));
        cal.set(2012, Calendar.JULY, 26);
        timeline.addEvent(new DefaultTimelineEvent("Primefaces-Extensions 0.6.0", cal.getTime()));
        timelines.add(timeline);
    }

    public List<Timeline> getTimelines() {
        return timelines;
    }

    public String getEventStyle() {
        return eventStyle;
    }

    public void setEventStyle(String eventStyle) {
        this.eventStyle = eventStyle;
    }

    public String getAxisPosition() {
        return axisPosition;
    }

    public void setAxisPosition(String axisPosition) {
        this.axisPosition = axisPosition;
    }
}
