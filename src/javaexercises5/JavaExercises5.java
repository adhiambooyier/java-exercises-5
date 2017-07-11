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
public class JavaExercises5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        choose();            
    }
    private static void choose(){
        System.out.println("Choose a question\n");
        System.out.println("1) Write a program to check whether a number is a perfect cube.\n" +
                           "2) Write a method to check whether a password is valid. A password is valid if it has a minimum of 10 characters, contains only digits and letters, and has at least 2 digits.\n" +
                           "3) write a program that takes in a float value and returns the nearest whole number\n" +
                           "4) Write a program to check if a number is Armstrong. A number is armstrong if the sum of the cube of the digits is eaqual to the number. \n" +
                           "5) Alternative solution to Armstrong. \n");
    Scanner input = new Scanner(System.in);
    System.out.print("\n");
        
        int question = input.nextInt();
        switch (question){
            case 1:
                Cuberoot.main(null);
                break;

            case 2:
                Password.main(null);
                break;

            case 3:
               FloatHandler.main(null);
                break;

            case 4:
               Armstrong.main(null);
                break;
            case 5:
               ArmstrongAlt.main(null);
                break;
            default:
                System.out.println("\nInvalid choice");
                choose();
                break;
        
    }
    }
    
}
