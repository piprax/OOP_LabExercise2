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

public class deritFTLabExer217 {
    public static void main(String[] args) {    
        int[][] image = {{0,0,0,0,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,0,0,0,0},
                         {0,0,5,5,5,5,5,5,5,5,0,0},
                         {0,0,5,5,5,5,5,5,5,5,0,0},
                         {0,0,5,5,5,5,5,5,5,5,0,0},
                         {0,0,5,5,5,5,5,5,5,5,0,0},
                         {0,0,5,5,5,5,5,5,5,5,0,0},
                         {0,0,5,5,5,5,5,5,5,5,0,0},
                         {0,0,5,5,5,5,5,5,5,5,0,0},
                         {0,0,5,5,5,5,5,5,5,5,0,0},
                         {0,0,0,0,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,0,0,0,0}};
        
        int[][] smooth = new int[ image.length ][ image[0].length ];
        for ( int row=0; row<image.length; row++ ){
            for ( int col=0; col<image[row].length; col++ ){
                System.out.print(image[row][col]);
            }
            System.out.println("");
        }
        System.out.println("");
        int ave;
        for ( int r=0; r<image.length; r++ ){
            for ( int c=0; c<image[r].length; c++ ){
                if(r >=1 && r <= image.length-2 && c >= 1 && c <= image.length-2){
                    ave = (image[r-1][c-1]+image[r-1][c ]+image[r-1][c+1]+image[r ][c-1]+image[r ][c ]+
                          image[r ][c+1]+image[r+1][c-1]+image[r+1][c ]+ image[r+1][c+1])/9;
                    smooth[r][c] = ave;
                    System.out.print(smooth[r][c]);          
                }
                else
                    System.out.print(image[r][c]);
            }
            System.out.println("");
        }
        
    }
}
