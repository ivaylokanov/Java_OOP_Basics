package pr05_pizzaCalories;

public class Dough{
    public static final int DEFAULT_CALORIES = 2;
    private String flourType;
    private String bakingTechnique;
    private double weight;
    private double doughCalories;
    private double totalDoughCalories=0.0;

    public Dough(String flourType, String bakingTechnique, double weight) {
        this.doughCalories=DEFAULT_CALORIES;
        this.setFlourType(flourType);
        this.setBakingTechnique(bakingTechnique);
        this.setWeight(weight);
    }

    private void setFlourType(String flourType) {
        switch (flourType) {
            case "white":
                doughCalories*=1.5;
                break;
            case "wholegrain":
                doughCalories*=1.0;
                break;
            default:
                throw new IllegalArgumentException("Invalid type of dough.");
        }
        this.flourType = flourType;
    }

    private void setBakingTechnique(String bakingTechnique) {
        switch (bakingTechnique) {
            case "crispy":
                doughCalories*=0.9;
                break;
            case "chewy":
                doughCalories*=1.1;
                break;
            case "homemade":
             doughCalories*=1.0;
                break;
            default:
                throw new IllegalArgumentException("Invalid type of dough.");
        }
        this.bakingTechnique = bakingTechnique;
    }

    private void setWeight(double weight) {
        if (weight<1||weight>200){
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }
       doughCalories*=weight;
        this.weight = weight;
    }

    public double getDoughCalories() {
        totalDoughCalories += this.doughCalories;
        return totalDoughCalories;
    }
}
