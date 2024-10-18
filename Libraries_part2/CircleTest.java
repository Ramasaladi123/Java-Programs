//41. Create a class called Circle with x & y radius, Now create Hashset & insert circle objects with some duplicates, 
//and also use treeset for the same for circle objects and see what happens.
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class Circle implements Comparable<Circle> {
    private double x; 
    private double y; 
    private double radius;

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) 
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Circle circle = (Circle) obj;
        return Double.compare(circle.radius, radius) == 0 && x == circle.x && y == circle.y;
    }

    @Override
    public int hashCode() {
        return (int) (x + y + radius);
    }

    @Override
    public int compareTo(Circle other) {
        return Double.compare(this.radius, other.radius);
    }

    @Override
    public String toString() {
        return String.format("Circle(x: %.2f, y: %.2f, radius: %.2f)", x, y, radius);
    }
}

public class CircleTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle(1, 1, 2.5);
        Circle circle2 = new Circle(2, 2, 3.0);
        Circle circle3 = new Circle(1, 1, 2.5); 
        Circle circle4 = new Circle(3, 3, 1.5);
        Circle circle5 = new Circle(2, 2, 3.0);

        Set<Circle> hashSet = new HashSet<>();
        hashSet.add(circle1);
        hashSet.add(circle2);
        hashSet.add(circle3); 
        hashSet.add(circle4);
        hashSet.add(circle5); 

        System.out.println("HashSet contents (may contain duplicates):");
        for (Circle circle : hashSet) {
            System.out.println(circle);
        }

        Set<Circle> treeSet = new TreeSet<>();
        treeSet.add(circle1);
        treeSet.add(circle2);
        treeSet.add(circle3); 
        treeSet.add(circle4);
        treeSet.add(circle5); 

        System.out.println("\nTreeSet contents (no duplicates, sorted by radius):");
        for (Circle circle : treeSet) {
            System.out.println(circle);
        }
    }
}

