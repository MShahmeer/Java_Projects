/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Panes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Muhammad Shameer
 */
public class Fx06RadioButtonAndFlowPane extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Hellow World");
        
        RadioButton radioButton = new RadioButton("OOP");
        radioButton.setSelected(false);
        
        Text text = new Text();
        if (radioButton.isSelected()) {
            text.setText("Selected");
        }
        else
            text.setText("Not Selected");
        
        
        FlowPane flowPane = new FlowPane(20,20);
        flowPane.getChildren().addAll(radioButton,text);
        
        primaryStage.setScene(new Scene(flowPane,500,250));
        primaryStage.show();
        
        
    }
    
    
    
}
