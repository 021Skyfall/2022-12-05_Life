import javax.swing.JOptionPane;
import org.opentutorials.iot.Aircon;
import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class Life_IOT_Swing {
    // args = parameter, 매개변수
    public static void main(String[] args) {

        String id = JOptionPane.showInputDialog("APT NAME?");
        String bright = JOptionPane.showInputDialog("Set Bright Level");

        // Elevator call
        Elevator myElevator = new Elevator(id);
        myElevator.callForUp(1);
        // Security off
        Security mySecurity = new Security(id);
        mySecurity.off();
        // Light on
        Lighting hallLamp = new Lighting(id+" / Hall Lamp");
        hallLamp.on();

        Lighting floorLamp = new Lighting(id+" / floor Lamp");
        floorLamp.on();
        // Aircon on
        Aircon AirconOn = new Aircon(id+" / Aircon On");
        AirconOn.on();

        DimmingLights moodLamp = new DimmingLights(id+" moodLamp");
        moodLamp.setBright(Double.parseDouble(bright));
    }
}
