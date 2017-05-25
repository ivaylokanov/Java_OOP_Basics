package pr05_speedRacing;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String,Car> cars = new LinkedHashMap<>();
        int numberOfLines = Integer.valueOf(reader.readLine());
        for (int i = 0; i <numberOfLines ; i++) {
            String[] parameters = reader.readLine().split("\\s+");
            String carModel = parameters[0];
            double fuelAmount = Double.valueOf(parameters[1]);
            double fuelCostFor1km = Double.valueOf(parameters[2]);
            Car car = new Car(carModel,fuelAmount,fuelCostFor1km);
            cars.put(carModel,car);
        }
        String input = "";
        while (!"End".equals(input=reader.readLine())){
            String[] comArgs = input.split("\\s+");
            String carModel = comArgs[1];
            double distance = Double.valueOf(comArgs[2]);
            cars.get(carModel).drive(distance);
        }

            cars.forEach((key, value) -> System.out.println(value));


    }
}
