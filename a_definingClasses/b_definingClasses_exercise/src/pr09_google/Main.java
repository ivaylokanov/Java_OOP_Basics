package pr09_google;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String,Person> persons = new HashMap<>();
        String input = "";
        while (!"End".equals(input=reader.readLine())){
            String[] params = input.split("\\s+");
            String personName = params[0];
            String paramsType = params[1];
            if (!persons.containsKey(personName)) {
                persons.put(personName, new Person(personName));
            }
            switch (paramsType){
                case "pokemon":
                    Pokemon pokemon = new Pokemon(params[2],params[3]);
                    persons.get(personName).setPokemons(pokemon);
                    break;
                case "parents":
                    Parent parent = new Parent(params[2],params[3]);
                    persons.get(personName).setParents(parent);
                    break;
                case "children":
                    Child child = new Child(params[2],params[3]);
                    persons.get(personName).setChildren(child);
                    break;
                case "car":
                    Car car = new Car(params[2],Double.valueOf(params[3]));
                    persons.get(personName).setCar(car);
                    break;
                case "company":
                    Company company = new Company(params[2],params[3],Double.valueOf(params[4]));
                    persons.get(personName).setCompany(company);
                    break;

            }
        }
        String findPerson = reader.readLine();
        System.out.println(persons.get(findPerson));

    }
}
