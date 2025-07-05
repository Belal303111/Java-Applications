public class Product{
    protected String name;
    protected double price;
    // private int quantity;
    public Product(String name,double price){
        this.name=name;
        this.price=price;
        //  this.quantity=quantity;
    }
   public double getPrice(){
        return this.price;
    }
    String  getName(){
        return this.name;
    }
//    double getQuantity(){
//        return this.quantity;
//    }
}