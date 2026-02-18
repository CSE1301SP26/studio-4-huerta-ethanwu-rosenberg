package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
 StdDraw.setPenRadius(0.05);
           StdDraw.setPenColor(StdDraw.CYAN);
           StdDraw.filledRectangle(0.5, 0.5, .5, .3);
           StdDraw.setPenColor(StdDraw.WHITE);
		   StdDraw.setPenRadius(0.05);
           StdDraw.line(0, .8, 1, 0.5);
		   StdDraw.line(0, .2, 1, 0.5);
		       StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
		   StdDraw.circle(.5,.5,.07);
  StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
		    StdDraw.line(.2, .2, .2, 0.8);

 StdDraw.setPenColor(StdDraw.WHITE);
StdDraw.filledRectangle(0.5, 0.9, .5, .1);
StdDraw.filledRectangle(0.5, 0.1, .5, .1);






	}
}