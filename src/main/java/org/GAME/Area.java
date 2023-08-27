package com;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Area extends Actor {
	
	public Area(int x, int y) {
		super(x, y);
		
		initArea();
	}
	
	private void initArea() {
	
	ImageIcon icon = new ImageIcon("src/resources/area.png");
	   /*
    I don't get image in the brackets, we're not going to write
    anything, so I will just right here,
     */
	Image image = icon.getImage();
	setImage(image);
	}

}
