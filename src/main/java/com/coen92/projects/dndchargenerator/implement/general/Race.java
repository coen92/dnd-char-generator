package com.coen92.projects.dndchargenerator.implement.general;

import java.util.Map;

public class Race {

    private String raceName;
    private Map<Attribute, Integer> attributeModifier;

    protected Race() {

    }

    public String getRaceName() {
        return raceName;
    }

    public void setRaceName(String raceName) {
        this.raceName = raceName;
    }

    public Map<Attribute, Integer> getAttributeModifier() {
        return attributeModifier;
    }

    public void setAttributeModifier(Map<Attribute, Integer> attributeModifier) {
        this.attributeModifier = attributeModifier;
    }
}
