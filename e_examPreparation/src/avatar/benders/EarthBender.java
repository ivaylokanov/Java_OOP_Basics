package avatar.benders;

public class EarthBender extends Bender{
    private double groundSaturation;

    public EarthBender(String name, double power, double groundSaturation) {
        super(name, power);
        this.groundSaturation = groundSaturation;
    }


    @Override
    public double getPower() {
        return this.groundSaturation*super.getPower();
    }

    @Override
    public String toString() {
        return String.format("###Earth Bender: %s, Power: %.0f, Ground Saturation: %.2f",super.getName(),super.getPower(),this.groundSaturation);
    }
}
