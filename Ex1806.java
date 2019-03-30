/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import static javaapplication4.Ex1805.m;

/**
 *
 * @author b8033335
 */
public class Ex1806 {
    
    public static void main(String[] args){
        System.out.println("Enter a number: ");
        for(int i=1; i<=10; i++){
            System.out.printf("The m(%d) equals to %.8f \n", i, m(i));
        }
    }
    
    public static float m(int i){
        if(i == 1){
            return (float) 1/2;
        }else{
            return (float)i/(i+1) + m(i-1);
        }
    }
}
