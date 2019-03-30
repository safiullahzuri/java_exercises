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
public class Ex1802 {
    
    public static void main(String[] args){ 
        
        for(int i=0; i<=100; i++){
            System.out.printf("The fibonacci of %d is %d \n", i, fib(i));
        }
         
        
        
    }

    public static long fib(long index) {
        long f0 = 0;
        long f1 = 1;
        long currentFib = 1;
        for(long i=0; i<index; i++){
            currentFib = f0 + f1;
            f0 = f1;
            f1 = currentFib;
        }
        return currentFib;
  }
    
}
