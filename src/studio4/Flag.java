package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(Color.red);
		StdDraw.filledRectangle(0.5, 0.5, 0.5, 0.5);
		double x[] = {0.3,0.5,0.7};
		double y[] = {0.3,0.7,0.3};
		StdDraw.setPenColor(128,0,32);
		StdDraw.filledPolygon(x,y);
		
		StdDraw.setPenColor(Color.blue);
		StdDraw.filledCircle(Math.random(), Math.random(), Math.random()/5);
		
		StdDraw.setPenColor(Color.yellow);
		StdDraw.filledCircle(0, 1, 0.2);
		
		StdDraw.setPenColor(Color.black);
		StdDraw.setPenRadius(0.01);
		StdDraw.rectangle(0.5, 0.5,0.5,0.5);
	}
}