package pr_01_vehicles;

public abstract class Vehicle {
    private double fuelQuantity;
    private double fuelConsumationInLiterPerKm;


    public Vehicle(double fuelQuantity, double fuelConsumationInLiterPerKm) {
        this.setFuelQuantity(fuelQuantity);
        this.setFuelConsumationInLiterPerKm(fuelConsumationInLiterPerKm);
    }

    public void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    protected void setFuelConsumationInLiterPerKm(double fuelConsumationInLiterPerKm) {
        this.fuelConsumationInLiterPerKm = fuelConsumationInLiterPerKm;
    }

    protected double getFuelQuantity() {
        return this.fuelQuantity;
    }

    protected double getFuelConsumationInLiterPerKm() {
        return this.fuelConsumationInLiterPerKm;
    }

    public abstract void drive(double parameter);

    public abstract void refuel(double parameter);

}
