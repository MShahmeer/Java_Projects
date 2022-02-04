/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Panes;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Muhammad Shameer
 */
public class Fx06LoginForm extends Application{
    public static void main(String[] args) {
        launch(args);
    }
    
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("User Sign-in Form");
        
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(20);
        grid.setVgap(20);
        
        Text formHeadingTest = new Text("Enter Login Information");
        formHeadingTest.setFont(Font.font("Calibri", FontWeight.BOLD, 20));
        grid.add(formHeadingTest, 0, 0, 2, 1);
        //grid.add(grid, columnIndex, rowIndex, colspan, rowspan);
        
        Label userName = new Label("User Name: ");
        grid.add(userName,0,1);
        
        TextField textField = new TextField();
        grid.add(textField,1,1);
        
        Label passwordLabel = new Label("Password: ");
        grid.add(passwordLabel,0,2);
        
        PasswordField password = new PasswordField();
        grid.add(password,1,2);
        
        Button signInButton = new Button("Sign in");
        
        HBox hBox = new HBox();
        hBox.setAlignment(Pos.TOP_RIGHT);
        hBox.getChildren().add(signInButton);
        grid.add(hBox, 0, 3, 2, 1);
        
        //grid.setGridLinesVisible(true);
        
        Scene scene = new Scene(grid,500,300);
        primaryStage.setScene(scene);
        primaryStage.show();
        
}
}
