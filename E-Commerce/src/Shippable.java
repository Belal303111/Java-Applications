public class Shippable extends Product{
    private double wight;
    public Shippable(String name,double price,double wight){
        super(name,price);
        this.wight=wight;
    }
    double getWight(){
        return this.wight;
    }
}