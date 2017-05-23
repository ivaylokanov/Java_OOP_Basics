package avatar.monuments;

public class EarthMonument extends Monument{
    private double earthAffinity;

    public EarthMonument(String name) {
        super(name);
    }

    @Override
    public void setSecondElement(double secondElement) {
        this.earthAffinity=secondElement;
    }

    @Override
    public double getTotal() {
        return this.earthAffinity;
    }

    @Override
    public String toString() {
        return String.format("###Earth Monument: %s, Earth Affinity: %.0f",super.getName(),this.earthAffinity);
    }
}
