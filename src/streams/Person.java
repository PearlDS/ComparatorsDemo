package streams;

public class Person {
    private String name;
    private boolean male;
    private int age;

    public Person(String name, boolean male) {
        this.name = name;
        this.male = male;
    }

    public Person(String name, boolean male, int age) {
        this.name = name;
        this.male = male;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", male=" + male +
                ", age=" + age +
                '}';
    }
}
