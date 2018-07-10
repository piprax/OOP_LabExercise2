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
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class deritFTLabExer210 {
    public static void main(String[] args) throws IOException { 
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        double[] data = new double[13];                    
        double sum = 0, ave, farthest = 0;
        for(int i = 0; i < data.length; i++){
            System.out.print("Data[ " + i + " ] = ");
            data[i] = Double.parseDouble(input.readLine());
        }
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