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
public class Ex1818 {
    
    public static void main(String[] args){
        int a = moveHanoiTower(5, 'A', 'B', 'C');
        System.out.println(a+ " times");
    }
    
    static int times = 0;
    public static int moveHanoiTower(int n, char fromTower, char toTower, char auxTower){
        times++;
        if(n == 1){
            System.out.printf("Move disk %d from %c tower to %c tower.\n",n , fromTower, toTower);
        }else{
            moveHanoiTower(n-1, fromTower, auxTower, toTower);
            System.out.printf("Move disk %d from %c tower to %c tower.\n", n, fromTower, toTower);
            moveHanoiTower(n-1, auxTower, toTower, fromTower);
        }
        return times;
    }
}
