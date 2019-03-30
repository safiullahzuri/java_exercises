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
public class Ex1804 {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.println(addRationalNumbers(a));
    }
    
    public static float addRationalNumbers(int limit){
        if(limit == 1){
            return 1;
        }else{
            return (float)1/limit+addRationalNumbers(limit-1);
        }
    }
}
