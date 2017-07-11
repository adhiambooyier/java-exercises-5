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
public class Password {
     static Scanner input = new Scanner(System.in);
     public static void main(String[] args) {
        System.out.println("Enter password to check: \n");  
        String pass = input.nextLine();
        if(pass.length() >= 10 && LetterDigit(pass) && TwoDigits(pass)){
            System.out.println("Password is valid. \n");
        }
        else{
            System.out.println("Invalid pasword!");
        }
     }
     static boolean LetterDigit(String pw){
       
       for(int i = 0; i < pw.length(); i++){
           if(!Character.isLetterOrDigit(pw.charAt(i))){
              return false;
           }
       
       }
         return true;
     }
     static boolean TwoDigits(String pw){
         int checker = 0;
         for(int j = 0; j < pw.length(); j++){
             if(Character.isDigit(pw.charAt(j)))
                 checker++;
             //System.out.println(checker);
         }
         return checker >= 2;
}
}
