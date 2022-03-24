package com.zaah;

import java.util.Comparator;
//TODO superligaKlub = Teams

public class Teams implements Comparable <Teams> {
    String teamName;
    int victory;
    int played;
    int points;
    int compValue;

    public Teams(String teamName, int victory, int played, int points) {
        this.teamName = teamName;
        this.victory = victory;
        this.played = played;
        this.points = points;
    }

    @Override
    public String toString() {
        return "Team" +
                "Name= " + teamName +
                ", victory=" + victory +
                ", played=" + played +
                ", points= " + points +
                '}';
    }

    public int compareTo(Teams t) {
        compValue = teamName.compareTo(t.teamName);
        return compValue;
    }
}