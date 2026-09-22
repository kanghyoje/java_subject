package constructor;

public class Person {
    String name;
    int height;
    int weight;

    public Person() {}

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
}
