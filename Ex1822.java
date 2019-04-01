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
public class Ex1822 {
    
    public static void main(String[] args){
        System.out.println(dec2Hex(129569));
    }
    
    static StringBuilder hex = new StringBuilder();
    
    public static String dec2Hex(int value){
        if(value > 0){
            switch(value%16){
                case 0: hex.insert(0, "0"); break;
                case 1: hex.insert(0, "1"); break;
                case 2: hex.insert(0, "2"); break;
                case 3: hex.insert(0, "3"); break;
                case 4: hex.insert(0, "4"); break;
                case 5: hex.insert(0, "5"); break;
                case 6: hex.insert(0, "6"); break;
                case 7: hex.insert(0, "7"); break;
                case 8: hex.insert(0, "8"); break;
                case 9: hex.insert(0, "9"); break;
                case 10: hex.insert(0, "a"); break;
                case 11: hex.insert(0, "b"); break;
                case 12: hex.insert(0, "c"); break;
                case 13: hex.insert(0, "d"); break;
                case 14: hex.insert(0, "e"); break;
                case 15: hex.insert(0, "f");               
                                
            }
            dec2Hex(value/16);
        }
        return hex.toString();    
    }
}
