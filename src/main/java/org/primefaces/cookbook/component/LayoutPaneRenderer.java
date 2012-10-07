package org.primefaces.cookbook.component;

import java.io.IOException;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;

import org.primefaces.renderkit.CoreRenderer;

/**
 * LayoutPaneRenderer
 *
 * @author  Oleg Varaksin / last modified by $Author: $
 * @version $Revision: 1.0 $
 */
public class LayoutPaneRenderer extends CoreRenderer {

	@Override
	public void encodeBegin(FacesContext fc, UIComponent component) throws IOException {
		ResponseWriter writer = fc.getResponseWriter();
		LayoutPane layoutPane = (LayoutPane) component;

		String position = layoutPane.getPosition();
		String combinedPosition = position;

		UIComponent parent = layoutPane.getParent();
		while (parent instanceof LayoutPane) {
			combinedPosition = ((LayoutPane) parent).getPosition() + Layout.POSITION_SEPARATOR + combinedPosition;
			parent = parent.getParent();
		}

		// save combined position
		layoutPane.setCombinedPosition(combinedPosition);

		boolean hasSubPanes = false;
		for (UIComponent subChild : layoutPane.getChildren()) {
			// check first level
			if (hasSubPanes) {
				break;
			}

			if (subChild instanceof LayoutPane) {
				if (!subChild.isRendered()) {
					continue;
				}

				hasSubPanes = true;
			} else {
				for (UIComponent subSubChild : subChild.getChildren()) {
					// check second level
					if (subSubChild instanceof LayoutPane) {
						if (!subSubChild.isRendered()) {
							continue;
						}

						hasSubPanes = true;

						break;
					}
				}
			}
		}

		UIComponent header = layoutPane.getFacet("header");

		writer.startElement("div", null);
		writer.writeAttribute("id", layoutPane.getClientId(fc), "id");
		if (hasSubPanes) {
			writer.writeAttribute("class", "ui-layout-" + position + " " + Layout.STYLE_CLASS_PANE_WITH_SUBPANES, null);
		} else {
			if (header != null) {
				writer.writeAttribute("class", "ui-layout-" + position + " " + Layout.STYLE_CLASS_PANE, null);
			} else {
				writer.writeAttribute("class",
				                      "ui-layout-" + position + " " + Layout.STYLE_CLASS_PANE + " "
				                      + Layout.STYLE_CLASS_PANE_CONTENT, null);
			}
		}

		writer.writeAttribute("data-combinedposition", combinedPosition, null);

		// encode header
		if (header != null) {
			writer.startElement("div", null);
			writer.writeAttribute("class", Layout.STYLE_CLASS_PANE_HEADER, null);

			header.encodeAll(fc);

			writer.endElement("div");
		}

		// encode content
		if (header != null) {
			writer.startElement("div", null);
			writer.writeAttribute("class", "ui-layout-content " + Layout.STYLE_CLASS_PANE_CONTENT, null);
			writer.writeAttribute("style", "border:none", null);
			renderChildren(fc, layoutPane);

			writer.endElement("div");
		} else {
			renderChildren(fc, layoutPane);
		}
	}

	@Override
	public void encodeEnd(FacesContext fc, UIComponent component) throws IOException {
		ResponseWriter writer = fc.getResponseWriter();

		writer.endElement("div");
	}

	@Override
	public boolean getRendersChildren() {
		return true;
	}

	@Override
	public void encodeChildren(FacesContext fc, UIComponent component) throws IOException {
		// nothing to do
	}
}
