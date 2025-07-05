public class Product{
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