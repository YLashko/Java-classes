
public class Smartphone
{
    String name; 
    float price; 
    float screen_size; 
    int cameras_count; 
    int battery_capacity;
    public Smartphone(String get_name, float get_price, float get_screen_size, int get_cameras_count, int get_battery_capacity) {
        name = get_name;
        price = get_price;
        screen_size = get_screen_size;
        cameras_count = get_cameras_count;
        battery_capacity = get_battery_capacity;
    }
    
    void ShowSpecs(){
        System.out.println("Name: " + name + "\nPrice: " + price + "\nScreen size: " + screen_size + "inches\nCameras count: " + cameras_count + "\nBattery capacity: "+ battery_capacity);
    }
    
    void ShowPrice(){
        System.out.println("Price: " + price);
    }
    
    void IsWorthBuying(){
        if ((battery_capacity / 10) < price) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}
