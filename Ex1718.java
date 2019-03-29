
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
public class Ex1718 {
    public static void main(String[] args){
        
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter a file: ");
        File file = new File(userInput.nextLine());
        
        if(!file.exists()){
            System.out.println("File "+file.getName()+" does not exist.");
            System.exit(1);
        }
        
        try(DataInputStream inputStream = new DataInputStream(new FileInputStream(file))){
            while(true){
                System.out.println(getBits(inputStream.readByte()));
            }
        }catch(Exception e){
        
        }
       
    }

    private static String getBits(int value) {
        StringBuilder sb = new StringBuilder();
        sb.append(value %2 == 0 ? "0":"1");
        for(int i=1; i<8; i++){
            value = value >> 1;
            sb.insert(0, (value%2 == 0) ? "0":"1");
        }
        return sb.toString();
    }
}
