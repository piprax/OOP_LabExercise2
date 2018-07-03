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

public class deritFTLabExer213 {
    public static void main(String[] args) {    
        int[][] data =  { {3, 2, 5, 0, 0, 0},
                          {1, 4, 4, 8, 13, 0},
                          {9, 1, 0, 2, 0, 0},
                          {0, 2, 6, 3, -1, -8} };
        int sum;
        for ( int row = 0; row < data[0].length; row++){
            sum = 0;
            for(int col = 0; col < data.length; col++)
            {
                sum += data[col][row];
                System.out.println("Sum of column: " + sum);
            }
        }
                
            
            

    }
}
