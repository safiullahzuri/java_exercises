/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;
 
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author b8033335
 */
public class Ex1721 extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        HexEditor he = new HexEditor();
        Scene scene = new Scene(he);
        stage.setTitle("Ex 17.21");
        stage.setScene(scene);
        stage.show();
    }
    
    public static void main(String[] args){
        launch(args);
    }
    
}
