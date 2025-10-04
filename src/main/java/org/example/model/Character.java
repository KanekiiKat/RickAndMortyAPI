package org.example.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Character {

    public Character() {}

    private String id;
    private String name;
    private String status;
    private String species;
    private String type;
    private String gender;
    private Ref origin;
    private Ref location;
    private String image;
    private List<String> episodes;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    public String getSpecies() {
        return species;
    }

    public String getType() {
        return type;
    }

    public String getGender() {
        return gender;
    }

    public Ref getOrigin() {
        return origin;
    }

    public Ref getLocation() {
        return location;
    }

    public String getImage() {
        return image;
    }

    public List<String> getEpisodes() {
        return episodes;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setOrigin(Ref origin) {
        this.origin = origin;
    }

    public void setLocation(Ref location) {
        this.location = location;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setEpisodes(List<String> episodes) {
        this.episodes = episodes;
    }

    @Override
    public String toString() {
        return "id = " + id +
                ", name = " + name +
                ", status = " + status +
                ", species = " + species +
                ", type = " + type +
                ", gender = " + gender +
                ", origin = " + origin +
                ", location = " + location +
                ", image = " + image +
                ", episodes = " + episodes + "\n";
    }


}




