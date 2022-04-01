package sets;

import java.util.*;

public class TreeSetApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        NavigableSet<String> words = new TreeSet<>();

        while (words.size()<3){
            String word = scanner.next();
            words.add(word);
            }

        words.forEach(System.out::println);

        System.out.println("----");

        System.out.println(words.first());
        System.out.println(words.last());


        }


    }

