package com.coen92.projects.dndchargenerator.implement.mechanics;

import com.coen92.projects.dndchargenerator.api.IDice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Dice implements IDice {

    @Override
    public int d4() {
        int result = randomWithRange(1, 4);
        return result;
    }

    @Override
    public int d6() {
        int result = randomWithRange(1, 6);
        return result;
    }

    @Override
    public int d8() {
        int result = randomWithRange(1, 8);
        return result;
    }

    @Override
    public int d10() {
        int result = randomWithRange(1, 10);
        return result;
    }

    @Override
    public int d12() {
        int result = randomWithRange(1, 12);
        return result;
    }

    @Override
    public int d20() {
        int result = randomWithRange(1, 20);
        return result;
    }

    @Override
    public int d100() {
        int result = randomWithRange(1, 100);
        return result;
    }

    @Override
    public int dX(int diceWalls) {
        int result = randomWithRange(1, diceWalls);
        return result;
    }

    @Override
    public List<Integer> multiDiceRolls(int rolls, String diceType) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> results = new ArrayList<>();
        ArrayList<String> diceTypes = new ArrayList<>(Arrays.asList("d4", "d6", "d8", "d10", "d12", "d20", "dx"));
        int result = 0;

        if (diceTypes.contains(diceType.toLowerCase())) {

            for (int j = 0; j < rolls; j++) {

                switch (diceType.toLowerCase()) {
                    case "d4":
                        result = d4();
                        break;
                    case "d6":
                        result = d6();
                        break;
                    case "d8":
                        result = d8();
                        break;
                    case "d10":
                        result = d10();
                        break;
                    case "d12":
                        result = d12();
                        break;
                    case "d20":
                        result = d20();
                        break;
                    case "d100":
                        result = d100();
                        break;
                    case "dx":
                        System.out.println("Enter dice walls number:");
                        int walls = scanner.nextInt();
                        result = dX(walls);
                        break;
                }
                results.add(result);
            }
        } else {
            System.out.println("Invalid dice type");
        }
        return results;
    }

    //Returns a random number between min and max values (inclusive: <min ; max>)
    private int randomWithRange(int min, int max) {
        int range = (max - min) + 1;
        int result = (int)(Math.random() * range) + min;

        return result;
    }

    //Returns randomly value of 0 or 1
    private int randomZeroOrOne() {
        int result = (int) Math.round(Math.random());

        return result;
    }
}
