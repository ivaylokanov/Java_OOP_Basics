package pr06_animals;

public class Kitten extends Animal{
    public Kitten(String name, int age, String gender) {
        super(name, age, gender);
    }
    @Override
    public String produceSound() {
        return "Miau";
    }


}
