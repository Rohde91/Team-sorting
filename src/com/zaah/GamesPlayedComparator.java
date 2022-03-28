package com.zaah;

import java.util.Comparator;

public class GamesPlayedComparator implements Comparator <Teams> {
    public int compare(Teams t1, Teams t2) {

        // Med int compare, går vi ind og sammenligner to integers
        // Nedenfor kan man se rækkefølgen det vil blive udskrevet i.
        // Med den måde return værdierne er skrevet på, bliver mængden af spillede kampe,
        // skrevet ud med størst først (descending/aftagende).

        if (t1.played == t2.played){
            return 0;
        }
        else if (t1.played > t2.played){
            return -1;
        }
        else {
            return 1;
        }
        /*
         * Ved at man skriver -1 ved else if
         * Og ved at skrive 1 ved else
         * Så får man udskrevet det i en faldende rækkefølge
         * */
    }
}