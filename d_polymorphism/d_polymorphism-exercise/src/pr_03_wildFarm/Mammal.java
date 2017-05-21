package pr_03_wildFarm;

public class Mammal extends Animal {
    private String livingRegion;

    public Mammal(String animalName, String animalType, double animalWeight, int foodEaten) {
        super(animalName, animalType, animalWeight, foodEaten);

    }

    @Override
    public void makeSound() {

    }

    @Override
    public void eat(Food food) {

    }
}
