import java.util.LinkedList;

public class Require_Shipping extends Product{
    LinkedList<String>shipping_list=new LinkedList<>();
    public Require_Shipping(String name,double price)
    {
        super(name,price);
        shipping_list.add("TV");
        shipping_list.add("Cheese");
    }
public void print_shipping_products(){
    System.out.println("The shipping products is:");
        for(int i=0;i<shipping_list.size();i++)
        {
            System.out.print(shipping_list.get(i)+"\t");
        }
}
public void add_product_to_shipping(Product product)
{
    shipping_list.add(product.getName());
}
}
