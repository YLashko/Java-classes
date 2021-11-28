public class Product
{
    private String name;
    private float price;
    Product(String name, float price){
        this.name = name;
        this.price = price;
    }
    
    String getName(){
        return name;
    }
    
    float getPrice(){
        return price;
    }
}
