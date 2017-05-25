package pr04_firstAndReserveTeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Team {
    private String name;
    private List<Person> firstTeamPlayers;
    private List<Person> reversedTeamPlayers;

    public Team(String name) {
        this.name = name;
        this.firstTeamPlayers = new ArrayList<>();
        this.reversedTeamPlayers = new ArrayList<>();
    }

    public List<Person> getFirstTeamPlayers() {
        return Collections.unmodifiableList(this.firstTeamPlayers);
    }

    public List<Person> getReversedTeamPlayers() {
        return Collections.unmodifiableList(this.reversedTeamPlayers);
    }

    public void addPlayer(Person person){
        if (person.getAge()<40){
            firstTeamPlayers.add(person);
        } else {
            reversedTeamPlayers.add(person);
        }

    }
}
