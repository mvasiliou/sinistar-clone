package _08final.mvc.model;

import java.awt.*;

public interface Movable {
	enum Team {
		FRIEND, FOE, FLOATER, DEBRIS
	}

	//for the game to move and draw movable objects
	void move();
	void draw(Graphics g);

	//for collision detection
	Point getCenter();
	int getRadius();
	Team getTeam();
}
