package com.example;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> tiles = new ArrayList<>();
        int[] automatic = {1, 2, 3, 4, 5};
        int x = 0;
        for (int i = 0; i < 9; i++) {
            tiles.add(automatic[i]);
            if (x == 4) {
                x = 0;
            }
            x++;
        }
        Collections.shuffle(tiles);
        String[] board = new String[tiles.size()];
        boolean[] flipped = new boolean[tiles.size()];
        int pairsFound = 0;
    }
}