package org.primefaces.cookbook.controller.chapter11;

import org.primefaces.cookbook.component.LayoutOptions;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

/**
 * ShowcaseLayout
 *
 * @author  Oleg Varaksin / last modified by $Author: $
 * @version $Revision: 1.0 $
 */
@ApplicationScoped
@ManagedBean(eager = true)
public class ShowcaseLayout {

	private LayoutOptions layoutOptions;

	@PostConstruct
	protected void initialize() {
		layoutOptions = new LayoutOptions();

		// for all panes
		LayoutOptions panes = new LayoutOptions();
		panes.addOption("resizable", true);
		panes.addOption("closable", true);
		panes.addOption("slidable", false);
		panes.addOption("spacing", 6);
		panes.addOption("resizeWithWindow", false);
		panes.addOption("resizeWhileDragging", true);
		layoutOptions.setPanesOptions(panes);

		// north pane
		LayoutOptions north = new LayoutOptions();
		north.addOption("resizable", false);
		north.addOption("closable", false);
		north.addOption("size", 60);
		layoutOptions.setNorthOptions(north);

		// south pane
		LayoutOptions south = new LayoutOptions();
		south.addOption("resizable", false);
		south.addOption("closable", false);
		south.addOption("size", 40);
		layoutOptions.setSouthOptions(south);

		// center pane
		LayoutOptions center = new LayoutOptions();
		center.addOption("resizable", false);
		center.addOption("closable", false);
		center.addOption("resizeWhileDragging", false);
		center.addOption("minWidth", 200);
		center.addOption("minHeight", 60);
		layoutOptions.setCenterOptions(center);

		// west pane
		LayoutOptions west = new LayoutOptions();
		west.addOption("size", 210);
		west.addOption("minSize", 180);
		west.addOption("maxSize", 500);
		layoutOptions.setWestOptions(west);

		// east pane
		LayoutOptions east = new LayoutOptions();
		east.addOption("size", 448);
		east.addOption("minSize", 180);
		east.addOption("maxSize", 650);
		layoutOptions.setEastOptions(east);

		// nested east layout
		LayoutOptions childEastOptions = new LayoutOptions();
		east.setChildOptions(childEastOptions);

		// east-center pane
		LayoutOptions eastCenter = new LayoutOptions();
		eastCenter.addOption("minHeight", 60);
		childEastOptions.setCenterOptions(eastCenter);

		// south-center pane
		LayoutOptions southCenter = new LayoutOptions();
		southCenter.addOption("size", "70%");
		southCenter.addOption("minSize", 60);
		childEastOptions.setSouthOptions(southCenter);
	}

	public LayoutOptions getLayoutOptions() {
		return layoutOptions;
	}

	public void setLayoutOptions(LayoutOptions layoutOptions) {
		this.layoutOptions = layoutOptions;
	}
}
