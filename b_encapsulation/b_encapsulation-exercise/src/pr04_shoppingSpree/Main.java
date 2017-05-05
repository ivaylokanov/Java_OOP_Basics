package pr04_shoppingSpree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Person> persons = new HashMap<>();
        Map<String, Product> products = new HashMap<>();
        String[] inputPersons = reader.readLine().split(";");
        for (String inputPerson : inputPersons) {
            String[] arguments = inputPerson.split("=");
            String personName = arguments[0];
            double money = Double.valueOf(arguments[1]);
            Person person = new Person(personName, money);
            persons.putIfAbsent(personName, person);
        }

        String[] inputProducts = reader.readLine().split(";");
        for (String inputProduct : inputProducts) {
            String[] arguments = inputProduct.split("=");
            String productName = arguments[0];
            double productCost = Double.valueOf(arguments[1]);
            try {
            Product product = new Product(productName, productCost);
                products.put(productName, product);
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
                return;
            }
        }
        String inputCommand = "";
        while (!"END".equals(inputCommand = reader.readLine())) {
                String[] arguments = inputCommand.split("\\s+");
                String personName = arguments[0];
                String productName = arguments[1];
            try {

                persons.get(personName).buyProduct(products.get(productName));
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
                return;
            }
        }
            persons.values().forEach(System.out::println);

    }
}
