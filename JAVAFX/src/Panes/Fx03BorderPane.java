/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Panes;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Fx03BorderPane extends Application {
 
    public static void main(String[] args) {
        launch(args);
    }
    
    public void start(Stage primaryStage){
        primaryStage.setTitle("Border Line Demo");
        
        BorderPane borderPane = new BorderPane();
        
        borderPane.setTop(new Label("Top"));
        borderPane.setLeft(new Label("Left"));
        borderPane.setRight(new Label("Right"));
        borderPane.setBottom(new Label("Bottom"));
        borderPane.setCenter(new Label("Center"));
        
        Scene scene = new Scene(borderPane,350,300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
