/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Panes;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Muhammad Shameer
 */
public class Fx01StackPane extends Application {
    
    public static void main(String[] args) {
        launch(args);
    }
    
    public void start(Stage primaryStage){
        primaryStage.setTitle("Hello World");
        
        Button btn = new Button();
        btn.setText("Say Hello World");
        
        Button btn2 = new Button("CUI");
        
        StackPane stackPane = new StackPane();
        stackPane.getChildren().addAll(btn,btn2);
        
        Scene scene = new Scene(stackPane,500,300);
        primaryStage.setScene(scene);
        
        primaryStage.show();
    }
}
