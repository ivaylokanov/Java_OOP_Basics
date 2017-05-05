package pr03_animalFarm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String chickenName = reader.readLine();
        int chickenAge = Integer.valueOf(reader.readLine());
        try {
            Chicken chicken = new Chicken(chickenName, chickenAge);
            System.out.printf("Chicken %s (age %d) can produce %.0f eggs per day.", chicken.getChickenName()
                    , chicken.getChickenAge(), chicken.productPerDay());
        } catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
    }
}
