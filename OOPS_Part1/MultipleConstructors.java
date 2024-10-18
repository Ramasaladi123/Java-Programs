//13. Introduce multiple constructors in Product class.
class ProductB
{
   private int pro_id;
   private String pro_name;
   private double price;
   private int quantity_on_hand; 
   public ProductB(int pro_id,String pro_name)
   {
    this.pro_id=pro_id;
    this.pro_name=pro_name;
    price=0.0;
    quantity_on_hand=0;

   }
   public ProductB(int pro_id,String pro_name,double price)
   {
    this.pro_id=pro_id;
    this.pro_name=pro_name;
    this.price=price;
    quantity_on_hand=0;
   }
   public ProductB(int pro_id,String pro_name,double price,int quantity_on_hand)
   {
    this.pro_id=pro_id;
    this.pro_name=pro_name;
    this.price=price;
    this.quantity_on_hand=quantity_on_hand;
   }
   public void print()
   {
    System.out.println("product_Id : "+pro_id+"\nproduct_Name : "+pro_name);
   }
   public double getPrice()
   {
    return price;
   }
   public int getQuantity()
   {
    return quantity_on_hand;
   }
}
public class MultipleConstructors {
    public static void main(String[] args)
    {
        ProductB pb=new ProductB(1, "soap");
        ProductB pb1=new ProductB(2, "shampoo",200);
        ProductB pb2=new ProductB(3, "dress",200,10);
        pb.print();
        pb1.print();
        System.out.println("Price : "+pb1.getPrice());
        pb2.print();
        System.out.println("Price : "+pb2.getPrice());
        System.out.println("Quantity : "+pb2.getQuantity());
    }
}
