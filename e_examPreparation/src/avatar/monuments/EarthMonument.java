package avatar.monuments;

public class EarthMonument extends Monument{
    private double earthAffinity;

    public EarthMonument(String name,double earthAffinity) {
        super(name);
        this.earthAffinity=earthAffinity;
    }

    @Override
    public double getAffinity() {
        return this.earthAffinity;
    }

    @Override
    public String toString() {
        return String.format("###Earth Monument: %s, Earth Affinity: %.0f",super.getName(),this.earthAffinity);
    }
}
