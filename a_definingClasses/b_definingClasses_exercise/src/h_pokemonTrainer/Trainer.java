package h_pokemonTrainer;


import java.text.Format;
import java.util.HashSet;
import java.util.Set;

public class Trainer {
    public static final int DEFAULT_BADGES = 0;
    private String trainerName;
    private int numberOfBadges;
    private Set<Pokemon> pokemons;

    public Trainer(String trainerName) {
        this.trainerName = trainerName;
        this.pokemons = new HashSet<>();
        this.numberOfBadges=DEFAULT_BADGES;
    }

    public void setNumberOfBadges() {
        this.numberOfBadges += 1;
    }

    public void setPokemons(Pokemon pokemon) {
        pokemons.add(pokemon);
        this.pokemons = pokemons;
    }

    public Set<Pokemon> getPokemons() {
        return this.pokemons;
    }

    public int getNumberOfBadges() {
        return this.numberOfBadges;
    }

    @Override
    public String toString() {
        return String.format("%s %d %d",this.trainerName,this.numberOfBadges,pokemons.size());
    }
}
