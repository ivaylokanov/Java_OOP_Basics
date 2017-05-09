package avatar.monuments;

public class Monument {
    private String name;
    private double affinity;

    public Monument(String name) {
        this.name = name;
    }

    public Monument(String name, double affinity) {
        this.name = name;
        this.affinity = affinity;
    }

    public String getName() {
        return this.name;
    }

    public double getAffinity() {
        return this.affinity;
    }
}
