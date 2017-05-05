package pr04_shoppingSpree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Person {
    private String personName;
    private double money;
    private List<Product> products;

    public Person(String personName, double money) {
        this.personName = personName;
        this.money = money;
        this.products = new ArrayList<>();
    }

    private void setMoney(double money) {
        this.money = this.money-money;
    }

    public void buyProduct(Product productName) {
        if (this.money<productName.getProductCost()){
            System.out.printf("%s can't afford %s%n",this.personName,productName.getProductName());
        } else {
            products.add(productName);
            setMoney(productName.getProductCost());
            System.out.printf("%s bought %s%n",this.personName,productName.getProductName());
        }
    }

    public List<Product> getProducts() {
        return this.products;
    }

    public String getPersonName() {
        return this.personName;
    }

    @Override
    public String toString() {
        if (this.getProducts().size() == 0) {
            return this.getPersonName() + " - Nothing bought";
        }
        return this.getPersonName() + " - " + String.join(", ", this.getProducts().stream().
                map(Object::toString).collect(Collectors.toList()));
    }
}
