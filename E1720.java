
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author b8033335
 */
public class E1720 extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        BinaryEditor be = new BinaryEditor();
        Scene scene = new Scene(be);
        stage.setScene(scene);
        stage.setTitle("Ex17.20");
        stage.show();
    }
    
    public static void main(String[] args) {
    launch(args);
  }
    
}
