/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexercises5;

import java.util.Scanner;
import java.lang.*;

/**
 *
 * @author Adhiambo oyier
 */
public class FloatHandler {
     public static void main(String[] args) {
         System.out.println("Enter float value number: \n");
         Scanner input = new Scanner(System.in);
         float raw = input.nextFloat();
         System.out.println(Math.round(raw));
         System.out.println(Math.floor(raw));
         System.out.println(Math.ceil(raw));
     }
}
