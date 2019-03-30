/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

/**
 *
 * @author b8033335
 */
public class HexEditor extends BorderPane{
    private TextField tfFileName;
    private TextArea taFile;
    
    public HexEditor(){
        drawGUI();
    }

    private void drawGUI() {
        Label lblFileName = new Label("Enter a file:");
        tfFileName = new TextField();
        taFile = new TextArea();
        
        Button btSave = new Button("Save the change");
        tfFileName.setOnKeyPressed(event -> {
            if(event.getCode().equals(KeyCode.ENTER)){
                loadFile();
            }
        });
        
        btSave.setOnAction(event-> saveChanges());
        
        taFile.setWrapText(true);
        HBox hbFileEntry = new HBox(10);
        hbFileEntry.getChildren().addAll(lblFileName, tfFileName);
        
        setTop(hbFileEntry);
        setCenter(taFile);
        setBottom(btSave);
        setAlignment(btSave, Pos.CENTER);
        
        
    }

    private void loadFile() {
        StringBuilder bin = new StringBuilder();
        StringBuilder hex = new StringBuilder();
        try(DataInputStream dataInputStream = new DataInputStream(new FileInputStream(tfFileName.getText()))){
            
            while(true){
                int value = dataInputStream.readByte();
                hex.append(getHexVal(value));
            }
            
            
            
        }catch(Exception e){
            taFile.setText(e.toString());
        }
    }

    private static String getHexVal(int value) {
        String h = Integer.toHexString(value);
        if(h.length() == 1){
            h = "0" + h;
        }
        return h;
    }

    private void saveChanges() {
        try(BitOutputStream bos = new BitOutputStream(new File(tfFileName.getText()))){
            StringBuilder sb = new StringBuilder();
            String text = tfFileName.getText();
            for(int i=0; i<text.length(); i++){
                int a = hexToDec(text.charAt(i));
                int b = hexToDec(text.charAt(i+1));
                int value = (a*16)+b;
                sb.append(getBits(value));
            }
        }catch(Exception e){
        
        }
    }

    private static String getBits(int value) {
        StringBuilder sb = new StringBuilder();
        sb.append(value%2 == 0? "0": "1");
        for(int i=1; i<8; i++){
            value = value >> 1;
            sb.insert(0, (value%2 ==0)?"0":"1");
        }
        return sb.toString();
    }

    private static int hexToDec(char c) {
        if(Character.isDigit(c)){
            return Integer.parseInt(Character.toString(c));
        }
        int num = 0;
        switch(Character.toLowerCase(c)){
            case 'a': num = 10; break;
            case 'b': num = 11; break;
            case 'c': num = 12; break;
            case 'd': num = 13; break;
            case 'e': num = 14; break;
            case 'f': num = 15; 
        }
        return num;
    }
    
    
}
