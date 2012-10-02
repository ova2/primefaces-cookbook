package org.primefaces.cookbook.component;

import org.primefaces.renderkit.CoreRenderer;
import org.primefaces.util.ComponentUtils;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import java.io.IOException;

/**
 * LayoutRenderer
 *
 * @author  Oleg Varaksin / last modified by $Author: $
 * @version $Revision: 1.0 $
 */
public class LayoutRenderer extends CoreRenderer {

	@Override
	public void decode(FacesContext fc, UIComponent component) {
		decodeBehaviors(fc, component);
	}

	@Override
	public void encodeBegin(FacesContext fc, UIComponent component) throws IOException {
		ResponseWriter writer = fc.getResponseWriter();
		Layout layout = (Layout) component;

		encodeScript(fc, layout);

		if (!layout.isFullPage()) {
			writer.startElement("div", layout);
			writer.writeAttribute("id", layout.getClientId(fc), "id");

			if (layout.getStyle() != null) {
				writer.writeAttribute("style", layout.getStyle(), "style");
			}

			if (layout.getStyleClass() != null) {
				writer.writeAttribute("class", layout.getStyleClass(), "styleClass");
			}
		}
	}

	@Override
	public void encodeEnd(FacesContext fc, UIComponent component) throws IOException {
		ResponseWriter writer = fc.getResponseWriter();
		Layout layout = (Layout) component;

		if (!layout.isFullPage()) {
			writer.endElement("div");
		}
	}

	@Override
	public boolean getRendersChildren() {
		return false;
	}

	protected void encodeScript(FacesContext fc, Layout layout) throws IOException {
		ResponseWriter writer = fc.getResponseWriter();
		String clientId = layout.getClientId();

		startScript(writer, clientId);
		writer.write("$(function() {");
		writer.write("PrimeFaces.cw('Layout', '" + layout.resolveWidgetVar() + "',{");
		writer.write("id:'" + clientId + "'");

		if (layout.isFullPage()) {
			writer.write(",forTarget:'body'");
		} else {
			writer.write(",forTarget:'" + ComponentUtils.escapeJQueryId(clientId) + "'");
		}

		LayoutOptions layoutOptions = (LayoutOptions) layout.getOptions();
		if (layoutOptions != null) {
			writer.write(",options:" + layoutOptions.render());
		} else {
			writer.write(",options:{}");
		}

		encodeClientBehaviors(fc, layout);

		writer.write("},true);});");
		endScript(writer);
	}
}
