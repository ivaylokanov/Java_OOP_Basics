package pr04_firstAndReserveTeam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Person> persons = new ArrayList<>();
        Team team = null;
        int line = Integer.valueOf(reader.readLine());
        while (0 < line--) {

            String[] arguments = reader.readLine().split("\\s+");
            String firstName = arguments[0];
            String lastName = arguments[1];
            int age = Integer.valueOf(arguments[2]);
            double salary = Double.valueOf(arguments[3]);
            try {
                Person person = new Person(firstName, lastName, age, salary);
                persons.add(person);
            } catch (IllegalArgumentException ex) {
                // Not print exception according task
                ex.getMessage();
            }
            team = new Team("Minior");
            for (Person person : persons) {
                team.addPlayer(person);
            }
        }
        System.out.printf("First team have %d players%n",team.getFirstTeamPlayers().size());
        System.out.printf("Reserve team have %d players%n",team.getReversedTeamPlayers().size());

    }
}


