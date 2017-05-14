package pr06_animals;

public class Tomcat extends Animal {

    public Tomcat(String name, int age, String gender) {
        super(name, age, gender);
    }
    @Override
    public String produceSound() {
        return "Give me one million b***h";
    }

}
