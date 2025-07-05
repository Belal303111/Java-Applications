public class Checkout{
    private Customer customer;
    private Cart cart;
    public Checkout(Customer customer,Cart cart){
        this.customer=customer;
        this.cart=cart;
    }
    void Error_function(){
        if(cart.items.isEmpty()) System.out.println("Error:The cart is empty");
        if(customer.getBalance()<cart.order_total()) System.out.println("Error:the balance is less than the required");
    }
}
