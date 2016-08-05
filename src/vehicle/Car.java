
package vehicle;

/**
 *
 * @author Charmi
 */
import java.util.Random;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JFrame;
import javax.swing.*;

public class Car extends Vehicle{
	
	private static final long serialVersionUID = 1L;

	public void paint(Graphics g){
		Random rndm = new Random();
		
		
		
		//Setting random positions
		for (int index = 0; index < 10; index++){
			Graphics2D Rectangle = (Graphics2D) g;
			int positionX = rndm.nextInt(900);
			int positionY = rndm.nextInt(700);
		
			
			/**
			 * Drawing Car Upper Body
			 */
			Rectangle.setColor(Color.ORANGE);
			Rectangle.drawRect(positionX, positionY, 75, 15);
			Rectangle.drawRect(positionX - 10, positionY + 15, 95, 25);
			
			/**
			 * Car Wheels
			 */
			Graphics2D Ellipse = (Graphics2D) g;
			Ellipse.setColor(Color.DARK_GRAY);
			((Graphics2D) Ellipse).draw(new Ellipse2D.Double(positionX, positionY + 40, 15, 15));
			((Graphics2D) Ellipse).draw(new Ellipse2D.Double(positionX + 60, positionY + 40, 15, 15));
			
		}
		
	}
}
