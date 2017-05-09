package avatar.benders;

public class Bender{
    private String name;
    private double power;


    public Bender(String name, double power) {
        this.name = name;
        this.power = power;
    }


    public double getPower() {
        return this.power;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
