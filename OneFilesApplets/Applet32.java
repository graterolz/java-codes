import java.applet.*;
import java.awt.*;

public class Applet32 extends Applet {
	String companyName = new String("Event Handlers Incorporated");
	//
	public void paint(Graphics gr) {
		gr.drawString(companyName,10,100);
	}
}