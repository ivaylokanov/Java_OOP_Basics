package pr03_animalFarm;

public class Chicken {
    private String chickenName;
    private int chickenAge;

    public Chicken(String chickenName, int chickenAge) {
        this.chickenName = chickenName;
        this.chickenAge = chickenAge;
    }

    public String getChickenName() {
        if ((this.chickenName.length()<1) | (this.chickenName.charAt(0)==' ')){
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        return this.chickenName;
    }

    public int getChickenAge() {
        if (this.chickenAge<0 || this.chickenAge>15 ){
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        }
        return this.chickenAge;
    }


    public double productPerDay() {
        double eggsPerDay = calculateProductPerDay();
        return eggsPerDay;
    }

    private double calculateProductPerDay() {
        if (this.chickenAge<6){
            return 2;
        } else if (this.chickenAge<12){
            return 1;
        }else {
            return 0.75;
        }
    }
}
