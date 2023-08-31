package com.example;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
 
public class Main {
    
    //function for writing multiple instances of cards, still needs to be debugged to work properly
    public static ArrayList<Integer> automatic(int a, ArrayList<Integer> tiles) {
         
         for (int i = 0; i < tiles.size()*2; i++) {
            if (i < tiles.size()) {
                tiles.add(i);
            } else {
                int counter = i-tiles.size();
                tiles.add(counter);
            }
        }
        System.out.println(tiles);
        return tiles;
    }
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many pairs do you want to have generated?");       
        int pairsGenerated = scanner.nextInt();

        //tiles used for matching, generated, shuffled
        ArrayList<Integer> tiles = new ArrayList<>();
        automatic(pairsGenerated, tiles);
        Collections.shuffle(tiles);
        
        //Print out shuffled tiles with for-each loop
        for (int i : tiles) {
            System.out.println(i);
        }
        
        //to be cont: 
        //String[] board = new String[tiles.size()];
        //boolean[] flipped = new boolean[tiles.size()];
        //int pairsFound = 0; 

        
    }
}