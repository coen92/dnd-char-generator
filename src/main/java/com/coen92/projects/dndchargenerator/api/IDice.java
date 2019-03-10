package com.coen92.projects.dndchargenerator.api;

import java.util.List;

public interface IDice {

    int d4();
    int d6();
    int d8();
    int d10();
    int d12();
    int d20();
    int d100();
    int dX(int diceWalls);
    List<Integer> multiDiceRolls(int rolls, String diceType);
}
