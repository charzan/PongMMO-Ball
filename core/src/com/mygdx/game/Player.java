package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

/**
 * Created by giselakottmeier on 6/16/15.
 */
public class Player {
    SpriteBatch batch;
    Texture paddle;
    Vector2 playerPosition;
    int width;
    public void create () {
        batch = new SpriteBatch();
        paddle = new Texture("badlogic.jpg");
        playerPosition = new Vector2();
        playerPosition.y=width/2;
    }
    public void moveLeft(){
        playerPosition.y++;
    }
    public void moveRight(){
        playerPosition.y--;
    }

}