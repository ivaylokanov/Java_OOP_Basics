package avatar.monuments;


public class AirMonument extends Monument{
    private double airAffinity;

    public AirMonument(String name, double airAffinity) {
        super(name);
        this.airAffinity=airAffinity;
    }

    @Override
    public double getAffinity() {
        return this.airAffinity;
    }

    @Override
    public String toString() {
        return String.format("###Air Monument: %s, Air Affinity: %.0f",super.getName(),this.airAffinity);
    }
}
