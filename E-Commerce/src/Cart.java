import java.util.LinkedList;

public class Cart{
    private Product product;
    private int quantity;
    LinkedList<Product> items=new LinkedList<>();
    public Cart(Product product,int quantity){
        this.product=product;
        this.quantity=quantity;
    }
    //add product to the cart
   public void add_item(Product product){
        items.add(product);
    }
//    void add(Product product,int quantity){
//
//    }
   public int getQuantity(Product product){
        return this.quantity;
    }
    //determine the price on the cart
  public double order_total(){
        double sum=0.0;
        for(Product p:items){
            sum+=p.getPrice() * getQuantity(p);
        }
        return sum;
    }
   public int shipping_fee(){
        //there are 10 pounds for any product
        int sum=0;
        for(int i=1;i<items.size();i++){
            sum+=i*10;
        }
        return sum;
    }
}
