/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexercises5;

import java.util.Scanner;

/**
 *
 * @author Adhiambo oyier
 */
public class Armstrong {
     public static void main(String[] args) {
         System.out.println("Enter number to analyze: \n");
         Scanner input = new Scanner(System.in);
         String num = input.next();
         String exploded[] = num.split("");
         int converted[] = new int[exploded.length];
         for(int i = 0; i < converted.length; i++){
            converted[i] = Integer.parseInt(exploded[i]);
         }
        if(ifArmstrong(converted, Integer.parseInt(num))){
            System.out.println("Number is Armstrong");
        }
        else{
            System.out.println("Number is not Armstrong!");
        }
        
     }
    static boolean ifArmstrong(int digits[], int number){
        int sum = 0;
        for(int j = 0; j < digits.length; j++){
            sum += Math.pow(digits[j], 3);
        }
       return sum == number;
    }
}
