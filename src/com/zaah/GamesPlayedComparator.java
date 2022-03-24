package com.zaah;

import java.util.Comparator;

public class GamesPlayedComparator implements Comparator <Teams> {
    public int compare(Teams t1, Teams t2) {

        if (t1.played == t2.played){
            return 0;
        }
        else if (t1.played > t2.played){
            return -1;
        }
        else {
            return 1;
        }


    }
}