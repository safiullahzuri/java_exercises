/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author b8033335
 */
public class Ex1807 {
    private static int times = 0;
    
    public static void main(String[] args){
        fib(3);
        System.out.println(times);
    
    
    }
    
    public static long fib(int n){
        times++;
        if(n == 0 || n == 1){
            return n;
        }else{
            
            return fib(n-1) + fib(n-2);
        }
    }
    
}
