package k_catLady;

public class Siamese extends Cat {
    private String name;
    private double earSize;

    public Siamese(String name, double earSize) {
        this.name = name;
        this.earSize = earSize;
    }

    @Override
    public String toString() {
        return String.format("Siamese %s %.0f",this.name,this.earSize);
    }
}
