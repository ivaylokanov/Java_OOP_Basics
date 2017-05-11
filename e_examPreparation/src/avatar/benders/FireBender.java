package avatar.benders;

public class FireBender extends Bender{
    private double heatAggression;

    public FireBender(String name, double power) {
        super(name, power);
    }

    @Override
    public void setSecondElement(double secondElement) {
        this.heatAggression=secondElement;
    }

    @Override
    public double getTotal() {
        return super.getTotal()*this.heatAggression;
    }

    @Override
    public String toString() {
        return String.format("###Fire Bender: %s, Power: %.0f, Heat Aggression: %.2f",super.getName(),super.getPower(),this.heatAggression);
    }
}
