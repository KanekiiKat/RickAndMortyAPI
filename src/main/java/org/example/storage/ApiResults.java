package org.example.storage;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.example.model.Character;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ApiResults {

    public List<Character> results;

}
