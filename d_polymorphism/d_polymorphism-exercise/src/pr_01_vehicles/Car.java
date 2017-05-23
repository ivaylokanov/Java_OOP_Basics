package pr_01_vehicles;

import java.text.DecimalFormat;

public class Car extends Vehicle {
    public static final double coefficientForAirConditioner = 0.9;

    public Car(double fuelQuantity, double fuelConsumationInLiterPerKm) {
        super(fuelQuantity, fuelConsumationInLiterPerKm);
    }


    @Override
    protected void setFuelConsumationInLiterPerKm(double fuelConsumationInLiterPerKm) {
        super.setFuelConsumationInLiterPerKm(fuelConsumationInLiterPerKm + coefficientForAirConditioner);
    }

    @Override
    public void drive(double parameter) {
        DecimalFormat df = new DecimalFormat("#.##########");
        StringBuilder sb = new StringBuilder();
        double neededFuel = super.getFuelConsumationInLiterPerKm() * parameter;
        if (super.getFuelQuantity() >= neededFuel) {
            setFuelQuantity(super.getFuelQuantity() - neededFuel);
            sb.append("Car travelled ").append(df.format(parameter)).append(" km").append("\r\n");
            System.out.print(sb.toString());
        } else {

            System.out.println("Car needs refueling");
        }
    }

    @Override
    public void refuel(double parameter) {
        super.setFuelQuantity(super.getFuelQuantity()+parameter);
    }

    @Override
    public String toString() {
        return String.format("Car: %.2f",super.getFuelQuantity());
    }

}
