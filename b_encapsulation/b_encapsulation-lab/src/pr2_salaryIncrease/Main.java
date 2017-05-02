package pr2_salaryIncrease;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Person> persons = new ArrayList<>();
        int line = Integer.valueOf(reader.readLine());
        while (0< line--){
            String[] arguments = reader.readLine().split("\\s+");
            String firstName= arguments[0];
            String lastName = arguments[1];
            int age = Integer.valueOf(arguments[2]);
            double salary = Double.valueOf(arguments[3]);
            Person person = new Person(firstName,lastName,age,salary);
            persons.add(person);
        }
        int bonus = Integer.parseInt(reader.readLine());
        for (Person person : persons) {
            person.increaseSalary(bonus);
            System.out.println(person.toString());
        }
    }

}
