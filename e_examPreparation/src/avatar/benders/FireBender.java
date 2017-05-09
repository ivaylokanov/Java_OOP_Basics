package avatar.benders;

public class FireBender extends Bender{
    private double heatAggression;

    public FireBender(String name, double power, double heatAggression) {
        super(name, power);
        this.heatAggression = heatAggression;
    }



    @Override
    public double getPower() {
        return this.heatAggression*super.getPower();
    }

    @Override
    public String toString() {
        return String.format("###Fire Bender: %s, Power: %.0f, Heat Aggression: %.2f",super.getName(),super.getPower(),this.heatAggression);
    }
}
