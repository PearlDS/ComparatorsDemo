package queues;

public class Burgerorder implements Comparable<Burgerorder>{
    private String name;
    private int number;

    public Burgerorder(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Burgerorder{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }

    @Override
    public int compareTo(Burgerorder o) {
        return this.number - o.number;
    }
}
