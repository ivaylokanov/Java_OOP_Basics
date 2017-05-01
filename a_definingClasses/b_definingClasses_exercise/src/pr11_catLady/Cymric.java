package pr11_catLady;


public class Cymric extends Cat {
    private String name;
    private double furLength;

    public Cymric(String name, double furLength) {
        this.name = name;
        this.furLength = furLength;
    }

    @Override
    public String toString() {
        return String.format("Cymric %s %.2f",this.name,this.furLength);
    }
}
