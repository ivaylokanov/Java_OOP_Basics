package avatar.benders;

import avatar.core.Factory;

public abstract class Bender implements Factory {
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

    @Override
    public void setSecondElement(double secondElement) {

    }

    @Override
    public double getTotal() {
        return this.power;
    }
}
