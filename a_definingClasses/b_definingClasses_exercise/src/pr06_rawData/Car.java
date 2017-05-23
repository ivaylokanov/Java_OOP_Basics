package pr06_rawData;


import java.util.Set;

public class Car {
    private String carModel;
    private Engine engine;
    private Cargo cargo;
    private Set<Tire> tires;

    public Car(String carModel, Engine engine, Cargo cargo, Set<Tire> tires) {
        this.carModel = carModel;
        this.engine = engine;
        this.cargo = cargo;
        this.tires = tires;
    }

    public Cargo getCargo() {
        return this.cargo;
    }

    public Set<Tire> getTires() {
        return this.tires;
    }

    public Engine getEngine() {
        return this.engine;
    }

    @Override
    public String toString() {
        return this.carModel;
    }
}
