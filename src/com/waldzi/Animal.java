package com.waldzi;

public class Animal {

    private String name;
    private String group;
    private String description;
    private String continent;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }



    public Animal(String name, String group, String description, String continent) {
        this.name = name;
        this.group = group;
        this.description = description;
        this.continent = continent;
    }


}
