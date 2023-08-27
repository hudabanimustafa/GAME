package com;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Player extends Actor {
	 // The player inherits from Actor
	
	public Player(int x, int y) {
		super(x, y);
		
		initPlayer();
		}
	
	private void initPlayer() {
		// called to new image icon.
		
		ImageIcon icon = new ImageIcon("src/resources/actor.png");
		
		 /*
        Objects from the image class, which will be called to icon don't
        get.
         */
		
		Image image = icon.getImage();
		setImage(image);
	}
	 // move ball
	public void move(int x, int y) {

        int dx = x() + x;
        int dy = y() + y;
        
        setX(dx);
        setY(dy);
		
	}	

}
