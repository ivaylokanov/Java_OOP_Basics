package avatar.monuments;

public class WaterMonument extends Monument {
    private double waterAffinity;

    public WaterMonument(String name) {
        super(name);
    }

    @Override
    public void setSecondElement(double secondElement) {
        this.waterAffinity=secondElement;
    }

    @Override
    public double getTotal() {
        return this.waterAffinity;
    }

    @Override
    public String toString() {
        return String.format("###Water Monument: %s, Water Affinity: %.0f",super.getName(),this.waterAffinity);
    }
}
