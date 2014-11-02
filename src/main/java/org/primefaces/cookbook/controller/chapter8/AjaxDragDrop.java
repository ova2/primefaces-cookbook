package org.primefaces.cookbook.controller.chapter8;

import org.primefaces.component.datalist.DataList;
import org.primefaces.event.DragDropEvent;

import javax.faces.application.FacesMessage;
import javax.faces.component.ContextCallback;
import javax.faces.component.UIComponent;
import javax.faces.component.html.HtmlGraphicImage;
import javax.faces.component.html.HtmlPanelGroup;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * AjaxDragDrop
 *
 * @author Oleg Varaksin / last modified by $Author: $
 * @version $Revision: 1.0 $
 */
@Named
@ViewScoped
public class AjaxDragDrop implements Serializable {

    private List<String> orderedPizza = new ArrayList<String>();
    private List<String> removedPizza = new ArrayList<String>();

    public List<String> getOrderedPizza() {
        return orderedPizza;
    }

    public List<String> getRemovedPizza() {
        return removedPizza;
    }

    public void onPizzaOrder(DragDropEvent event) {
        HtmlGraphicImage image = (HtmlGraphicImage) event.
                getComponent().findComponent(event.getDragId());
        String pizza = image != null ? image.getTitle() : "";

        orderedPizza.add(pizza);

        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
                "Selected pizza: " + pizza, null);
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    public void onPizzaRemove(DragDropEvent event) {
        DataList dataList = (DataList) event.
                getComponent().findComponent("orderedPizza");

        FacesContext fc = FacesContext.getCurrentInstance();
        dataList.invokeOnComponent(fc, event.getDragId(),
            new ContextCallback() {
                public void invokeContextCallback(FacesContext fc,
                                                  UIComponent comp) {
                    HtmlPanelGroup pGroup = (HtmlPanelGroup)comp;
                    String pizza = pGroup != null ?
                        (String) pGroup.getAttributes().get("pizza") :
                        "";
    
                    orderedPizza.remove(pizza);
                    removedPizza.add(pizza);
    
                    FacesMessage msg = new FacesMessage(
                            FacesMessage.SEVERITY_INFO,
                            "Removed pizza: " + pizza, null);
                    fc.addMessage(null, msg);
                }
            });
    }

    public String sendOrder() {
        StringBuilder sb = new StringBuilder("You have ordered:");
        for (String pizza : orderedPizza) {
            sb.append("<br/>");
            sb.append(pizza);
        }

        FacesMessage msg = new FacesMessage(
                FacesMessage.SEVERITY_INFO, sb.toString(), null);
        FacesContext.getCurrentInstance().addMessage(null, msg);

        return null;
    }
}
