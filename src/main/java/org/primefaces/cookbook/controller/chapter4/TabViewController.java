package org.primefaces.cookbook.controller.chapter4;

import org.primefaces.cookbook.utils.MessageUtil;
import org.primefaces.event.TabCloseEvent;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;

/**
 * User: mertcaliskan
 * Date: 8/1/12
 */
@ManagedBean
@ViewScoped
public class TabViewController implements Serializable {

    public void onTabClose(TabCloseEvent event) {
        MessageUtil.addInfoMessage("Tab Closed", "Closed Tab: " + event.getTab().getTitle());
    }
}