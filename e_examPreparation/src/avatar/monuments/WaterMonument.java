package avatar.monuments;

public class WaterMonument extends Monument {
    private double waterAffinity;

    public WaterMonument(String name,int waterAffinity) {
        super(name);
        this.waterAffinity=waterAffinity;
    }

    @Override
    public double getAffinity() {
        return this.waterAffinity;
    }

    @Override
    public String toString() {
        return String.format("###Water Monument: %s, Water Affinity: %.0f",super.getName(),this.waterAffinity);
    }
}
