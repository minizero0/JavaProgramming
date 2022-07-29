package boostcamp;

import javax.swing.JOptionPane;

import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class OKJavaGoInHome {

	public static void main(String[] args) {
		
		String id = JOptionPane.showInputDialog("Enter a path");
		String Bright = JOptionPane.showInputDialog("Enter a path");

		
		//Elevator call
		Elevator myElevator = new Elevator(id);
		myElevator.callForUp(1);
		
		//security off
		Security mySecurity = new Security(id);
		mySecurity.off();
		
		//Light on
		Lighting hallLamp = new Lighting(id);
		hallLamp.on();
		
		Lighting floorLamp = new Lighting(id);
		floorLamp.on();
		
		DimmingLights moodLamp = new DimmingLights(id + "moodLamp");
		moodLamp.setBright(Double.parseDouble(Bright));
		moodLamp.on();
		
		

	}

}
