package pr_03_wildFarm;

public abstract class Food {
    private Integer quantity;

    public Food(Integer quantity) {
        this.setQuantity(quantity);
    }

    protected Integer getQuantity() {
        return this.quantity;
    }

    private void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
