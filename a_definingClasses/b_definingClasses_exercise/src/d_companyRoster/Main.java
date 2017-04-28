package d_companyRoster;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int line = Integer.valueOf(reader.readLine());
        Map<String,Person> personMap = new LinkedHashMap<>();
        Person person=null;
        while (0 < line--) {
            String[] arguments = reader.readLine().split("\\s+");
            String name = arguments[0];
            double salary = Double.valueOf(arguments[1]);
            String position = arguments[2];
            String department = arguments[3];
            person = new Person(name,salary,position,department);

            switch (arguments.length){
                case 5:
if ()
                    break;
                case 6:
                    String email = arguments[4];
                    int age = Integer.valueOf(arguments[5]);
                    person.setAge(age);
                    person.setEmail(email);
                    break;
            }
            personMap.putIfAbsent(name,new LinkedHashMap<>())




        }

    }
}
