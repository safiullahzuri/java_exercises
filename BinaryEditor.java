
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author b8033335
 */
public class BinaryEditor extends BorderPane{
    TextField tfFileName;
    TextArea taFile;
    
    public BinaryEditor(){
        drawGUI();
    }
 

    private void drawGUI() {
        Label lblFileName = new Label("Enter a file: ");
        tfFileName = new TextField();
        taFile = new TextArea();
        Button btSave = new Button("Save the change");
        tfFileName.setOnKeyPressed(event -> {
            if(event.getCode().equals(KeyCode.ENTER)){
                loadFile();
            }
        });
        
        btSave.setOnAction(event -> saveChanges());
        taFile.setWrapText(true);
        
        HBox hbFileEntry = new HBox(10);
        hbFileEntry.getChildren().addAll(lblFileName, tfFileName);
        setTop(hbFileEntry);
        setCenter(taFile);
        setBottom(btSave);
        setAlignment(btSave, Pos.CENTER);
        
        
    }

    private void loadFile() {
        StringBuilder sb = new StringBuilder();
        try(FileInputStream input = new FileInputStream(tfFileName.getText())){
            int r;
            while ((r=input.read()) != -1){
                sb.append(getBits(r));
            }
            taFile.setText(sb.toString());
        }catch(Exception e){
        
        }
    }

    private static String getBits(int value) {
        StringBuilder sb = new StringBuilder();
        sb.append(value%2 == 0? "0":"1");
        for(int i=1; i<8; i++){
            value = value >> 1;
            sb.insert(0, value%2 == 0? "0":"1");
        }
        return sb.toString();
    }

    private void saveChanges() {
        try{
            BitOutputStream bos = new BitOutputStream(new File(tfFileName.getText()));
            bos.writeBit(taFile.getText());
        }catch(Exception e){
        
        }
    }
    
    
    
    
}
