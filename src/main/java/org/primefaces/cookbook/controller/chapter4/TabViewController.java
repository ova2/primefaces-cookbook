package org.primefaces.cookbook.controller.chapter4;

import org.primefaces.cookbook.utils.MessageUtil;
import org.primefaces.event.TabCloseEvent;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

/**
 * User: mertcaliskan
 * Date: 8/1/12
 */
@Named
@ViewScoped
public class TabViewController implements Serializable {

    public void onTabClose(TabCloseEvent event) {
        MessageUtil.addInfoMessage("Tab Closed", "Closed Tab: " + event.getTab().getTitle());
    }
}