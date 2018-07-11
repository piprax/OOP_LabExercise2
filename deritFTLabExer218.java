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

public class deritFTLabExer218{
    public static void main(String[] args) {  
 
        for (int i = 0, out = 0; i < 64; i++, out = (i / 8) * 8){
            for (int j = 0; j < 64; j++){
                System.out.println(out);
            }
        }
    }
}