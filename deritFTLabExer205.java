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
public class deritFTLabExer205 {
    public static void main(String[] args) {
        int[] val = {0, 1, 2, 3, 4};
        int temp; 
        System.out.println( "Original Array: " + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );
        for(int i = 0; i < 2; i++)
        {
            temp = val[i];
            val[i] = val[3-i];
            val[3-i] = temp;
        }
        System.out.println( "Reversed Array: " + val[0] + " " + val[1] + " " + val[2] + " " + val[3]);



        
    }
    
}
