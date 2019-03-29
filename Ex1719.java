 
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author b8033335
 */
public class Ex1719 {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a file name: ");
        File file = new File(input.nextLine());
        
        try(DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file))){
            while(true){
                System.out.println(Integer.toHexString(dataInputStream.readByte()));
            }
        }catch(Exception e){
        
        }
    
    }
}
