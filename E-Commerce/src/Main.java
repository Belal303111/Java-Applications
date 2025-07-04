import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    }
}
class E_Commerce{



}
class Product{
    private String name;
    private double price;
   // private int quantity;
    public Product(String name,double price){
        this.name=name;
        this.price=price;
      //  this.quantity=quantity;
    }
    double getPrice(){
        return this.price;
    }
    String  getName(){
        return this.name;
    }
//    double getQuantity(){
//        return this.quantity;
//    }
}
class Shippable extends Product{
   private double wight;
    public Shippable(String name,double price,double wight){
      super(name,price);
    this.wight=wight;
  }
  double getWight(){
        return this.wight;
  }
}
class Customer{
    private String name;
    private double balance;
    public Customer(String name,double balance){
        this.name=name;
        this.balance=balance;
    }
    double getBalance(){
        return this.balance;
    }
}
class Cart{
    private Product product;
    private int quantity;
    LinkedList<Product>items=new LinkedList<>();
    public Cart(Product product,int quantity){
        this.product=product;
        this.quantity=quantity;
    }
    //add product to the cart
    void add(Product product){
        items.add(product);
    }
    void add(Product product,int quantity){

    }
    int getQuantity(Product product){
        return this.quantity;
    }
    //determine the price on the cart
    double order_total(){
        double sum=0.0;
        for(Product p:items){
            sum+=p.getPrice() * getQuantity(p);
        }
        return sum;
    }
    int shipping_fee(){
        //there are 10 pounds for any product
        int sum=0;
        for(int i=1;i<items.size();i++){
            sum+=i*10;
        }
        return sum;
    }
}
class Checkout{
    private Customer customer;
    private Cart cart;
    public Checkout(Customer customer,Cart cart){
        this.customer=customer;
        this.cart=cart;
    }
    void Error_function(){
        if(cart.items.isEmpty()) System.out.println("The cart is empty");
        if(customer.getBalance()<cart.order_total()) System.out.println("the balance is less than the requiered");
    }
}
