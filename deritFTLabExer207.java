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

public class deritFTLabExer207 {
    public static void main(String[] args) {    
        int[] data = {3, 1, 5, 7, 4, 12, -3, 8, -2};
        int largest = 0, largest1 = 0, temp; 
        boolean counter = true;
        while(counter)
        {
            counter = false;
            for(int i = 0; i < data.length-1; i++)
                if(data[i] > data[i+1]){
                    temp = data[i];
                    data[i] = data[i+1];
                    data[i+1] = temp;
                    counter = true;
                }
        }
        System.out.println("Largest: "+ data[data.length-1]);
        System.out.println("Second largest: "+ data[data.length-2]);
    }
    
}
