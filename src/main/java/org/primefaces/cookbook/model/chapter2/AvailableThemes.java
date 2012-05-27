package org.primefaces.cookbook.model.chapter2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * AvailableThemes
 *
 * @author  Oleg Varaksin / last modified by $Author: $
 * @version $Revision: 1.0 $
 */
public class AvailableThemes implements Serializable {

	private static final long serialVersionUID = 20120517L;

	private static AvailableThemes INSTANCE = null;

	public static AvailableThemes instance() {
		if (INSTANCE == null) {
			INSTANCE = new AvailableThemes();
		}

		return INSTANCE;
	}

	private final HashMap<String, Theme> themesAsMap;
	private final List<Theme> themes;

	private AvailableThemes() {
		List<String> themeNames = new ArrayList<String>();
		themeNames.add("afterdark");
		themeNames.add("afternoon");
		themeNames.add("afterwork");
		themeNames.add("aristo");
		themeNames.add("black-tie");
		themeNames.add("blitzer");
		themeNames.add("bluesky");
		themeNames.add("casablanca");
		themeNames.add("cupertino");
		themeNames.add("dark-hive");
		themeNames.add("dot-luv");
		themeNames.add("eggplant");
		themeNames.add("excite-bike");
		themeNames.add("flick");
		themeNames.add("glass-x");
		themeNames.add("home");
		themeNames.add("hot-sneaks");
		themeNames.add("humanity");
		themeNames.add("le-frog");
		themeNames.add("midnight");
		themeNames.add("mint-choc");
		themeNames.add("overcast");
		themeNames.add("pepper-grinder");
		themeNames.add("redmond");
		themeNames.add("rocket");
		themeNames.add("sam");
		themeNames.add("smoothness");
		themeNames.add("south-street");
		themeNames.add("start");
		themeNames.add("swanky-purse");
		themeNames.add("trontastic");
		themeNames.add("ui-darkness");
		themeNames.add("ui-lightness");
		themeNames.add("vader");

		themesAsMap = new HashMap<String, Theme>();
		themes = new ArrayList<Theme>();

		for (String themeName : themeNames) {
			Theme theme = new Theme(themeName, "/resources/images/themeswitcher/" + themeName + ".png");

			themes.add(theme);
			themesAsMap.put(theme.getName(), theme);
		}
	}

	public final List<Theme> getThemes() {
		return themes;
	}

	public Theme getTheme(String name) {
		return themesAsMap.get(name);
	}
}
