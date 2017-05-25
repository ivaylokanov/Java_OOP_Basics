package pr_02_vehiclesExtension;

public abstract class Vehicle {
    private double fuelQuantity;
    private double fuelConsumationInLiterPerKm;
    private double tankCapacity;

    public Vehicle(double fuelQuantity, double fuelConsumationInLiterPerKm,double tankCapacity) {
        this.setFuelQuantity(fuelQuantity);
        this.setFuelConsumationInLiterPerKm(fuelConsumationInLiterPerKm);
        this.setTankCapacity(tankCapacity);
    }

    public void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    protected void setFuelConsumationInLiterPerKm(double fuelConsumationInLiterPerKm) {
        this.fuelConsumationInLiterPerKm = fuelConsumationInLiterPerKm;
    }

    protected void setTankCapacity(double tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    protected double getFuelQuantity() {
        return this.fuelQuantity;
    }

    protected double getFuelConsumationInLiterPerKm() {
        return this.fuelConsumationInLiterPerKm;
    }

    protected double getTankCapacity() {
        return this.tankCapacity;
    }

    public abstract void drive(double parameter);

    public abstract void refuel(double parameter);

    protected void driveEmptyBus(double parameter){

    }

}
