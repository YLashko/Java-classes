import java.util.Arrays;
public class Room
{
    int number;
    int beds;
    boolean isOccupied;
    String[] guestName = {};
    
    Room(int number, int beds){
        this.number = number;
        this.beds = beds;
    }
    
    void Checkin(String guestName){
        this.guestName = Arrays.copyOf(this.guestName, this.guestName.length + 1);
        this.guestName[this.guestName.length - 1] = guestName;
        isOccupied = true;
    }
    
    void Checkout(){
        this.guestName = new String[0];
        isOccupied = false;
    }
    
    boolean IsOccupied(){
        return isOccupied;
    }
    
    void ReportByBeds(int beds){
        if (this.beds == beds){
            System.out.println(this.toString());
        }
    }
    
    void ReportByVacant(boolean vacant){
        if ((vacant && !isOccupied) || (!vacant && isOccupied)){
            System.out.println(this.toString());
        }
    }
    
    void ReportByAvailableBeds(int beds){
        if (this.beds - guestName.length == beds){
            System.out.println(this.toString());
        }
    }
    
    public String toString(){
        return ("Room number: " + number + "\nNumber of beds: " + beds + "\nBed is occupied? " + isOccupied + "\nGuest name: " + ArrayToString(guestName));
    }
    
    String ArrayToString(String[] array){
        String output = "";
        for (String element : array){
            output += (element + " ");
        }
        return output;
    }
    
    public static void main(String[] args){
        Room[] rooms = new Room[6];
        rooms[0] = new Room(1, 2);
        rooms[1] = new Room(2, 2);
        rooms[2] = new Room(3, 2);
        rooms[3] = new Room(4, 3);
        rooms[4] = new Room(5, 3);
        rooms[5] = new Room(6, 1);
    }
}
