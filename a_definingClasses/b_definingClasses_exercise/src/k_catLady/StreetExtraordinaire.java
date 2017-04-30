package k_catLady;


public class StreetExtraordinaire extends Cat{
    private String name;
    private double decibelsOfMeows;

    public StreetExtraordinaire(String name, double decibelsOfMeows) {
        this.name = name;
        this.decibelsOfMeows = decibelsOfMeows;
    }

    @Override
    public String toString() {
        return String.format("StreetExtraordinaire %s %.0f",this.name,this.decibelsOfMeows);
    }
}
