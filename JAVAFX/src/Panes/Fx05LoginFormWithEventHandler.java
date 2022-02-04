/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Panes;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Muhammad Shameer
 */
public class Fx05LoginFormWithEventHandler extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    Text actionTargetText = new Text();

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Sign-In form");
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(20);
        gridPane.setVgap(20);
        
        Text formHeadingText = new Text("Enter Login Information");//It Is the Main Heading In the scene
        formHeadingText.setFont(Font.font("Roboto", FontWeight.NORMAL, 20));
        gridPane.add(formHeadingText,0,0,2,1);
        
        Label userNameLabel = new Label("User Name");//Now take a TextField where User Name can be Entered
        gridPane.add(userNameLabel,0,1);
        
        TextField textField = new TextField();
        gridPane.add(textField,1,1);
        
        Label passwordLabel = new Label("Password");
        gridPane.add(passwordLabel,0,2);
        
        PasswordField passwordField = new PasswordField();
        gridPane.add(passwordField,1,2);
        
        Button signInButton = new Button("Sign-In");
        HBox hBox = new HBox();
        hBox.setAlignment(Pos.TOP_RIGHT);
        hBox.getChildren().add(signInButton);
        gridPane.add(hBox,0,3,2,1);
        
        gridPane.add(actionTargetText,1,5);
        
        signInButton.setOnAction(new EventHandler<ActionEvent>(){

            @Override
            public void handle(ActionEvent event) {
                actionTargetText.setFill(Color.FIREBRICK);
                actionTargetText.setText("Sign-In Button Pressed");
            }
        });
        
        
        Scene scene =  new Scene(gridPane,300,275);
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
    
    
}
