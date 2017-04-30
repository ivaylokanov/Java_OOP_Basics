package h_pokemonTrainer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;


public class Main {
    public static Map<String, Trainer> trainers = new LinkedHashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        Trainer trainer = null;
        while (!"Tournament".equals(input = reader.readLine())&&!input.equals("")) {
            String[] parameters = input.split("\\s+");
            String trainerName = parameters[0];
            String pokemonName = parameters[1];
            String element = parameters[2];
            int health = Integer.valueOf(parameters[3]);
            Pokemon pokemon = new Pokemon(pokemonName, element, health);
            if (!trainers.containsKey(trainerName)) {
                trainer = new Trainer(trainerName);
                trainers.putIfAbsent(trainerName, trainer);
            }
            trainers.get(trainerName).setPokemons(pokemon);
        }
        String elements = "";
        while (!"End".equals(elements = reader.readLine())) {
            isPokemonPresent(elements);

        }
        trainers.values().stream()
                .sorted((t1, t2) -> Integer.compare(t2.getNumberOfBadges(), t1.getNumberOfBadges()))
                .forEach(System.out::println);
    }

    private static void isPokemonPresent(String elements) {
        trainers.entrySet().forEach(trainer -> {
            long elementCount = trainer.getValue().getPokemons().stream().filter(c -> elements.equals(c.getElement())).count();
            if (elementCount > 0) {
                trainer.getValue().setNumberOfBadges();
            } else {
                trainer.getValue().getPokemons().forEach(pokemon -> {
                    pokemon.setHealth();
                    if (pokemon.getHealth() <= 0) {
                        trainer.getValue().getPokemons().remove(pokemon);
                    }
                });
            }
        });

    }
}
