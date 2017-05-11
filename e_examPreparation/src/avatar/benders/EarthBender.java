package avatar.benders;

public class EarthBender extends Bender{
    private double groundSaturation;

    public EarthBender(String name, double power) {
        super(name, power);
    }

    @Override
    public void setSecondElement(double secondElement) {
        this.groundSaturation=secondElement;
    }

    @Override
    public double getTotal() {
        return super.getPower()*this.groundSaturation;
    }

    @Override
    public String toString() {
        return String.format("###Earth Bender: %s, Power: %.0f, Ground Saturation: %.2f",super.getName(),super.getPower(),this.groundSaturation);
    }
}
