package pr05_pizzaCalories;

import java.text.DecimalFormat;

public class Pizza {
    private String name;
    private Dough dough;
    private Topping topping;
    private int numberOfTopings;
    private double totalCalories;

    public Pizza(String name, int numberOfTopings) {
        this.setName(name);
        this.setNumberOfTopings(numberOfTopings);
    }

    private void setName(String name) {
        if (name.length()<1||name.length()>15){
            throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
        }
        this.name = name;
    }

    private void setNumberOfTopings(int numberOfTopings) {
        if (numberOfTopings<0||numberOfTopings>10){
            throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
        }
        this.numberOfTopings = numberOfTopings;
    }

    public String getName() {
        return this.name;
    }
    public double getTotalCalories(){
        this.totalCalories = dough.getDoughCalories()+topping.getToppingCalories();
        return this.totalCalories;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return this.getName() + " - " + df.format(this.getTotalCalories());
    }
}

