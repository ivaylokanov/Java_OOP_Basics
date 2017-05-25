package pr07_carSalesman;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String,Engine> engines = new HashMap<>();
        Set<Car> cars = new LinkedHashSet<>();
        Integer numberOfEngine = Integer.valueOf(reader.readLine());
        for (int i = 0; i <numberOfEngine ; i++) {
            String[] engineParams = reader.readLine().split("\\s+");
            String engineModel = engineParams[0];
            int power = Integer.valueOf(engineParams[1]);
            Engine engine = new Engine(engineModel,power);
            switch (engineParams.length){
                case 3:
                  if (Character.isDigit(engineParams[2].charAt(0))){
                        String displacement = engineParams[2];
                        engine.setDisplacement(displacement);
                    }else {
                        String efficiency = engineParams[2];
                        engine.setEfficiency(efficiency);
                    }
                    break;
                case 4:
                    String displacement = engineParams[2];
                    engine.setDisplacement(displacement);
                    String efficiency = engineParams[3];
                    engine.setEfficiency(efficiency);
                    break;
            }
            engines.put(engineModel,engine);
        }

        Integer numberOfCars = Integer.valueOf(reader.readLine());
        for (int i = 0; i <numberOfCars ; i++) {
            String[] carParams = reader.readLine().split("\\s+");
            String carModel = carParams[0];
            String carEngine = carParams[1];

            Car car = new Car(carModel,engines.get(carEngine));
            switch (carParams.length){
                case 3:


                   if (Character.isDigit(carParams[2].charAt(0))) {
                       String weight = carParams[2];
                        car.setWeight(weight);
                    } else {
                        String color = carParams[2];
                        car.setColor(color);
                    }
                    break;
                case 4:
                    String weight = carParams[2];
                    car.setWeight(weight);
                    String color = carParams[3];
                    car.setColor(color);
                    break;
            }
            cars.add(car);
        }
        cars.stream().forEach(System.out::println);
    }
}
