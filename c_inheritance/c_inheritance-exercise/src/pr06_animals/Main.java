package pr06_animals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Animal> animals = new ArrayList<>();
        String animalType;
        while (!"Beast!".equals(animalType = reader.readLine())) {
            String[] arguments = reader.readLine().split("\\s+");
            String name = arguments[0];
            int age = Integer.valueOf(arguments[1]);
            String gender = arguments[2];
            try {
                Animal animal=null;
                switch (animalType.toLowerCase()) {
                    case "cat":
                        animal = new Cat(name, age, gender);
                        break;
                    case "dog":
                        animal = new Dog(name, age, gender);
                        break;
                    case "frog":
                        animal = new Frog(name, age, gender);
                        break;
                    case "kitten":
                        animal = new Kitten(name, age);
                        break;
                    case "tomcat":
                        animal = new Tomcat(name, age);
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid input!");
                }
                System.out.println(animal);
                System.out.println(animal.produceSound());
            } catch (IllegalArgumentException ex){
                System.out.println(ex.getMessage());
            }
        }
        if (!animals.isEmpty()) {
            for (Animal everyAnimal : animals) {
                System.out.println(everyAnimal);
                System.out.println(everyAnimal.produceSound());
            }
        }
    }
}
