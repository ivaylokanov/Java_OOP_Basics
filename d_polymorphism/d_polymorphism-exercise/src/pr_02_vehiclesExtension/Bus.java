package pr_02_vehiclesExtension;

import java.text.DecimalFormat;

public class Bus extends Vehicle{
    public static final double coefficientForAirConditioner = 1.4;
    public Bus(double fuelQuantity, double fuelConsumationInLiterPerKm, double tankCapacity) {
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
            sb.append("Bus travelled ").append(df.format(parameter)).append(" km").append("\r\n");
            System.out.print(sb.toString());
        } else {

            System.out.println("Bus needs refueling");
        }
    }

    @Override
    public void refuel(double parameter) {
        if (super.getFuelQuantity()+parameter<=super.getTankCapacity()) {
            super.setFuelQuantity(super.getFuelQuantity() + parameter);
        } else {
            System.out.println("Cannot fit fuel in tank");
        }
    }

    @Override
    protected void driveEmptyBus(double parameter) {
            DecimalFormat df = new DecimalFormat("#.##########");
            StringBuilder sb = new StringBuilder();
            double neededFuel = (super.getFuelConsumationInLiterPerKm()-coefficientForAirConditioner) * parameter;
            if (super.getFuelQuantity() >= neededFuel) {
                setFuelQuantity(super.getFuelQuantity() - neededFuel);
                sb.append("Car travelled ").append(df.format(parameter)).append(" km").append("\r\n");
                System.out.print(sb.toString());
            } else {

                System.out.println("Car needs refueling");
            }
    }

    @Override
    public String toString() {
        return String.format("Bus: %.2f",super.getFuelQuantity());
    }
}
