/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

/**
 *
 * @author b8033335
 */
public class Ex1821 {
    
    public static void main(String[] args){
        System.out.println(dec2Bin(16));
    }
    static StringBuilder sb = new StringBuilder();
    public static String dec2Bin(int value){
        
        if(value > 0){
            sb.insert(0, value%2);
            dec2Bin(value/2);
        }
        return sb.toString();
    }
}
