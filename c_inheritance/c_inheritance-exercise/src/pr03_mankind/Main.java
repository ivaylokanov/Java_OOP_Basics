package pr03_mankind;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String[] studentsArgs = reader.readLine().split("\\s+");
            String studentFirstName = studentsArgs[0];
            String studentLastName = studentsArgs[1];
            String studentFacultyNumber = studentsArgs[2];
            Human student = new Student(studentFirstName, studentLastName, studentFacultyNumber);
            String[] workerArgs = reader.readLine().split("\\s+");
            String workerFirstName = workerArgs[0];
            String workerLastName = workerArgs[1];
            double workerWeekSalary = Double.valueOf(workerArgs[2]);
            double workHoursPerDay = Double.valueOf(workerArgs[3]);
            Human worker = new Worker(workerFirstName, workerLastName, workerWeekSalary, workHoursPerDay);
            System.out.println(student);
            System.out.println(worker);
        } catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
    }
}
