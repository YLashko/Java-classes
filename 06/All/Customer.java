import java.util.Arrays;
public class Customer
{
    private String name;
    private float balance;
    private Product[] products = {};
    
    Customer(String name, float balance){
        this.name = name;
        this.balance = balance;
    }
    
    void addProduct(Product product){
        products = Arrays.copyOf(products, products.length + 1);
        products[products.length - 1] = product;
    }
    
    float getBalance(){
        return balance;
    }
    
    void addToBalance(float amount){
        balance += amount;
    }
    
    void buyFrom(Seller seller, String productName){
        seller.sellTo(this, productName);
    }
    
    void displayProducts(){
        String productsStr = "";
        for (Product product : products){
            productsStr += (product.getName() + "\n");
        }
        System.out.println(name + "'s products:\n" + productsStr);
    }
    
    public static void main(String[] args){
        Product cola = new Product("Cola", 5.0f);
        Product sprite = new Product("Sprite", 4.5f);
        Product bread = new Product("Bread", 3.0f);
        Product cake = new Product("Cake", 10.0f);
        Seller cocaCola = new Seller("Coca Cola", new Product[] {cola, sprite});
        Seller bakery = new Seller("Bakery", new Product[] {bread, cake});
        Customer john = new Customer("John", 20f);
        john.buyFrom(cocaCola, "Sprite");
        john.buyFrom(cocaCola, "Cola");
        john.buyFrom(bakery, "Cake");
        john.buyFrom(bakery, "Cake");
        john.displayProducts();
    }
}
