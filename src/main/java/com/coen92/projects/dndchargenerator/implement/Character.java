package com.coen92.projects.dndchargenerator.implement;

import com.coen92.projects.dndchargenerator.implement.general.Attribute;
import com.coen92.projects.dndchargenerator.implement.general.Profession;
import com.coen92.projects.dndchargenerator.implement.general.Race;
import com.coen92.projects.dndchargenerator.implement.general.Sex;
import com.coen92.projects.dndchargenerator.implement.mechanics.Dice;

import java.util.ArrayList;

public class Character {

    private String id;
    private String name;
    private String player;
    private Race race;
    private Sex sex;
    private Profession profession;
    private ArrayList<Attribute> attributes;

    private static Character instance = new Character();

    private Character() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Profession getProfession() {
        return profession;
    }

    public void setProfession(Profession profession) {
        this.profession = profession;
    }

    public ArrayList<Attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(ArrayList<Attribute> attributes) {
        this.attributes = attributes;
    }

    public static Character getInstance() {
        return instance;
    }

    //Method executes mechanics of drawing value for one attribute according to D&D 3.5 ed rules
    //You simply roll 4 times with d6 dice and sum results excluding the smallest value
    private int rollAttributeValue() {
        Dice dice = new Dice();
        ArrayList<Integer> attributeValues = (ArrayList<Integer>) dice.multiDiceRolls(4, "d6");
        int min = attributeValues.get(0);
        int result = 0;

        for(int i=0; i<attributeValues.size(); i++) {

            if(attributeValues.get(i) < min) {
                min = attributeValues.get(i);
            }
        }

        attributeValues.remove(min);

        for(int j=0; j<attributeValues.size(); j++) {
            result += attributeValues.get(j);
        }

        return result;
    }
}
