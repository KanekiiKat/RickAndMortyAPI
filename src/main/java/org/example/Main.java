package org.example;

import org.example.model.Character;
import org.example.storage.*;

import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {


        List<Character> characters = CharacterStorage.loadUrl();

        // Personajes que están vivos y un contador.

        System.out.println("\nPersonajes vivos: \n");

        characters.stream()
                .filter(c -> c.getStatus().equals("Alive"))
                .forEach(System.out::println);

        characters.stream()
                .filter(c -> c.getStatus().equals("Alive"))
                .collect(Collectors.groupingBy(c -> c.getStatus(), Collectors.counting()))
                .forEach((vivos, cuenta) -> System.out.println(vivos + " = " + cuenta) );

        // Personajes que están muertos y que son humanos.

        System.out.println("\n\nPersonajes muertos humanos: \n");

        characters.stream()
                .filter(c -> c.getStatus().equals("Dead") && c.getSpecies().equals("Human"))
                .forEach(System.out::println);


        // Personajes agrupados por especies

        System.out.println("\n\nAgrupados por especies: \n");
        characters.stream()
                .collect(Collectors.groupingBy(Character::getSpecies))
                .forEach((s , v) -> System.out.println("Specie " + s + " = " + v + "\n"));

    }
}