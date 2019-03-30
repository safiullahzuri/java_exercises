/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.Scanner;

/**
 *
 * @author b8033335
 */
public class Ex1808 {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        long a = input.nextLong();
        reverseDisplay(a);
    }
    
    public static void reverseDisplay(long value){
         while(value > 0){
             System.out.print(value%10);
             value = value / 10;
         }
    }
    
}
