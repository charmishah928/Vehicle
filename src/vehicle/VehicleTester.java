package vehicle;
/**
 * @author Charmi
 * * @Date: May 07, 2016
 * Vehicle project
 */
import javax.swing.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.util.Random;
public class VehicleTester extends JFrame{
	
	public static void main(String[] args){
		
		VehicleTester newV = new VehicleTester();
		newV.randomVehicle();
		
	}

	public void randomVehicle(){
		
		setTitle("Frame Charmi Shah");
		setSize(1200, 800);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		frame();
		setVisible(true);
		
		Car newcar  = new Car();
		Truck newTruck = new Truck();
		
		Random rndm = new Random();
		int rndmNumber = rndm.nextInt(2);
		
		for (int index = 0; index < 10; index++){
			if (rndmNumber == 0)
					add(newcar);
			if (rndmNumber == 1)
					add(newTruck);
		}
	}
	
	public void frame(){
		setLocationRelativeTo(null);
		setLayout(new GridLayout(1, 1, 0, 0));
		
	}
	
}
