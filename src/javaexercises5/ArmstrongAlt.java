/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexercises5;

import java.util.Scanner;
import static javaexercises5.Armstrong.ifArmstrong;

/**
 *
 * @author Adhiambo oyier
 */
public class ArmstrongAlt {
    public static void main(String[] args) {
         System.out.println("Enter number to analyze: \n");
         Scanner input = new Scanner(System.in);
         int num = input.nextInt();
         if(isArmstrong(num)){
            System.out.println("Number is Armstrong");
        }
        else{
            System.out.println("Number is not Armstrong!");
        }
}
    private static boolean isArmstrong(int number){
        char[] numbers = Integer.toString(number).toCharArray();
        int sum = 0;
        for(char c : numbers){
            sum += Math.pow(Integer.parseInt(Character.toString(c)), 3);
        }
        return sum == number;
    }
}
    
