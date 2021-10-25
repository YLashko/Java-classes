import java.util.*;
public class InternetDevice
{
    String name;
    boolean isConnected;
    static String[] connectedDevices = {};
    
    InternetDevice(final String name, final boolean isConnected){
        this.name = name;
        if (isConnected){
            Connect();
        } else {
            this.isConnected = false;
        }
    }
    
    void Connect(){
        isConnected = true;
        connectedDevices = Arrays.copyOf(connectedDevices, connectedDevices.length + 1);
        connectedDevices[connectedDevices.length - 1] = name;
    }
    
    void Disconnect(){
        isConnected = false;
        for (int num = 0; num < connectedDevices.length; num++){
            if (name == connectedDevices[num]){
                connectedDevices = RemoveElement(connectedDevices, num);
                break;
            }
        }
    }
    
    String[] RemoveElement(String[] array, int elementNumber){
        String[] outputArray = new String[array.length - 1];
        for (int num = 0; num < elementNumber; num++){
            outputArray[num] = array[num];
        }
        
        for (int num = elementNumber; num < array.length - 1; num++){
            outputArray[num] = array[num + 1];
        }
        return outputArray;
    }
    
    boolean IsConnected(){
        return isConnected;
    }

    void DisplayStatus(){
        String connectStatus;
        if (isConnected){ connectStatus = "is connected"; } else { connectStatus = "is not connected"; }
        System.out.println("Name: " + name + "\nDevice "+ connectStatus + " to the internet");
    }
    
    void DisplayConnections(){
        System.out.println(connectedDevices);
    }
}
