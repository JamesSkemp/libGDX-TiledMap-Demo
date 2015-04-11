package com.jamesrskemp.libgdx.tiledmapdemo;

import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TiledMapTileLayer;
import com.badlogic.gdx.scenes.scene2d.Actor;

/**
 * Code from noone that was posted online at http://stackoverflow.com/a/24080643/11912
 * Slight tweak by myself to make Cell protected instead of private.
 */
public class TiledMapActor extends Actor {

	private TiledMap tiledMap;

	private TiledMapTileLayer tiledLayer;

	protected TiledMapTileLayer.Cell cell;

	public TiledMapActor(TiledMap tiledMap, TiledMapTileLayer tiledLayer, TiledMapTileLayer.Cell cell) {
		this.tiledMap = tiledMap;
		this.tiledLayer = tiledLayer;
		this.cell = cell;
	}
}