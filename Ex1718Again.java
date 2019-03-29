
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
public class Ex1718Again {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a file name: ");
        File file = new File(input.nextLine());
        
        try(DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file))){
            while(true){
                System.out.println(getBits(dataInputStream.readByte()));
            }
        }catch(Exception e){
        
        }
    }
    
    public static String getBits(int value){
        StringBuilder sb = new StringBuilder();
        sb.append(value%2 == 0 ? "0":"1");
        for(int i=1; i<=8; i++){
            value = value >> 1;
            sb.insert(0, value%2 == 0 ? "0":"1");
        }
        return sb.toString();
    }
    
    
}
