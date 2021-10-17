public class Lamp
{
    boolean is_on = false;
    
    void TurnOn() {
        is_on = true;
    }
    
    void TurnOff() {
        is_on = false;
    }
    
    void DisplayInfo() {
        if (is_on) {
            System.out.println("The lamp is on");
        } else {
            System.out.println("The lamp is off");
        }
    }
}
