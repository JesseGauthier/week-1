package week2;

import acm.graphics.*;
import acm.program.*;
import java.awt.event.*;

public class DrawingLines extends GraphicsProgram { /* uses mouse to draw straight lines */
	
	public void init() {
		addMouseListeners();
	}
	
	public void mousePressed(MouseEvent e) { /* initiates starting point of line */
		double x = e.getX();
		double y = e.getY();
		line = new GLine(x, y, x, y);
		add(line);
	}

	public void mouseDragged(MouseEvent e) { /* sets endpoint of line */
		double x = e.getX();
		double y = e.getY();
		line.setEndPoint(x, y);
	}
	private GLine line;
}
