package org.primefaces.cookbook.component;

import javax.faces.component.UIComponentBase;

/**
 * LayoutPane
 *
 * @author  Oleg Varaksin / last modified by $Author: $
 * @version $Revision: 1.0 $
 */
public class LayoutPane extends UIComponentBase {

	public static final String COMPONENT_FAMILY = "org.primefaces.cookbook.component";
	private static final String DEFAULT_RENDERER = "org.primefaces.cookbook.component.LayoutPaneRenderer";

	/**
	 * PropertyKeys
	 *
	 * @author  Oleg Varaksin / last modified by $Author: $
	 * @version $Revision: 1.0 $
	 */
	protected enum PropertyKeys {

		position,
		combinedPosition
	}

	public LayoutPane() {
		setRendererType(DEFAULT_RENDERER);
	}

	@Override
	public String getFamily() {
		return COMPONENT_FAMILY;
	}

	// position "north" | "south" | "west" | "east" | "center"
	public String getPosition() {
		return (String) getStateHelper().eval(PropertyKeys.position, "center");
	}

	public void setPosition(String position) {
		getStateHelper().put(PropertyKeys.position, position);
	}

	public String getCombinedPosition() {
		return (String) getStateHelper().eval(PropertyKeys.combinedPosition, "center");
	}

	public void setCombinedPosition(String combinedPosition) {
		getStateHelper().put(PropertyKeys.combinedPosition, combinedPosition);
	}
}
