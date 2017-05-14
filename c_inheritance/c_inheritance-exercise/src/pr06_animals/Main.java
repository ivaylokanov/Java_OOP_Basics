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
        String animalType = "";
        while (!"Beast!".equals(animalType = reader.readLine())) {
            String[] arguments = reader.readLine().split("\\s+");
            String name = arguments[0];
            int age = Integer.valueOf(arguments[1]);
            String gender = arguments[2];
            try {
                Animal animal=null;
                switch (animalType) {
                    case "Cat":
                        animal = new Cat(name, age, gender);
                        break;
                    case "Dog":
                        animal = new Dog(name, age, gender);
                        break;
                    case "Frog":
                        animal = new Frog(name, age, gender);
                        break;
                    case "Kitten":
                        animal = new Kitten(name, age, gender);
                        break;
                    case "Tomcat":
                        animal = new Tomcat(name, age, gender);
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid input!");
                }
                animals.add(animal);
            } catch (IllegalArgumentException ex){
                System.out.println(ex.getMessage());
            }
        }
        for (Animal everyAnimal : animals) {
            System.out.println(everyAnimal);
            System.out.println(everyAnimal.produceSound());
        }
    }
}
