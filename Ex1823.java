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
public class Ex1823 {
    
    public static void main(String[] args){
        System.out.println(bin2Dec("11111"));
    }
    
    static int result = 0;
    public static int bin2Dec(String binaryString){
        if(binaryString.length() > 0){
            if(binaryString.charAt(0) == '1'){                
                result += Math.pow(2, binaryString.length()-1);
            }
            bin2Dec(binaryString.substring(1));
        }
        return result;    
    }
}
