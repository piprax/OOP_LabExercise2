/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabExercise2;

/**
 *
 * @author Francis Derit
 */
import java.io.* ;

public class deritFTLabExer215 {
    public static void main(String[] args) {    
        int[][] data =  { {3, 2, 5},
                        {1, 4, 4, 8, 13},
                        {9, 1, 0, 2},
                        {0, 2, 6, 3, -1, -8} };
        for ( int row = 0; row < data.length; row++){
            int max = 0;
            for(int col = 0; col < data[row].length; col++){
                if(data[row][col] > max)
                    max = data[row][col];
            }
            System.out.println("Max: " + max);
        }
        
    }
}
