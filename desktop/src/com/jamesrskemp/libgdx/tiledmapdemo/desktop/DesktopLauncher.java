package com.jamesrskemp.libgdx.tiledmapdemo.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.jamesrskemp.libgdx.tiledmapdemo.TiledMapDemo;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = 800;
		config.height = 480;
		config.title = "libGDX TiledMap Demo";

		new LwjglApplication(new TiledMapDemo(), config);
	}
}
