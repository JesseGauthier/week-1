package week2;

import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;
import acm.graphics.*;
import acm.util.*;

public class RandomCircles extends GraphicsProgram {
	
	private static final int N_CIRCLES = 10; /* tells the program when to stop making circles */
	private static final double MIN_RADIUS = 5; /* sets dimensions for smallest random circle */
	private static final double MAX_RADIUS = 50; /* sets dimensions for largest random circle */
	
	public void run() {
		RandomGenerator rgen = RandomGenerator.getInstance();
		for (int i = 0; i < N_CIRCLES; i++) {
			double r = rgen.nextDouble(MIN_RADIUS, MAX_RADIUS);
			double x = rgen.nextDouble(0, getWidth() - 2 * r);
			double y = rgen.nextDouble(0, getHeight() - 2 * r);
			GOval circle = new GOval(x, y, 2 * r, 2 * r);
			circle.setFilled(true);
			circle.setColor(rgen.nextColor());
			add(circle);
		}    /* the possiblility of a larger random circle generating over/after a smaller random circle means all 10 cirlcles might not be completely visable */
	}        
}
