package pr05_pizzaCalories;


public class Topping {
    public static final int DEFAULT_TOPPINGCALORIES = 2;
    private double totalToppingCalories=0.0;
    private double toppingCalories;
    private String type;
    private double weight;

    public Topping(String type, double weight) {
        this.toppingCalories= DEFAULT_TOPPINGCALORIES;
        this.setType(type);
        this.setWeight(weight);
    }

    private void setType(String type) {
        switch (type) {
            case "meat":
                toppingCalories*=1.2;
                break;
            case "veggies":
                toppingCalories*=0.8;
                break;
            case "cheese":
                toppingCalories*=1.1;
                break;
            case "sauce":
                toppingCalories*=0.9;
                break;
            default:
                throw new IllegalArgumentException(String.format("Cannot place %s on top of your pizza.",type));
        }
        this.type = type;
    }

    private void setWeight(double weight) {
        if (weight<1||weight>50){
            throw new IllegalArgumentException(String.format("%s weight should be in the range [1..50]",this.type));
        }
        toppingCalories*=weight;
        this.weight = weight;
    }

    public double getToppingCalories() {
        totalToppingCalories += this.toppingCalories;
        return totalToppingCalories;
    }
}
