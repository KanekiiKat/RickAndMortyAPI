package org.example.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Ref {
    public String name;
    public String status;

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }
}
