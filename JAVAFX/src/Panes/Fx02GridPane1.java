/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Panes;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author Muhammad Shameer
 */
public class Fx02GridPane1 extends Application {
    public void start(Stage primaryStage){
        primaryStage.setTitle("Login form");
        
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        //grid.setAlignment(Pos.);
        grid.setHgap(10);
        grid.setVgap(20);
        
        Label userNameLabel = new Label();
        userNameLabel.setText("User Name: ");
        grid.add(userNameLabel,0,0);
        
        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 0);
        
        grid.setGridLinesVisible(false);
        
        Scene scene = new Scene(grid,300,200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
