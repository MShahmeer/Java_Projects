/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Panes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author Muhammad Shameer
 */
public class Fx04HBox extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("HBox Test");
        
        Button btn = new Button("Button 1");
        Button btn2 = new Button("Button 2");
        
        HBox hBox = new HBox(10,btn,btn2);
        
        Scene scene = new Scene(hBox,200,100);
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
    }

    
    
    
    
    
}
