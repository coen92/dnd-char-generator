package com.coen92.projects.dndchargenerator.implement;

import com.coen92.projects.dndchargenerator.implement.general.Race;

public class Character {

    private String name;
    private Race race;

    private static Character instance = new Character();

    private Character() {

    }

    public static int fibonacci(int num) {

        if(num < 0) {
            return -1;
        } else if(num == 0) {
            return 0;
        } else if(num == 1) {
            return 1;
        } else {
            return fibonacci(num-1) + fibonacci(num -2);
        }
    }
}
