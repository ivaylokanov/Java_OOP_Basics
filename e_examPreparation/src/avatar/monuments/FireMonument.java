package avatar.monuments;

public class FireMonument extends Monument {
    private double fireAffinity;

    public FireMonument(String name,double fireAffinity) {
        super(name);
        this.fireAffinity=fireAffinity;
    }

    @Override
    public double getAffinity() {
        return this.fireAffinity;
    }

    @Override
    public String toString() {
        return String.format("###Fire Monument: %s, Fire Affinity: %.0f",super.getName(),this.fireAffinity);
    }
}
