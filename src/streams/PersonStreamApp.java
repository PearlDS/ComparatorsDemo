package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PersonStreamApp {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Jan", true, 20));
        people.add(new Person("Vahni", false, 18));
        people.add(new Person("Kwame", true, 36));
        people.add(new Person("Fatiah", false, 75));
        people.add(new Person("Seungho", true,90));
        people.add(new Person("Liselot", false, 23));

        List<Person> eligibleWomen = people.stream().filter( person -> !person.isMale())
                                                    .filter(person -> person.getAge()>20)
                                                    .sorted(Comparator.comparingInt(Person::getAge))
                                                    .collect(Collectors.toList());

        for (Person p : eligibleWomen){
            System.out.println(p);
        }


    }

}
