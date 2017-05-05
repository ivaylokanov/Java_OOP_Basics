package pr04_shoppingSpree;

public class Product {
    private String productName;
    private double productCost;

    public Product(String productName, double productCost) {
        this.setProductName(productName);
        this.setProductCost(productCost);
    }

    private void setProductName(String productName) {
        if (" ".equals(this.productName)){
            throw new IllegalArgumentException("Name cannot be an empty string.");
        }
        this.productName = productName;
    }

    private void setProductCost(double productCost) {
        if (productCost<0){
            throw new IllegalArgumentException("Money cannot be a negative number.");
        }
        this.productCost = productCost;
    }

    public String getProductName() {
        return this.productName;
    }

    public double getProductCost() {
        return this.productCost;
    }

    @Override
    public String toString() {
        return this.getProductName();
    }
}
