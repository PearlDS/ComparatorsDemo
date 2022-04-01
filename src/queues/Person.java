package queues;

public class Person {
    private String name;
    private boolean male;

    public Person(String name, boolean male) {
        this.name = name;
        this.male = male;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", male=" + male +
                '}';
    }
}
