/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *
 * @author b8033335
 */
public class Ex20 extends Application{
    private static StackPane stackPane = new StackPane();

    @Override
    public void start(Stage stage) throws Exception {
        int numberOfCircles = 16; // Number of ovals
		addCircles(numberOfCircles);
		stackPane.setPadding(new Insets(10, 10, 10, 10));

		// Create a scene and place it in the stage
		Scene scene = new Scene(stackPane);
		stage.setTitle("Exercise_18_20"); // Set the stage title
		stage.setScene(scene); // Place the scene in the stage
		stage.show(); // Display the stage
    }
    
    public static void main(String[] args){
        launch(args);
    }
    
    public static void addCircles(int n){
        if(n > 0){
            Circle circle = new Circle(n*10);
            circle.setFill(Color.WHITE);
            circle.setStroke(Color.BLACK);
            stackPane.getChildren().add(circle);
            addCircles(n-1);
        }
    }
    
}
