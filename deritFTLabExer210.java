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
import java.lang.*;

public class deritFTLabExer210 {
    public static void main(String[] args) {    
        double[] data = {5.6, 6.2, 6.0, 5.5, 5.7, 6.1, 7.4, 5.5, 5.5, 6.3, 6.4, 4.0, 6.9};
        double sum = 0, ave, farthest = 0, temp;
        boolean counter = true;
        for(int i = 0; i < data.length; i++)
            System.out.println("Data[ " + i + " ] = " + data[i]);
        //Sum and average of values
        for(int i = 0; i < data.length; i++)
            sum += data[i];
        ave = sum/data.length;
        System.out.println("average: "+ ave);
        //Farthest value from average
        for(int i = 0; i < data.length-1; i++)
            if(Math.abs(ave-data[i]) > Math.abs(ave-data[i+1]))
                farthest = data[i];
        System.out.println("most distant value: " + farthest);
        //New Average
        sum -= farthest;
        ave = sum/data.length;
        System.out.println("new average: " + ave);
        
        
    }
    
}
