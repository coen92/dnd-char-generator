package com.coen92.projects.dndchargenerator.implement.general;

public class Profession {

    private String className;
    private int level;

    public Profession(String className, int level) {
        this.className = className;
        this.level = level;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
