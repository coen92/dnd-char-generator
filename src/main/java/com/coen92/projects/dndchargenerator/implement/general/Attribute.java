package com.coen92.projects.dndchargenerator.implement.general;

public class Attribute {

    private String name;
    private int value;
    private int modifier;

    public Attribute() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getModifier() {
        return modifier;
    }

    public void setModifier(int modifier) {
        this.modifier = modifier;
    }
}
