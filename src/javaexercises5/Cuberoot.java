/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexercises5;

import java.util.Scanner;
import java.math.*;
/**
 *
 * @author Adhiambo oyier
 */
public class Cuberoot {
     public static void main(String[] args) {
         System.out.println("Enter number to check: \n");
         Scanner input = new Scanner(System.in);
         double num = input.nextDouble();
         double temp = Math.round(Math.cbrt(num));
         if(Math.pow(temp,3)  == num){
             System.out.println("Number is perfect cube"); 
         }
         else{
              System.out.println("Number is not a perfect cube");
         }
     }
}
