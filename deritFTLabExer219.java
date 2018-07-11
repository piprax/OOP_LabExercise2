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
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class deritFTLabExer219 {
    public static void main(String[] args) throws IOException {    
        int[][] image = new int[64][64];
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        int[][] smooth = new int[ image.length ][ image[0].length ];
        for ( int row=0; row<image.length; row++ ){
            for ( int col=0; col<image[row].length; col++ ){
                image[row][col] = Integer.parseInt(input.readLine());
            }
        }
        for ( int r=0; r<image.length; r++ ){
            for ( int c=0; c<image[r].length; c++ ){
                if(image[r][c] >= 0 && image[r][c] <= 7)
                    System.out.print(" ");          
                else if(image[r][c] >= 8 && image[r][c] <= 15)
                    System.out.print(".");
                else if(image[r][c] >= 16 && image[r][c] <= 23)
                    System.out.print(",");
                else if(image[r][c] >= 24 && image[r][c] <= 31)
                    System.out.print("-");
                else if(image[r][c] >= 32 && image[r][c] <= 39)
                    System.out.print("+");
                else if(image[r][c] >= 40 && image[r][c] <= 47)
                    System.out.print("o");
                else if(image[r][c] >= 48 && image[r][c] <= 55)
                    System.out.print("O");
                else if(image[r][c] >= 56 && image[r][c] <= 64)
                    System.out.print("X");
            }
            System.out.println("");
        }
        
    }
}
