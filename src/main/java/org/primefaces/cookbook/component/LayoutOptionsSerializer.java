package org.primefaces.cookbook.component;

import com.google.gson.*;

import java.lang.reflect.Type;
import java.util.Map;
import java.util.Set;

/**
 * LayoutOptionsSerializer
 *
 * @author  Oleg Varaksin / last modified by $Author: $
 * @version $Revision: 1.0 $
 */
public class LayoutOptionsSerializer implements JsonSerializer<LayoutOptions> {

	public JsonElement serialize(LayoutOptions src, Type typeOfSrc, JsonSerializationContext context) {
		JsonObject result = new JsonObject();

		Set<Map.Entry<String, Object>> options = src.getOptions().entrySet();
		for (Map.Entry<String, Object> entry : options) {
			Object value = entry.getValue();
			JsonPrimitive jsonPrimitive = null;

			if (value instanceof Boolean) {
				jsonPrimitive = new JsonPrimitive((Boolean) value);
			} else if (value instanceof Number) {
				jsonPrimitive = new JsonPrimitive((Number) value);
			} else if (value instanceof String) {
				jsonPrimitive = new JsonPrimitive((String) entry.getValue());
			}

			result.add(entry.getKey(), jsonPrimitive);
		}

		if (src.getPanesOptions() != null) {
			result.add("panes", context.serialize(src.getPanesOptions(), src.getPanesOptions().getClass()));
		}

		if (src.getNorthOptions() != null) {
			result.add("north", context.serialize(src.getNorthOptions(), src.getNorthOptions().getClass()));
		}

		if (src.getSouthOptions() != null) {
			result.add("south", context.serialize(src.getSouthOptions(), src.getSouthOptions().getClass()));
		}

		if (src.getWestOptions() != null) {
			result.add("west", context.serialize(src.getWestOptions(), src.getWestOptions().getClass()));
		}

		if (src.getEastOptions() != null) {
			result.add("east", context.serialize(src.getEastOptions(), src.getEastOptions().getClass()));
		}

		if (src.getCenterOptions() != null) {
			result.add("center", context.serialize(src.getCenterOptions(), src.getCenterOptions().getClass()));
		}

		if (src.getChildOptions() != null) {
			result.add("childOptions", context.serialize(src.getChildOptions(), src.getChildOptions().getClass()));
		}

		return result;
	}
}
