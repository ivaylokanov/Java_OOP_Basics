package pr07_carSalesman;

public class Engine {
    private String engineModel;
    private int power;
    private String displacement;
    private String efficiency;

    public Engine(String engineModel, int power) {
        this.engineModel = engineModel;
        this.power = power;
        this.efficiency = "n/a";
        this.displacement = "n/a";

    }

    public void setDisplacement(String displacement) {
        this.displacement = displacement;
    }

    public void setEfficiency(String efficiency) {
        this.efficiency = efficiency;
    }

    protected int getPower() {
        return this.power;
    }

    protected String getDisplacement() {
        return this.displacement;
    }

    protected String getEfficiency() {
        return this.efficiency;
    }

    protected String getEngineModel() {
        return this.engineModel;
    }
}
