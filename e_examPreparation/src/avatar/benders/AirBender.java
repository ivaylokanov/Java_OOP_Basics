package avatar.benders;


public class AirBender extends Bender{
    private double aerialIntegirty;

    public AirBender(String name, double power, double aerialIntegirty) {
        super(name, power);
        this.aerialIntegirty=aerialIntegirty;
    }

    public void setAerialIntegirty(double aerialIntegirty) {
        this.aerialIntegirty = aerialIntegirty;
    }

    @Override
    public double getPower() {
        return this.aerialIntegirty*super.getPower();
    }


    @Override
    public String toString() {
        return String.format("###Air Bender: %s, Power: %.0f, Aerial Integrity: %.2f",super.getName(),super.getPower(),this.aerialIntegirty);
    }
}
