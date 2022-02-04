/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OracalTutorials;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Muhammad Shameer
 */
public class FirstTutorial extends Application {
    public static void main(String[] args){
     launch(args);   
    }
    
    public void start(Stage primaryStage){
        primaryStage.setTitle("LoginForm");
        
        Button signIn = new Button("Sign In");
        
        signIn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hye User");
                throw new UnsupportedOperationException("Not supported yet."); 
            }
        });
        
        StackPane stackPane = new StackPane();
        stackPane.getChildren().add(signIn);
        
        Scene scene = new Scene(stackPane ,200, 300);
        
        primaryStage.setScene(scene);
        primaryStage.show();
        
                
    }
}
