package com.jamesrskemp.libgdx.tiledmapdemo;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

/**
 * Code from noone that was posted online at http://stackoverflow.com/a/24080643/11912
 */
public class TiledMapClickListener extends ClickListener {

	private TiledMapActor actor;

	public TiledMapClickListener(TiledMapActor actor) {
		this.actor = actor;
	}

	@Override
	public void clicked(InputEvent event, float x, float y) {
		System.out.println(actor.cell + " has been clicked.");
	}
}