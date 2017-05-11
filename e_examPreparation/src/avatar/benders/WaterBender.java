package avatar.benders;


public class WaterBender extends Bender {
    private double waterClarity;

    public WaterBender(String name, double power) {
        super(name, power);
    }

    @Override
    public void setSecondElement(double secondElement) {
        this.waterClarity=secondElement;
    }

    @Override
    public double getTotal() {
        return super.getTotal()*this.waterClarity;
    }

    @Override
    public String toString() {
        return String.format("###Water Bender: %s, Power: %.0f, Water Clarity: %.2f",super.getName(),super.getPower(),this.waterClarity);
    }
}
