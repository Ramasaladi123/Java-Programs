/*Create a class called Counter that stores a number and provides methods to increment, decrement and return the count. 
Provide the constructor without parameters that sets the values to zero and another constructor with parameters takes the values and starts from there.*/
public class Counter {
    private int counter=0;
    public Counter()
    {
        counter=0;
    }
    public Counter(int initial)
    {
        counter=initial;
    }
    public void increment()
    {
        counter++;
    }
    public void decrement()
    {
        counter--;
    }
    public int getCounter()
    {
        return counter;
    }
    public static void main(String[] args)
    {
       Counter c1=new Counter();
       c1.increment();
       System.out.println("Counter value : "+c1.getCounter());
       Counter c2=new Counter(10);
       c2.decrement();
       c2.increment();
       System.out.println("Counter value : "+c2.getCounter());
       c1.increment();
       System.out.println("Counter value : "+c1.getCounter());
    }
}
