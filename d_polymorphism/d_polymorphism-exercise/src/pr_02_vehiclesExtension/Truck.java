package pr_02_vehiclesExtension;

import java.text.DecimalFormat;

public class Truck extends Vehicle {

    public static final double coefficientForAirConditioner = 1.6;
    public static final double possibilityForRefuel = 0.95;

    public Truck(double fuelQuantity, double fuelConsumationInLiterPerKm, double tankCapacity) {
        super(fuelQuantity, fuelConsumationInLiterPerKm, tankCapacity);
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
            sb.append("Truck travelled ").append(df.format(parameter)).append(" km").append("\r\n");
            System.out.print(sb.toString());
        } else {

            System.out.println("Truck needs refueling");
        }
    }

    @Override
    public void refuel(double parameter) {
        super.setFuelQuantity(super.getFuelQuantity() + parameter * possibilityForRefuel);
    }

    @Override
    public String toString() {
        return String.format("Truck: %.2f", super.getFuelQuantity());
    }
}

