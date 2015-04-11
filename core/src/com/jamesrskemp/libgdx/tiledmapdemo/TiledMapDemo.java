package com.jamesrskemp.libgdx.tiledmapdemo;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.maps.tiled.AtlasTmxMapLoader;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.badlogic.gdx.scenes.scene2d.Stage;

public class TiledMapDemo extends ApplicationAdapter {
	Stage stage;

	private TiledMap tiledMap;
	private OrthogonalTiledMapRenderer renderer;
	private OrthographicCamera camera;

	@Override
	public void create () {
		tiledMap = new AtlasTmxMapLoader().load("packed/sample.tmx");
		renderer = new OrthogonalTiledMapRenderer(tiledMap, 1 / 2f);

		camera = new OrthographicCamera();
		camera.update();

		stage = new TiledMapStage(tiledMap);
		// Don't forget to set the camera; otherwise you'll be wondering why things don't line up.
		stage.getViewport().setCamera(camera);
		Gdx.input.setInputProcessor(stage);
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0.7f, 0.7f, 0.7f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		renderer.setView(camera);
		renderer.render();

		stage.getViewport().setCamera(camera);
		stage.act(Gdx.graphics.getDeltaTime());
		stage.draw();
	}

	@Override
	public void resize(int width, int height) {
		super.resize(width, height);
		stage.getViewport().update(width, height, false);
	}

	@Override
	public void dispose() {
		super.dispose();
		stage.dispose();
	}
}
