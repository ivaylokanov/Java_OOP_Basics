package pr11_catLady;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Cat> cats = new HashMap<>();
        Cat cat = null;
        String input = "";
        while (!"End".equals(input=reader.readLine())){
            String[] parameters = input.split("\\s+");
            String typeCat = parameters[0];
            String name = parameters[1];
            double specificElement = Double.valueOf(parameters[2]);
            switch (typeCat){
                case "Siamese":
                    cat = new Siamese(name,specificElement);
                    break;
                case "Cymric":
                    cat = new Cymric(name,specificElement);
                    break;
                case "StreetExtraordinaire":
                    cat = new StreetExtraordinaire(name,specificElement);
                    break;
            }
            cats.putIfAbsent(name,cat);


        }
        String nameInfo = reader.readLine();
        System.out.println(cats.get(nameInfo));
    }
}
