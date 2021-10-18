
package pkg4.pkg3.pkg4.mouseevent;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Iván Zambrana Naranjo
 */
public class MouseEvent extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        //Tittle
        primaryStage.setTitle("MouseEvent");
        
        //Text
        Text text = new Text("Programing is fun");
        text.setX(100);
        text.setY(100);
        
        //MouseEvent
        text.setOnMouseDragged( e ->{
        
            text.setX(e.getX());
            text.setY(e.getY());
        });
        
        //Pane
        Pane root = new Pane();
        
        root.getChildren().add(text);     
        Scene scene = new Scene(root, 300, 250);
        
        
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
