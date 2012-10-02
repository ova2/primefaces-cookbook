package org.primefaces.cookbook.component;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * LayoutOptions
 *
 * @author  ova / last modified by $Author: $
 * @version $Revision: 1.0 $
 */
public class LayoutOptions implements Serializable {

	// direct options
	private Map<String, Object> options = new HashMap<String, Object>();

	// options for all panes
	private LayoutOptions panes;

	// options for every specific pane (depends on position)
	private LayoutOptions north;
	private LayoutOptions south;
	private LayoutOptions west;
	private LayoutOptions east;
	private LayoutOptions center;

	// options for child layout
	private LayoutOptions child;

	public LayoutOptions() {
	}

	public Map<String, Object> getOptions() {
		return options;
	}

	public void setOptions(Map<String, Object> options) {
		this.options = options;
	}

	public void addOption(String key, Object value) {
		options.put(key, value);
	}

	public void setPanesOptions(LayoutOptions layoutOptions) {
		panes = layoutOptions;
	}

	public LayoutOptions getPanesOptions() {
		return panes;
	}

	public void setNorthOptions(LayoutOptions layoutOptions) {
		north = layoutOptions;
	}

	public LayoutOptions getNorthOptions() {
		return north;
	}

	public void setSouthOptions(LayoutOptions layoutOptions) {
		south = layoutOptions;
	}

	public LayoutOptions getSouthOptions() {
		return south;
	}

	public void setWestOptions(LayoutOptions layoutOptions) {
		west = layoutOptions;
	}

	public LayoutOptions getWestOptions() {
		return west;
	}

	public void setEastOptions(LayoutOptions layoutOptions) {
		east = layoutOptions;
	}

	public LayoutOptions getEastOptions() {
		return east;
	}

	public void setCenterOptions(LayoutOptions layoutOptions) {
		center = layoutOptions;
	}

	public LayoutOptions getCenterOptions() {
		return center;
	}

	public void setChildOptions(LayoutOptions layoutOptions) {
		child = layoutOptions;
	}

	public LayoutOptions getChildOptions() {
		return child;
	}

	public String render() {
		return GsonLayoutOptions.getGson().toJson(this);
	}
}
