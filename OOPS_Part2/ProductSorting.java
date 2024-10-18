//28. Design classes that need to sort a collection of Product objects either by product name or by price.
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class Products{
    private String name;
    private double price;
    public Products(String name,double price)
    {
        this.name=name;
        this.price=price;
    }
    public String getName()
    {
        return name;
    }
    public double getPrice()
    {
        return price;
    }
    @Override
    public String toString()
    {
        return "Products{name = '"+name+"',price = "+price+"}";
    }
}
class SortByName implements Comparator<Products>{
    @Override
    public int compare(Products p1,Products p2)
    {
        return p1.getName().compareTo(p2.getName());
    }
}
class SortByPrice implements Comparator<Products>
{
    @Override
    public int compare(Products p1,Products p2)
    {
        return Double.compare(p1.getPrice(),p2.getPrice());
    }
}
public class ProductSorting {
    public static void main(String[] args)
    {
       List<Products> productList=new ArrayList<>();
       productList.add(new Products("laptop", 1000));
       productList.add(new Products("mobile", 500));
       productList.add(new Products("tab",600));
       productList.add(new Products("monitor",300));
       System.out.println("Sorting by Name");
       Collections.sort(productList,new SortByName());
       for(Products product:productList)
       {
        System.out.println(product);
       }
       System.out.println("\nSorting by price");
       Collections.sort(productList, new SortByPrice());
       for(Products product:productList)
       {
        System.out.println(product);
       }
    }
}
