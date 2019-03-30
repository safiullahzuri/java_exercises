/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author b8033335
 */
public class Ex1801 {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        BigInteger integer = new BigInteger(input.nextLine());
        
        System.out.printf("Factorial of %s is %s", integer.toString(), findFactorial(integer));
    }

    private static BigInteger findFactorial(BigInteger integer) {
        if(integer.equals(new BigInteger("0")) || integer.equals(new BigInteger("1"))){
            return integer;
        }else{
            return integer.multiply(findFactorial(integer.subtract(new BigInteger("1"))));
        }
    }
    
}
