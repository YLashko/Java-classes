public class Seller
{
    private String name;
    private Product[] products;
    Seller(String name, Product[] productList){
        this.name = name;
        products = productList;
    }
    
    void sellTo(Customer customer, String productName){
        Product product = productByName(productName);
        if (customer.getBalance() >= product.getPrice()){
            customer.addToBalance( - product.getPrice());
            customer.addProduct(product);
        }
    }
    
    private Product productByName(String name){
        for (Product product: products){
            if (product.getName() == name){
                return product;
            }
        }
        return null;
    }
    
}
