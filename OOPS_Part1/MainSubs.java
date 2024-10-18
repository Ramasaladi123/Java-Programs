class ProductSuper{
    protected String productName;
    protected double basePrice;
    public ProductSuper(String productName,double basePrice)
    {
        this.productName=productName;
        this.basePrice=basePrice;
    }
    public void print()
    {
        System.out.println("Product Name : "+productName);
        System.out.println("Base Price : "+basePrice);
    }
    public double getNetprice()
    {
        return basePrice;
    }
    public void setPrice(double basePrice)
    {
        this.basePrice=basePrice;
    }
}
class ImportDuty extends ProductSuper{
     private double importduty;
     public ImportDuty(String productName,double basePrice,double importduty)
     {
        super(productName,basePrice);
        this.importduty=importduty;
     }
     public void setImportDuty(double importduty)
     {
        this.importduty=importduty;
     }
     public double getNetprice()
     {
        return basePrice+(basePrice*importduty/100);
     }
     public void print()
     {
        super.print();
        System.out.println("Import duty : "+importduty);
        System.out.println("Net Price : "+getNetprice());
     }
}
class DiscountRate extends ProductSuper{
    private double discountRate;
    public DiscountRate(String productName,double basePrice,double discountRate)
    {
        super(productName,basePrice);
        this.discountRate=discountRate;
    }
    public void setDiscountRate(double discountRate)
    {
        this.discountRate=discountRate;
    }
    public double getNetprice()
    {
        return basePrice+(basePrice*discountRate/100);
    }
    public void print()
    {
        super.print();
        System.out.println("Discount Rate : "+discountRate);
        System.out.println("Net Price : "+getNetprice());
    }
}
public class MainSubs {
    public static void main(String[] args)
    {
        //UpCasting
        ProductSuper p1=new ImportDuty("tv", 10000, 16);
        p1.print();
        System.out.println();
        ProductSuper p2=new DiscountRate("laptop", 50000, 20);
        p2.print();
        System.out.println();
         
        //Downcasting
        if(p1 instanceof ImportDuty)
        {
        ImportDuty i1=(ImportDuty)p1;
        i1.print();
        }
        System.out.println();
        if(p2 instanceof DiscountRate)
        {
            DiscountRate d1=(DiscountRate)p2;
            d1.print();
        }

    }
}
