package avatar.benders;


public class WaterBender extends Bender {
    private double waterClarity;

    public WaterBender(String name, double power,double waterClarity) {
        super(name, power);
        this.waterClarity=waterClarity;
    }

    @Override
    public double getPower() {
        return this.waterClarity*super.getPower();
    }

    @Override
    public String toString() {
        return String.format("###Water Bender: %s, Power: %.0f, Water Clarity: %.2f",super.getName(),super.getPower(),this.waterClarity);
    }
}
