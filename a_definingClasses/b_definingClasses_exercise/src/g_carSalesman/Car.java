package g_carSalesman;


public class Car {
    public static final String DEFAULT_WEIGHT = "n/a";
    public static final String DEFAULT_COLOR = "n/a";
    private String carModel;
    private Engine engine;
    private String weight;
    private String color;

    public Car(String carModel, Engine engine) {
        this.carModel = carModel;
        this.engine = engine;
        this.weight=DEFAULT_WEIGHT ;
        this.color= DEFAULT_COLOR;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("%s:%n  %s:%n    Power: %d%n    Displacement: %s%n    Efficiency: %s%n  Weight: %s%n  Color: %s",
                this.carModel,this.engine.getEngineModel(),this.engine.getPower(),this.engine.getDisplacement(),this.engine.getEfficiency(),
                this.weight,this.color);

    }
}
