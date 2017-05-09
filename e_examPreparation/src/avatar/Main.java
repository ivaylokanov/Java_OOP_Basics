package avatar;

import avatar.benders.*;
import avatar.monuments.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    private static Bender bender;
    private static Monument monument;
    private static Map<String, List<Monument>> monuments = new LinkedHashMap<>();
    private static Map<String, List<Bender>> benders = new LinkedHashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> wars = new ArrayList<>();
        String input = "";
        while (!"Quit".equals(input = reader.readLine())) {
            String[] parameters = input.split("\\s+");
            String command = parameters[0];
            switch (command) {

                case "Bender":
                    createBender(parameters);
                    break;

                case "Monument":
                    createMonuments(parameters);
                    break;

                case "Status":
                    String typeNation = parameters[1];
                    System.out.printf("%s Nation%n", typeNation);
                    System.out.print("Benders:");
                    if (benders.get(typeNation) == null || benders.get(typeNation).isEmpty()) {
                        System.out.println(" None");
                    } else {
                        System.out.println();
                        benders.get(typeNation).stream().forEach(x -> {
                            System.out.println(x);
                        });
                    }
                    System.out.print("Monuments:");
                    if (monuments.get(typeNation) != null) {
                        System.out.println();
                        monuments.get(typeNation).stream().forEach(s -> {
                            System.out.println(s);
                        });
                    } else {
                        System.out.println(" None");
                    }

                    break;
                case "War":

                    String typeWar = parameters[1];
                    wars.add(typeWar);
                    double checkTotal = 0.0;
                    String checkType = "";
                    double totalBendersPower = 0.0;
                    double totalMonuments = 0;
                    if (benders.get("Air") != null) {
                        totalBendersPower = benders.get("Air").stream().mapToDouble(x -> x.getPower()).sum();
                        if (monuments.get("Air") != null) {
                            totalMonuments = monuments.get("Air").stream().mapToDouble(x -> x.getAffinity()).sum();
                        }
                        totalBendersPower = totalBendersPower + (totalBendersPower / 100) * totalMonuments;
                        if (totalBendersPower > checkTotal) {
                            checkTotal = totalBendersPower;
                            checkType = "Air";
                        }
                    }
                    if (benders.get("Water") != null) {
                        totalBendersPower = benders.get("Water").stream().mapToDouble(x -> x.getPower()).sum();
                        if (monuments.get("Water") != null) {
                            totalMonuments = monuments.get("Water").stream().mapToDouble(x -> x.getAffinity()).sum();
                        }
                        totalBendersPower = totalBendersPower + (totalBendersPower / 100) * totalMonuments;
                        if (totalBendersPower > checkTotal) {
                            checkTotal = totalBendersPower;
                            checkType = "Water";
                        }
                    }
                    if (benders.get("Fire") != null) {
                        totalBendersPower = benders.get("Fire").stream().mapToDouble(x -> x.getPower()).sum();
                        if (monuments.get("Fire") != null) {
                            totalMonuments = monuments.get("Fire").stream().mapToDouble(x -> x.getAffinity()).sum();
                        }
                        totalBendersPower = totalBendersPower + (totalBendersPower / 100) * totalMonuments;
                        if (totalBendersPower > checkTotal) {
                            checkTotal = totalBendersPower;
                            checkType = "Fire";
                        }
                    }
                    if (benders.get("Earth") != null) {
                        totalBendersPower = benders.get("Earth").stream().mapToDouble(x -> x.getPower()).sum();
                        if (monuments.get("Earth") != null) {
                            totalMonuments = monuments.get("Earth").stream().mapToDouble(x -> x.getAffinity()).sum();
                        }
                        totalBendersPower = totalBendersPower + (totalBendersPower / 100) * totalMonuments;
                        if (totalBendersPower > checkTotal) {
                            checkTotal = totalBendersPower;
                            checkType = "Earth";
                        }
                    }

                    for (Map.Entry<String, List<Bender>> entry : benders.entrySet()) {
                        if (!entry.getKey().contains(checkType)) {
                            entry.getValue().clear();
                        }
                    }
                    for (Map.Entry<String, List<Monument>> entry : monuments.entrySet()) {
                        if (!entry.getKey().contains(checkType)) {
                            entry.getValue().clear();
                        }
                    }
                    break;

            }

        }
        if ((!benders.isEmpty())||(benders!=null)) {
            for (int i = 0; i < wars.size(); i++) {
                System.out.printf("War %d issued by %s%n", i + 1, wars.get(i));
            }
        }
    }

    private static void createMonuments(String[] parameters) {
        String typeMonument = parameters[1];
        String monumentName = parameters[2];
        int affinity = Integer.valueOf(parameters[3]);
        switch (typeMonument) {
            case "Air":
                monument = new AirMonument(monumentName, affinity);
                break;
            case "Water":
                monument = new WaterMonument(monumentName, affinity);
                break;
            case "Fire":
                monument = new FireMonument(monumentName, affinity);
                break;
            case "Earth":
                monument = new EarthMonument(monumentName, affinity);
                break;
        }
        if (!monuments.containsKey(typeMonument)) {
            monuments.put(typeMonument, new LinkedList<>());
        }
        monuments.get(typeMonument).add(monument);
    }

    private static void createBender(String[] parameters) {
        String typeBender = parameters[1];
        String benderName = parameters[2];
        double power = Double.valueOf(parameters[3]);
        double secondaryParameter = Double.valueOf(parameters[4]);
        switch (typeBender) {
            case "Air":
                bender = new AirBender(benderName, power, secondaryParameter);
                break;
            case "Water":
                bender = new WaterBender(benderName, power, secondaryParameter);
                break;
            case "Fire":
                bender = new FireBender(benderName, power, secondaryParameter);
                break;
            case "Earth":
                bender = new EarthBender(benderName, power, secondaryParameter);
                break;
        }
        if (!benders.containsKey(typeBender)) {
            benders.put(typeBender, new LinkedList<>());
        }
        benders.get(typeBender).add(bender);
    }


}

