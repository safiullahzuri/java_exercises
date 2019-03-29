
import javafx.application.Application;
import javafx.scene.Scene;
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
public class Ex1721 extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        Ex20BorderPane be = new Ex20BorderPane();
        Scene scene = new Scene(be);
        stage.setScene(scene);
        stage.setTitle("Ex17.21");
        stage.show();
    }
    
    public static void main(String[] args){
        launch(args);
    }
    
}
