
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author b8033335
 */
public class Ex1717 {
    private FileOutputStream fileOutputStream;
    int bits;
    int bitPosition = 0;
    
    
    public Ex1717(File file) throws Exception{
        fileOutputStream = new FileOutputStream(file);
    }
    
    public void writeBit(char bit) throws IOException{
        bits = bits << 1;
        if(bit == '1'){
            bits = bits | 1;
        }
        if(++bitPosition == 8){
            fileOutputStream.write(bits);
            bitPosition = 0;
        }    
    }
    
    public void writeBit(String bit) throws Exception{
        for(int i=0; i<bit.length(); i++){
            writeBit(bit.charAt(i));
        }
    }
    
    public void close() throws Exception{
        if(bitPosition > 0){
            bits = bits << (8-bitPosition);
            fileOutputStream.write(bits);
        }
        fileOutputStream.close();
    }
    
    public static void main(String[] args){
        File file = new File("F://b.txt");
        String bits = "1010101010000011";
        try{
            BitOutputStream bos = new BitOutputStream(file);
            bos.writeBit(bits);
            
            FileInputStream input = new FileInputStream(file);
            int value;
            while((value = input.read()) != -1 ){
                System.out.print((byte)value);
            }
            
        }catch(Exception e){
        
        }
    
    }
    
    
}
