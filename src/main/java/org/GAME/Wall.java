package com;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Wall extends Actor {
	// add Image
    // create a new image object
	private Image image;
	// METHODS 
	public Wall(int x, int y) {
		super(x, y);
		
		initWall();
	}

	private void initWall() {
		
		ImageIcon icon = new ImageIcon("src/resources/wall.png");
		image = icon.getImage();
		
		//And this is how we get the image from the folder .
		setImage(image);
	}
}
