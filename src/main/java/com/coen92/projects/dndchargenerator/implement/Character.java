package com.coen92.projects.dndchargenerator.implement;

import com.coen92.projects.dndchargenerator.implement.general.Attribute;
import com.coen92.projects.dndchargenerator.implement.general.Race;
import com.coen92.projects.dndchargenerator.implement.mechanics.Dice;

import java.util.ArrayList;

public class Character {

    private String name;
    private Race race;
    private ArrayList<Attribute> attributes = new ArrayList<>();

    private static Character instance = new Character();

    private Character() {

        //SET MODIFIERS FOR ALL ATTRIBUTES DEPENDING ON RACE
        //ADD METHOD TO ROLL ALL 6 ATTRIBUTE VALUES AND CHOOSE WHICH VALUE GOES TO WHICH ATTRIBUTE
        attributes.add(0, new Attribute("Strength", rollAttributeValue(), 0));
        attributes.add(1, new Attribute("Dexterity", rollAttributeValue(), 0));
        attributes.add(2, new Attribute("Constitution", rollAttributeValue(), 0));
        attributes.add(3, new Attribute("Intelligence", rollAttributeValue(), 0));
        attributes.add(4, new Attribute("Wisdom", rollAttributeValue(), 0));
        attributes.add(5, new Attribute("Charisma", rollAttributeValue(), 0));
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
