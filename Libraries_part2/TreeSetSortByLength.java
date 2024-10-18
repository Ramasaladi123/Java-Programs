//42. Create a treeset of strings and sort them by length (use Comparator)
import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetSortByLength {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>(Comparator.comparingInt(String::length).thenComparing(Comparator.naturalOrder()));

        treeSet.add("apple");
        treeSet.add("banana");
        treeSet.add("kiwi");
        treeSet.add("orange");
        treeSet.add("pear");
        treeSet.add("strawberry");
        treeSet.add("grape");

        System.out.println("Strings sorted by length:");
        for (String fruit : treeSet) {
            System.out.println(fruit);
        }
    }
}

