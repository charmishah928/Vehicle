
package vehicle;

/**
 *
 * @author Charmi
 */
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.Random;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.*;

public class Truck extends Vehicle {

	private static final long serialVersionUID = 1L;

	public void paint(Graphics g){
		
		Random rndm = new Random();	
		/**
		 * Truck
		 */
			//Setting random positions
		for (int index = 0; index < 10; index++){
			Graphics2D Rectangle = (Graphics2D) g;
			int positionX = rndm.nextInt(800);
			int positionY = rndm.nextInt(700);
			
			
			//Back Part
			Rectangle.setColor(Color.BLUE);
			Rectangle.drawRect(positionX, positionY, 150, 35);
			
			
			//Front Part
			Rectangle.setColor(Color.gray);
			Rectangle.fillRect(positionX + 155, positionY + 15, 40, 20);
			Rectangle.drawRect(positionX + 155, positionY + 15, 40, 20);
			
			
			
			//Back Wheels
			Graphics2D Ellipse = (Graphics2D) g;
			
			Ellipse.setColor(Color.RED);
			((Graphics2D) Ellipse).draw(new Ellipse2D.Double(positionX, positionY + 35, 20, 20));
			((Graphics2D) Ellipse).draw(new Ellipse2D.Double(positionX + 25, positionY + 35, 20, 20));
			
			
			//Middle Wheels
			Ellipse.setColor(Color.RED);
			((Graphics2D) Ellipse).draw(new Ellipse2D.Double(positionX + 105, positionY + 35, 20, 20));
			((Graphics2D) Ellipse).draw(new Ellipse2D.Double(positionX + 125, positionY + 35, 20, 20));
			
			//Front Wheel
			Ellipse.setColor(Color.RED);
			((Graphics2D) Ellipse).draw(new Ellipse2D.Double(positionX + 175, positionY + 35, 20, 20));
			
		}
	}
}