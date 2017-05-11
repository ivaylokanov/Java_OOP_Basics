package avatar.monuments;

import avatar.core.Factory;

public class Monument implements Factory{
    private String name;

    public Monument(String name) {
        this.name = name;
    }


    public String getName() {
        return this.name;
    }

    @Override
    public void setSecondElement(double secondElement) {

    }

    @Override
    public double getTotal() {
        return 0;
    }
}
