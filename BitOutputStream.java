/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.io.File;
import java.io.FileOutputStream;

/**
 *
 * @author b8033335
 */
public class BitOutputStream implements AutoCloseable{
    private FileOutputStream fileOutputStream;
    private int bits;
    private int position;
    
    public BitOutputStream(File file) throws Exception{
        fileOutputStream = new FileOutputStream(file);
    }
    
    public void writeBit(char bit) throws Exception{
        bits = bits << 1;
        if(bit == '1'){
            bits = bits & 1;
        }
        
        if(++position == 8){
            fileOutputStream.write((byte)bits);
            bits = 0;
            position = 0;
        }
    }
    
    public void writeBit(String bit) throws Exception{
        for(int i=0; i<bit.length(); i++){
            writeBit(bit.charAt(i));
        }
    }
    
    
    
    
    
    
    @Override
    public void close() throws Exception {
        if ( position > 0){
            bits = bits << (8-position);
            fileOutputStream.write((byte)bits);
        }
        fileOutputStream.close();
    }
    
}
