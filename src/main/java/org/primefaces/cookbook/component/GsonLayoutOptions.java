package org.primefaces.cookbook.component;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Singleton instance of Gson to convert layout options.
 *
 * @author  Oleg Varaksin / last modified by $Author: ovaraksin@gmail.com $
 * @version $Revision: 1461 $
 */
public class GsonLayoutOptions {

	private static final GsonLayoutOptions INSTANCE = new GsonLayoutOptions();
	private Gson gson;

	private GsonLayoutOptions() {
		GsonBuilder gsonBilder = new GsonBuilder();
		gsonBilder.registerTypeAdapter(LayoutOptions.class, new LayoutOptionsSerializer());
		gson = gsonBilder.create();
	}

	public static Gson getGson() {
		return INSTANCE.gson;
	}
}
