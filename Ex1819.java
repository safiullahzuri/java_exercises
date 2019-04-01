/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import javafx.application.Application;
import javafx.geometry.Point2D;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

/**
 *
 * @author b8033335
 */
public class Ex1819 extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        SierpinskiTriangle sierpinskiTriangle = new SierpinskiTriangle();
        TextField tfOrder = new TextField();
        tfOrder.setOnAction(event -> {
            sierpinskiTriangle.setOrder(Integer.parseInt(tfOrder.getText()));
        });
        
        tfOrder.setPrefColumnCount(4);
        tfOrder.setAlignment(Pos.BOTTOM_RIGHT);
        
        HBox hBox = new HBox(10);
        hBox.getChildren().addAll(new Label("Enter an order:"), tfOrder);
        hBox.setAlignment(Pos.CENTER);
        
        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(sierpinskiTriangle);
        borderPane.setBottom(hBox);
        
        
        Scene scene = new Scene(borderPane, 200, 210);
        stage.setTitle("Sierpinski Triangle");
        stage.setScene(scene);
        stage.show();
        
        
    }
    public static void main(String[] args){
        launch(args);
    }
    
    static class SierpinskiTriangle extends Pane{
        private int order = 0;
        private void setOrder(int order){
            this.order = order;
            paint();
        }

        public SierpinskiTriangle() {
        }
        
        protected void paint(){
            Point2D p1 = new Point2D(getWidth()/2, 10);
            Point2D p2 = new Point2D(10, getHeight()-10);
            Point2D p3 = new Point2D(getWidth()-10, getHeight()-10);
            displayTriangle(order, p1, p2, p3);
        }

        private void displayTriangle(int order, Point2D p1, Point2D p2, Point2D p3) {
            if(order == 0){
                Polygon triangle = new Polygon();
                triangle.getPoints().addAll(p1.getX(), p1.getY(), p2.getX(), p2.getY(), p3.getX(), p3.getY());
                triangle.setStroke(Color.BLACK);
                triangle.setFill(Color.WHITE);
                this.getChildren().add(triangle);
            }else{
                Point2D p12 = p1.midpoint(p2);
                Point2D p23 = p2.midpoint(p3);
                Point2D p31 = p3.midpoint(p1);
            
                displayTriangle(order-1, p1, p12, p31);
                displayTriangle(order-1, p12, p2, p23);
                displayTriangle(order-1, p31, p23, p3);
            
            }
        }
        
        
    
    }
    
}
