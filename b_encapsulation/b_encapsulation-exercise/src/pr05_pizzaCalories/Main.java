package pr05_pizzaCalories;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static Pizza pizza;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input;
        while (!"END".equals(input = reader.readLine())) {
            String[] arguments = input.split("\\s+");
            String type = arguments[0];
            switch (type) {
                case "Dough":
                    try {
                        String flourType = arguments[1];
                        String bakingTechnique = arguments[2];
                        Double weight = Double.valueOf(arguments[3]);
                        Dough dough = new Dough(flourType, bakingTechnique, weight);
                        //   System.out.printf("%.2f%n",dough.getDoughCalories());
                    } catch (IllegalArgumentException ex) {
                        System.out.println(ex.getMessage());
                        return;
                    }
                    break;
                case "Topping":
                    try {
                        String toppingType = arguments[1];
                        double toppingWeight = Double.valueOf(arguments[2]);
                        Topping topping = new Topping(toppingType, toppingWeight);
                        // System.out.printf("%.2f%n",topping.getToppingCalories());
                    } catch (IllegalArgumentException ex) {
                        System.out.println(ex.getMessage());
                        return;
                    }
                    break;
                case "Pizza":
                    try {
                        String name = arguments[1];
                        int numberOfTopings = Integer.valueOf(arguments[2]);
                        pizza = new Pizza(name, numberOfTopings);
                    } catch (IllegalArgumentException exe) {
                        System.out.println(exe.getMessage());
                        return;
                    }
            }
        }
        if (pizza != null) {
            System.out.println(pizza);
        }

        /*input
Pizza Meatfull 5
Dough White Chewy 200
Topping Meat 50
Topping Cheese 50
Topping Meat 20
Topping Sauce 10
Topping Meat 30
END
         */
        /*output
Meatfull – 1028.00 Calories.
         */
    }
}
