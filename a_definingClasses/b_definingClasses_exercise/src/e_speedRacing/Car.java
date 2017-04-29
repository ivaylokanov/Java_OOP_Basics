package e_speedRacing;


public class Car {
    public static final int DEFAULT_DISTANCE = 0;
    private String model;
    private double fuelAmount;
    private double fuelCostFor1km;
    private double distance;

    public Car(String model, double fuelAmount, double fuelCostFor1km) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelCostFor1km = fuelCostFor1km;
        this.distance= DEFAULT_DISTANCE;
    }


    public void drive(double distance) {
        double possibleDistanceForTraveling = this.fuelAmount - distance*this.fuelCostFor1km;
        if (possibleDistanceForTraveling>=0){
            this.fuelAmount = possibleDistanceForTraveling;
            this.distance+=distance;
        } else {
            System.out.println("Insufficient fuel for the drive");

        }
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %.0f",this.model,this.fuelAmount,this.distance);
    }
}
