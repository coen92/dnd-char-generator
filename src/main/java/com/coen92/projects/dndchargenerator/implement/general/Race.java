package com.coen92.projects.dndchargenerator.implement.general;

import java.util.Map;

public class Race {

    private String raceName;
    private Map<String, Integer> attributeModifier;

    protected Race(String raceName) {

    }

    public String getRaceName() {
        return raceName;
    }

    public void setRaceName(String raceName) {
        this.raceName = raceName;
    }
}
