package sets;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class PersonApp {
    public static void main(String[] args) {


       // Set<Person> personSet = new TreeSet<>(new AgeComparator());
        //anonieme geneste klas
//        Set<Person> personSet = new TreeSet<>(new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getAge()-o2.getAge();
//            }
//        });

        //lambda
//        Set<Person> personSet = new TreeSet<>((o1, o2) -> o1.getAge()-o2.getAge());

        //static method comparator (method referentie)
        Set<Person> personSet = new TreeSet<>(Comparator.comparingInt(Person::getAge).thenComparing(Person::getLastName).thenComparing(Person::getFirstName));

        Person person = new Person("Pearl", "Zola", 31);
        Person person1 = new Person("Pearl", "Bertens", 81);
        Person person2 = new Person("Pearl", "De Smet", 22);

        personSet.add(person);
        personSet.add(person1);
        personSet.add(person2);

        personSet.forEach(System.out::println);

        System.out.println(person.equals(person1));
        System.out.println(person.equals(person2));
    }
}
