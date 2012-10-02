package org.primefaces.cookbook.component;

import org.primefaces.component.api.Widget;
import org.primefaces.util.Constants;

import javax.faces.application.ResourceDependencies;
import javax.faces.application.ResourceDependency;
import javax.faces.component.UIComponent;
import javax.faces.component.UIComponentBase;
import javax.faces.component.UINamingContainer;
import javax.faces.component.behavior.ClientBehaviorHolder;
import javax.faces.context.FacesContext;
import javax.faces.event.AjaxBehaviorEvent;
import javax.faces.event.FacesEvent;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.logging.Logger;

/**
 * Layout
 *
 * @author  Oleg Varaksin / last modified by $Author: $
 * @version $Revision: 1.0 $
 */
@ResourceDependencies({
                          @ResourceDependency(library = "primefaces", name = "jquery/jquery.js"),
                          @ResourceDependency(library = "primefaces", name = "primefaces.js"),
                          @ResourceDependency(library = "css", name = "chapter11/layout.css"),
                          @ResourceDependency(library = "js", name = "chapter11/jquery.layout.js"),
                          @ResourceDependency(library = "js", name = "chapter11/layout.js")
                      })
public class Layout extends UIComponentBase implements Widget, ClientBehaviorHolder {

	private static final Logger LOG = Logger.getLogger(Layout.class.getName());

	public static final String COMPONENT_FAMILY = "org.primefaces.cookbook.component";
	private static final String DEFAULT_RENDERER = "org.primefaces.cookbook.component.LayoutRenderer";

	public static final String POSITION_SEPARATOR = "_";
	public static final String STYLE_CLASS_PANE = "ui-widget-content ui-corner-all";
	public static final String STYLE_CLASS_PANE_WITH_SUBPANES = "ui-corner-all ui-layout-pane-withsubpanes";
	public static final String STYLE_CLASS_PANE_HEADER = "ui-widget-header ui-corner-top ui-layout-pane-header";
	public static final String STYLE_CLASS_PANE_CONTENT = "ui-layout-pane-content";

	private static final Collection<String> EVENT_NAMES =
	    Collections.unmodifiableCollection(Arrays.asList("open", "close", "resize"));

	/**
	 * PropertyKeys
	 *
	 * @author  Oleg Varaksin / last modified by $Author: $
	 * @version $Revision: 1.0 $
	 */
	protected enum PropertyKeys {

		widgetVar,
		fullPage,
		options,
		style,
		styleClass
	}

	public Layout() {
		setRendererType(DEFAULT_RENDERER);
	}

	@Override
	public String getFamily() {
		return COMPONENT_FAMILY;
	}

	public String getWidgetVar() {
		return (String) getStateHelper().eval(PropertyKeys.widgetVar, null);
	}

	public void setWidgetVar(String widgetVar) {
		getStateHelper().put(PropertyKeys.widgetVar, widgetVar);
	}

	public boolean isFullPage() {
		return (Boolean) getStateHelper().eval(PropertyKeys.fullPage, true);
	}

	public void setFullPage(boolean fullPage) {
		getStateHelper().put(PropertyKeys.fullPage, fullPage);
	}

	public Object getOptions() {
		return getStateHelper().eval(PropertyKeys.options, null);
	}

	public void setOptions(Object options) {
		getStateHelper().put(PropertyKeys.options, options);
	}

	public String getStyle() {
		return (String) getStateHelper().eval(PropertyKeys.style, null);
	}

	public void setStyle(String style) {
		getStateHelper().put(PropertyKeys.style, style);
	}

	public String getStyleClass() {
		return (String) getStateHelper().eval(PropertyKeys.styleClass, null);
	}

	public void setStyleClass(String styleClass) {
		getStateHelper().put(PropertyKeys.styleClass, styleClass);
	}

	@Override
	public Collection<String> getEventNames() {
		return EVENT_NAMES;
	}

	@Override
	public void processDecodes(FacesContext fc) {
		if (isSelfRequest(fc)) {
			this.decode(fc);
		} else {
			super.processDecodes(fc);
		}
	}

	@Override
	public void processValidators(FacesContext fc) {
		if (!isSelfRequest(fc)) {
			super.processValidators(fc);
		}
	}

	@Override
	public void processUpdates(FacesContext fc) {
		if (!isSelfRequest(fc)) {
			super.processUpdates(fc);
		}
	}

	@Override
	public void queueEvent(FacesEvent event) {
		FacesContext context = FacesContext.getCurrentInstance();
		Map<String, String> params = context.getExternalContext().getRequestParameterMap();
		String eventName = params.get(Constants.PARTIAL_BEHAVIOR_EVENT_PARAM);
		String clientId = this.getClientId(context);

		if (isSelfRequest(context)) {
			AjaxBehaviorEvent behaviorEvent = (AjaxBehaviorEvent) event;
			LayoutPane pane = getLayoutPane(this, params.get(clientId + "_pane"));
			if (pane == null) {
				LOG.warning("LayoutPane by request parameter '" + params.get(clientId + "_pane") + "' was not found");

				return;
			}

			if ("open".equals(eventName)) {
				OpenEvent openEvent = new OpenEvent(pane, behaviorEvent.getBehavior());
				openEvent.setPhaseId(behaviorEvent.getPhaseId());
				super.queueEvent(openEvent);

				return;
			} else if ("close".equals(eventName)) {
				CloseEvent closeEvent = new CloseEvent(pane, behaviorEvent.getBehavior());
				closeEvent.setPhaseId(behaviorEvent.getPhaseId());
				super.queueEvent(closeEvent);

				return;
			} else if ("resize".equals(eventName)) {
				double width = Double.valueOf(params.get(clientId + "_width"));
				double height = Double.valueOf(params.get(clientId + "_height"));

				ResizeEvent resizeEvent = new ResizeEvent(pane, behaviorEvent.getBehavior(), width, height);
				event.setPhaseId(behaviorEvent.getPhaseId());
				super.queueEvent(resizeEvent);

				return;
			}
		}

		super.queueEvent(event);
	}

	public LayoutPane getLayoutPane(UIComponent component, String combinedPosition) {
		for (UIComponent child : component.getChildren()) {
			if (child instanceof LayoutPane) {
				if (((LayoutPane) child).getCombinedPosition().equals(combinedPosition)) {
					return (LayoutPane) child;
				} else {
					LayoutPane pane = getLayoutPane(child, combinedPosition);
					if (pane != null) {
						return pane;
					}
				}
			}
		}

		return null;
	}

	private boolean isSelfRequest(FacesContext context) {
		return this.getClientId(context)
		           .equals(context.getExternalContext().getRequestParameterMap().get(Constants.PARTIAL_SOURCE_PARAM));
	}

	public String resolveWidgetVar() {
		final FacesContext context = FacesContext.getCurrentInstance();
		final String userWidgetVar = (String) getAttributes().get(PropertyKeys.widgetVar.toString());

		if (userWidgetVar != null) {
			return userWidgetVar;
		}

		return "widget_" + getClientId(context).replaceAll("-|" + UINamingContainer.getSeparatorChar(context), "_");
	}
}
