package pr05_pizzaCalories;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main {
    public static Pizza pizza;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
double totalCalories=0.0;
        String input;
        while (!"END".equals(input = reader.readLine())) {
            String[] arguments = input.split("\\s+");
            String type = arguments[0];
            switch (type) {
                case "Dough":
                    try {
                        String flourType = arguments[1].toLowerCase();
                        String bakingTechnique = arguments[2].toLowerCase();
                        Double weight = Double.valueOf(arguments[3]);
                        Dough dough = new Dough(flourType, bakingTechnique, weight);
                        totalCalories += dough.getDoughCalories();

                    } catch (IllegalArgumentException ex) {
                        System.out.println(ex.getMessage());
                        return;
                    }
                    break;
                case "Topping":
                    try {
                        String toppingType = arguments[1].toLowerCase();
                        double toppingWeight = Double.valueOf(arguments[2]);
                        Topping topping = new Topping(toppingType, toppingWeight);
                       totalCalories = totalCalories + topping.getToppingCalories();
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
        DecimalFormat df = new DecimalFormat("0.00");
        if (pizza != null) {
            System.out.println(pizza + " - " + df.format(totalCalories) + " Calories");
        }else{
            System.out.println(df.format(totalCalories));
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
