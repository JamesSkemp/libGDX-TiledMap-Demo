package com.jamesrskemp.libgdx.tiledmapdemo.android;

import android.os.Bundle;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import com.jamesrskemp.libgdx.tiledmapdemo.TiledMapDemo;

public class AndroidLauncher extends AndroidApplication {
	@Override
	protected void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();
		config.useCompass = false;
		config.useAccelerometer = false;

		initialize(new TiledMapDemo(), config);
	}
}
