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
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

/**
 *
 * @author b8033335
 */
public class Sier1819 extends Application{
    HBox hBox;
    Button plus;
    Button minus;
    
    @Override
    public void start(Stage stage) throws Exception {
        hBox = new HBox(10);
        plus = new Button("+");
        minus = new Button("-"); 
        TrianglePane pane = new TrianglePane();
         
        hBox.getChildren().addAll(plus, minus, pane);
        hBox.setAlignment(Pos.CENTER);
        
        BorderPane bp = new BorderPane();
        bp.setCenter(pane);
        bp.setBottom(hBox);
        
        
        Scene scene = new Scene(bp, 200, 210);
        stage.setScene(scene);
        stage.show();
        
        plus.setOnAction(event->{
            pane.increaseOrder();
        });
        
        minus.setOnAction(event -> {
            pane.decreaseOrder();
        });
    
    }
    
    public static void main(String[] args){
        launch(args);
    }
    
    static class TrianglePane extends Pane{
       private int order = 1;
       private void increaseOrder(){
           order++;
           paint();
       }
       private void decreaseOrder(){
           order--;
           paint();
       }
       
       public TrianglePane(){
           paint();
       }
       
       public void paint(){
           Point2D p1 = new Point2D(getWidth()/2, 10);
           Point2D p2 = new Point2D(10, getHeight()-10);
           Point2D p3 = new Point2D(getWidth()-10, getHeight()-10);
           this.getChildren().clear();
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
                displayTriangle(order-1, p3, p23, p31);
            }
        }


    }
    
}
