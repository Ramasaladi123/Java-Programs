/*12. Create a class(Product) to store details of a product and provide required methods with the details prod_id, prod_name, price,quantity_on_hand
Methods are:  init(prod_id,prod_name, price)
getNetPrice() (returns the price after adding 12% tax)
purchase()
sell()*/
public class ProductA {
    private int pro_id;
    private String pro_name;
    private double price;
    private int quantity_on_hand;
    public ProductA(int pro_id,String pro_name,double price)
    {
        this.pro_id=pro_id;
        this.pro_name=pro_name;
        this.price=price;
        this.quantity_on_hand=0;
    }
    public double getNetPrice()
    {
        return price+1.12;
    }
    public void purchase(int quantity)
    {
        this.quantity_on_hand+=quantity;
        System.out.println("purchased "+quantity+" units "+"now the total quantity is "+this.quantity_on_hand);
    }
    public void sell(int quantity)
    {
        if(quantity>quantity_on_hand)
        {
            System.out.println("not enough stock");
        }
        else{
            this.quantity_on_hand-=quantity;
            System.out.println("sold "+quantity+" units "+"Remaining stock "+this.quantity_on_hand);
        }
    }
    public int getProid()
    {
        return pro_id;
    }
    public String getProname()
    {
        return pro_name;
    }
    public double getPrice()
    {
        return price;
    }
    public static void main(String[] args)
    {
        ProductA pa=new ProductA(1,"dress", 500);
        System.out.println(pa.getNetPrice());
        pa.purchase(6);
        pa.sell(2);
        System.out.println(pa.getPrice());
        System.out.println(pa.getProid());
        System.out.println(pa.getProname());
    }
}
