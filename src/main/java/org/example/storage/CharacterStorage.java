package org.example.storage;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.model.Character;

import java.io.IOException;
import java.net.URL;
import java.util.List;


public class CharacterStorage {
    public static  List<Character> loadUrl() throws IOException {

        ObjectMapper om = new ObjectMapper();
        ApiResults characters = om.readValue(new URL("https://rickandmortyapi.com/api/character"), ApiResults.class);
        return characters.results;


    }
}




