package pr_01_vehicles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String,Vehicle> vehicles = new HashMap<>();
        Vehicle vehicle=null;
        for (int i = 0; i < 2; i++) {
            String[] vehicleArgs = reader.readLine().split("\\s+");
            String vehicleType = vehicleArgs[0];
            double fuelQuantity = Double.valueOf(vehicleArgs[1]);
            double fuelConsumationInLiterPerKm = Double.valueOf(vehicleArgs[2]);

            switch (vehicleType){
                case "Car":
                    vehicle = new Car(fuelQuantity,fuelConsumationInLiterPerKm);
                    break;
                case "Truck":
                    vehicle = new Truck(fuelQuantity,fuelConsumationInLiterPerKm);
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

                    break;

            }
        }
        for (Vehicle vehicleType : vehicles.values()) {
            System.out.println(vehicleType);
        }



    }

}
