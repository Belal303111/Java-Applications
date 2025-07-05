import java.util.LinkedList;

public class E_Commerce{
LinkedList<Product>products=new LinkedList<>();
public E_Commerce(){
    Product p1=new Product("TV",5000.0);
    products.add(p1);
    Product p2=new Product("Mopile",3000.99);
    products.add(p2);
    Product p3=new Product("Cheese",100.0);
    products.add(p3);
    Product p4=new Product("Biscuits",30.5);
    products.add(p4);
}
public void Print_products()
{
    for(int i=0;i<products.size();i++)
        System.out.println("The name of the product:"+products.get(i).getName()+"\tThe price of the product:"+products.get(i).getPrice()+"EGP");
}
public void add_product(Product product)
{
    products.add(product);
}
public void checkout(Customer customer,Cart cart)
{
  //  customer.getBalance();   the balance with customer
 //   cart.order_total();      the total price
    if(cart.items.isEmpty())
    {
        System.out.println("Error:The cart is empty");
        return;
    }
    if(customer.getBalance()<cart.order_total())
    {
        System.out.println("Error:the balance is less than the required");
        return;
    }
    for(int i=0;i<cart.items.size();i++)
    {
        double receipt= customer.getBalance()- cart.order_total();
        System.out.println(cart.getQuantity(cart.items.get(i))+"x\t"+cart.items.get(i).getName()+"\t"+cart.items.get(i).getPrice());
    }

}
}
