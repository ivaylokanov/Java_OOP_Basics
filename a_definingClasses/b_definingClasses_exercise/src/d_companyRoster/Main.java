package d_companyRoster;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int line = Integer.valueOf(reader.readLine());
        Map<String, Set<Person>> departments = new HashMap<>();
        Person person = null;
        while (0 < line--) {
            String[] arguments = reader.readLine().split("\\s+");
            String name = arguments[0];
            double salary = Double.valueOf(arguments[1]);
            String position = arguments[2];
            String department = arguments[3];
            person = new Person(name, salary, position, department);

            switch (arguments.length) {
                case 5:
                    try {
                        int age = Integer.valueOf(arguments[4]);
                        person.setAge(age);
                    } catch (NumberFormatException e) {
                        String email = String.valueOf(arguments[4]);
                        person.setEmail(email);
                    }
                    break;
                case 6:
                    String email = arguments[4];
                    int age = Integer.valueOf(arguments[5]);
                    person.setAge(age);
                    person.setEmail(email);
                    break;
            }
            departments.putIfAbsent(department, new HashSet<>());
            departments.get(department).add(person);
            String debug = "";
        }

       departments.entrySet().stream().sorted((x1, x2)->
               Double.compare(x2.getValue().stream().mapToDouble(Person::getSalary).average().getAsDouble(),
                       x1.getValue().stream().mapToDouble(Person::getSalary).average().getAsDouble()))
               .limit(1)
               .forEach(d -> {
                   System.out.println("Highest Average Salary: " + d.getKey());
                   d.getValue().stream()
                           .sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
                           .forEach(System.out::println);
               });


    }
}
