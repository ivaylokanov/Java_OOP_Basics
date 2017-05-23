package avatar.monuments;

public class FireMonument extends Monument {
    private double fireAffinity;

    public FireMonument(String name) {
        super(name);
    }

    @Override
    public void setSecondElement(double secondElement) {
        this.fireAffinity=secondElement;
    }

    @Override
    public double getTotal() {
        return this.fireAffinity;
    }

    @Override
    public String toString() {
        return String.format("###Fire Monument: %s, Fire Affinity: %.0f",super.getName(),this.fireAffinity);
    }
}
