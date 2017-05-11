package avatar.benders;


public class AirBender extends Bender{
    private double aerialIntegirty;

    public AirBender(String name, double power) {
        super(name, power);
    }

    public void setAerialIntegirty(double aerialIntegirty) {
        this.aerialIntegirty = aerialIntegirty;
    }

    @Override
    public void setSecondElement(double secondElement) {
        this.aerialIntegirty=secondElement;
    }

    @Override
    public double getTotal() {
        return super.getTotal()*this.aerialIntegirty;
    }

    @Override
    public String toString() {
        return String.format("###Air Bender: %s, Power: %.0f, Aerial Integrity: %.2f",super.getName(),super.getPower(),this.aerialIntegirty);
    }
}
