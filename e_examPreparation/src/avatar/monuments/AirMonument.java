package avatar.monuments;


public class AirMonument extends Monument{
    private double airAffinity;

    public AirMonument(String name) {
        super(name);
    }

    @Override
    public void setSecondElement(double secondElement) {
        this.airAffinity=secondElement;
    }

    @Override
    public double getTotal() {
        return this.airAffinity;
    }

    @Override
    public String toString() {
        return String.format("###Air Monument: %s, Air Affinity: %.0f",super.getName(),this.airAffinity);
    }
}
