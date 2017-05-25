package pr_02_vehiclesExtension;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        LinkedHashMap<String,Vehicle> vehicles = new LinkedHashMap<>();
        Vehicle vehicle=null;
        for (int i = 0; i < 3; i++) {
            String[] vehicleArgs = reader.readLine().split("\\s+");
            String vehicleType = vehicleArgs[0];
            double fuelQuantity = Double.valueOf(vehicleArgs[1]);
            double fuelConsumationInLiterPerKm = Double.valueOf(vehicleArgs[2]);
            double tankCapacity = Double.valueOf(vehicleArgs[3]);

            switch (vehicleType){
                case "Car":
                    vehicle = new Car(fuelQuantity,fuelConsumationInLiterPerKm,tankCapacity);
                    break;
                case "Truck":
                    vehicle = new Truck(fuelQuantity,fuelConsumationInLiterPerKm,tankCapacity);
                    break;
                case "Bus":
                    vehicle = new Bus(fuelQuantity,fuelConsumationInLiterPerKm,tankCapacity);
                    break;
            }
            vehicles.putIfAbsent(vehicleType,vehicle);
        }
        int numberOfComands = Integer.valueOf(reader.readLine());
        while (0 < numberOfComands --){
            String[] commandArgs = reader.readLine().split("\\s+");
            String command = commandArgs[0];
            String commandVehicleType = commandArgs[1];
            double parameter = Double.valueOf(commandArgs[2]);
            switch (command){
                case "Drive":
                  vehicles.get(commandVehicleType).drive(parameter);
                    break;
                case "Refuel":
                    vehicles.get(commandVehicleType).refuel(parameter);
                    break;
                case "DriveEmpty":
                    vehicles.get(commandVehicleType).drive(parameter);
                    break;

            }
        }
        for (Vehicle vehicleType : vehicles.values()) {
            System.out.println(vehicleType);
        }



    }

}
