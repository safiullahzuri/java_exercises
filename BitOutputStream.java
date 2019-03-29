
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author b8033335
 */
public class BitOutputStream  {
    private FileOutputStream out;
    int bits;
    int bitPos;
    
    public BitOutputStream(File file) throws Exception{
        out = new FileOutputStream(file);
    }
    
    public void writeBit(char bit) throws IOException{
        bits = bits << 1;
        if(bit == '1'){
            bits = bits | 1;
        }
        
        if(++bitPos == 8){
            out.write(bits);
            bitPos = 0;
        }
    }
    
    
    public void writeBit(String bit) throws IOException{
        for(int i=0; i<bit.length(); i++){
            writeBit(bit.charAt(i));
        }
    }
    
    public void close() throws IOException{
        if(bitPos > 0){
            bits = bits << (8-bitPos);
            out.write(bits);
        }
        out.close();
    }
    
    public static void main(String[] args){
        File file = new File("F://a.txt");
        String bits = "1010101010000011";
        try{
            BitOutputStream bos = new BitOutputStream(file);
            bos.writeBit(bits);
        }catch(Exception e){
        
        }
        
    }
    
    
    
    
}
