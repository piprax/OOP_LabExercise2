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

public class deritFTLabExer206 {
    public static void main(String[] args) {    
        int[] data = {3, 2, 5, 7, 9, 12, 97, 24, 54};
        int even = 0, odd = 0, sum = 0;
        for(int i = 0; i < data.length; i++)
        {
            if(data[i]%2 == 0)
                even += data[i];
            else
                odd += data[i];
            sum += data[i];
        }
        System.out.println("Sum of Odd: "+ odd);
        System.out.println("Sum of Even: "+ even);
        System.out.println("Sum of all numbers: "+ sum);
    }
    
}
