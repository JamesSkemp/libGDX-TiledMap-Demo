package com.jamesrskemp.libgdx.tiledmapdemo.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.badlogic.gdx.tools.texturepacker.TexturePacker;
import com.jamesrskemp.libgdx.tiledmapdemo.TiledMapDemo;

public class DesktopLauncher {
	public static void main (String[] arg) {
		boolean packAssets = false;
		if (packAssets) {
			TexturePacker.Settings settings = new TexturePacker.Settings();
			settings.useIndexes = false;
			TexturePacker.process(settings, "raw", "packed", "sample.atlas");
		}

		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = 800;
		config.height = 480;
		config.title = "libGDX TiledMap Demo";

		new LwjglApplication(new TiledMapDemo(), config);
	}
}
