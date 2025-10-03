package org.example.storage;

import java.net.MalformedURLException;
import java.net.URL;


public class CharacterStorage {
    public void loadUrl() {
        try {
            URL urlRickAndMortyApi = new URL("https://rickandmortyapi.com/api/character");
            // usar urlRickAndMortyApi...
        } catch (MalformedURLException e) {
            // manejar el error
            e.printStackTrace();
        }
    }
}


