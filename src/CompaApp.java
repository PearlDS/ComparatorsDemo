import java.util.NavigableSet;
import java.util.TreeSet;

public class CompaApp {
    public static void main(String[] args) {


        NavigableSet<String> dictionary = new TreeSet<>();

        dictionary.add("Bee");
        dictionary.add("snake");
        dictionary.add("lion");
        dictionary.add("aardvark");
        dictionary.add("Snake");
        dictionary.add("snake");

        dictionary.forEach(System.out::println);





    }
}
