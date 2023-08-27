package com;

import java.awt.Image;

public class Actor {

    private final int SPACE = 20;

    private int x;
    private int y;
    private Image image;

    public Actor(int x, int y) {
        
        this.x = x;
        this.y = y;
    }

    public Image getImage() {
        return image;
    }
	
    public void setImage(Image img) {
    	 // And this is the function that would enable us to get an image.
        image = img;
    }
    /*
    here going to return in the same way why and
   after that led to the set X and set Y position,
    */

    public int x() {       
        return x;
    }

    public int y() {        
        return y;
    }

    public void setX(int x) {        
        this.x = x;
    }

    public void setY(int y) {        
        this.y = y;
    }
    // character is moving left, right, up and down
    public boolean isLeftCollision(Actor actor) {
        return x() - SPACE == actor.x() && y() == actor.y();
    }

    public boolean isRightCollision(Actor actor) {
        return x() + SPACE == actor.x() && y() == actor.y();
    }

    public boolean isTopCollision(Actor actor) {        
        return y() - SPACE == actor.y() && x() == actor.x();
    }

    public boolean isBottomCollision(Actor actor) {   
        return y() + SPACE == actor.y() && x() == actor.x();
    }
	
}
