package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	int width;
	int height;
	private Player pOne;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		width = Gdx.graphics.getWidth();
		height = Gdx.graphics.getHeight();
		pOne = new Player();
		pOne.create();
	}
	public void move(){
		if(Gdx.input.justTouched()){
			while(Gdx.input.getY()>pOne.playerPosition.y){
				pOne.moveLeft();
			}
			while (Gdx.input.getY()<pOne.playerPosition.y){
				pOne.moveRight();
			}
		}
	}
	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
//		System.out.println(Gdx.input.getY());
//		System.out.println(pOne.playerPosition.y);
		batch.draw(pOne.paddle, pOne.playerPosition.x, pOne.playerPosition.y);
		batch.end();
	}
}
