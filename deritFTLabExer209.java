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

public class deritFTLabExer209 {
    public static void main(String[] args) {    
        int[] signal = {5, 5, 4, 5, 6, 6, 7, 6, 5, 4, 1, 4};
        int[] smooth = new int [signal.length];
        smooth[0] = (signal[0]+signal[1])/2;
        smooth[signal.length-1] = (signal[signal.length-2]+signal[signal.length-1])/2;
        for(int i = 1; i < signal.length-1; i++)
            smooth[i] = (signal[i]+signal[i-1]+signal[i+1])/3;
        System.out.print("signal ");
        for(int i = 0; i < signal.length; i++)
            System.out.print(signal[i] + " ");
        System.out.println("");
        System.out.print("smooth ");
        for(int i = 0; i < smooth.length; i++)
            System.out.print(smooth[i] + " ");
        System.out.println("");
            

    }
    
}
