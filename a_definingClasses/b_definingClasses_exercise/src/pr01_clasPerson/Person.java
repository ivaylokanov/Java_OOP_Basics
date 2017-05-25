package pr01_clasPerson;


public class Person {
    public static final String NO_NAME = "No name";
    public static final int DEFAULT_AGE = 1;
    private String name;
    private int age;

    public Person() {
        this.name= NO_NAME;
        this.age= DEFAULT_AGE;
    }

    public Person(int age) {
        this.age = age;
        this.name=NO_NAME;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
