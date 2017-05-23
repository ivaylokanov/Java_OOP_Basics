package pr01_pr02_classBox_classBoxDataValidation;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
       this.setLength(length);
        this.setWidth(width);
        this.setHeight(height);
    }

    private void setLength(double length) {
        if (length<=0){
            throw new IllegalArgumentException("Length cannot be zero or negative.");
        }
        this.length = length;
    }

    private void setWidth(double width) {
        if (width<=0){
            throw new IllegalArgumentException("Width cannot be zero or negative.");
        }
        this.width = width;
    }

    private void setHeight(double height) {
        if (height<=0){
            throw new IllegalArgumentException("Height cannot be zero or negative.");
        }
        this.height = height;
    }

    public double getSurfaceArea() {
        double surfaceArea = 2*this.length*this.width+2*this.length*this.height+2*this.width*this.height;
        return surfaceArea;
    }

    public double getLateralSurfaceArea() {
        double literalSurfaceArea = 2*this.length*this.height+2*this.width*this.height;
        return literalSurfaceArea;
    }

    public double getVolume() {
        double volume = this.length*this.height*this.width;
        return volume;
    }
}
