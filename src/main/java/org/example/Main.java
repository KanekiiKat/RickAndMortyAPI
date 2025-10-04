package org.example;

import org.example.model.Character;
import org.example.storage.*;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {


        List<Character> characters = CharacterStorage.loadUrl();

        System.out.println(characters);

    }
}