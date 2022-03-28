package com.zaah;

import java.util.Comparator;

public class TeamNameComparator implements Comparator <Teams> {
    public int compare(Teams t1, Teams t2){
        //int compValue = t1.teamName.compareTo(t2.teamName);
        //return compValue;

        // Begge metoder fungerer ens.
        // Den udkommenterede bliver brugt i Teams.java - linje 29-32
        // Den sammenligner værdierne i teams og bruger compareTo til at sammenligne de forskellige String værdier
        // Når vi laver de forskellige returns på denne måde, så skriver den det ud i alfabetisk rækkefølge

        if (t1.teamName.compareTo(t2.teamName) == 0) {
            return 0;
        } else if (t1.teamName.compareTo(t2.teamName) > 0) {
            return 1;
        } else {
            return -1;
        }
    }
}
