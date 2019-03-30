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
public class Ex1803 {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number please: ");
        int a = input.nextInt();
        System.out.println("Enter the second number please: ");
        int b = input.nextInt();
        
        System.out.printf("The GCD of %d and %d is %d", a,b,gcd(Math.max(a, b), Math.min(a, b)));
    }
    
    
    public static int gcd(int m, int n){
        if(m % n == 0){
            return n;
        }else{
            return gcd(n, m%n);
        }
    }
}
