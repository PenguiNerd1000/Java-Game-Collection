package com.example;
import java.util.ArrayList;
import java.util.Collections;
import java.lang.NumberFormatException;
import java.util.Scanner;
 
public class Main {
    public static ArrayList automatic(int a, ArrayList<Integer> tiles) {
         //shorthand for not writing multiple instances of cards
        ArrayList<Integer> automatic = new ArrayList<>();
        int x = 0;
        for (int i = 0; i < automatic.size()*2; i++) {
            tiles.add(automatic.get(x));
            if (x == 4) {
                x = 0;
            }            
            x++;
        }
        return automatic;
    }

    public static int tryStringToInt(String response) {
        return 1;
        //return pairsGenerated;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many pairs do you want to have generated?");       
        

        //tiles used for matching
        ArrayList<Integer> tiles = new ArrayList<>();
    
    
        //automatic(tryStringToInt(response), tiles);
        int pairsGenerated = 0;
        String response1 = scanner.nextLine();
    
        try {
            pairsGenerated = Integer.parseInt(response1);
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid integer number");
        } finally {
            System.out.println(pairsGenerated);
        }
        System.out.println(pairsGenerated);
        
        Collections.shuffle(automatic(pairsGenerated, tiles));
        //String[] board = new String[tiles.size()];
        //boolean[] flipped = new boolean[tiles.size()];
        //int pairsFound = 0; 

        //Print out shuffled tiles with for-each loop
        for (int i : tiles) {
            System.out.println(i);
        }
    }
}