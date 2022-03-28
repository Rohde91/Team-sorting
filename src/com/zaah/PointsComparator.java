package com.zaah;

import java.util.Comparator;

public class PointsComparator implements Comparator<Teams> {

    // Med int compare, går vi ind og sammenligner to integers
    // Nedenfor kan man se rækkefølgen det vil blive udskrevet i.
    // Med den måde return værdierne er skrevet på, bliver pointene skrevet ud med størst først (descending/aftagende).

    public int compare(Teams t1, Teams t2) {

        if (t1.points == t2.points) {
            return 0;
        } else if (t1.points > t2.points) {
            return -1;
        } else {
            return 1;
        }
        /*
        * Ved at man skriver -1 ved else if
        * Og ved at skrive 1 ved else
        * Så får man udskrevet det i en aftagende rækkefølge
        * */
    }
}
