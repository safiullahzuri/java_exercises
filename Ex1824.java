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
public class Ex1824 {
    public static void main(String[] args){
        System.out.println(hex2Dec("fa13d"));
    }    
    static int result = 0;
    public static int hex2Dec(String hexString){ 
        int dec;
        hexString = hexString.toUpperCase();
        if(hexString.length() > 0){
            if(hexString.charAt(0) >= 'A' && hexString.charAt(0) <= 'F'){
                dec = (hexString.charAt(0)-'A')+10;
            }else{
                dec = Integer.parseInt(hexString.charAt(0)+"");
            }
            result += dec * Math.pow(16, hexString.length()-1);
            hex2Dec(hexString.substring(1));

        }
        return result;
    }
}
