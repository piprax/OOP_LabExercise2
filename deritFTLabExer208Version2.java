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

public class deritFTLabExer208Version2 {
    public static void main(String[] args) {    
        int[] data = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        int[] result = new int[data.length];
        for(int j = 0; j < data.length; j++)
            result[j] = data[data.length-1-j];
        System.out.print("Data: ");
        for(int j = 0; j < data.length; j++)
            System.out.print(" " + result[j]);
        System.out.println("");
    }
    
}
