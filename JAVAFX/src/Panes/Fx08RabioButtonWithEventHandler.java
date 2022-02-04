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
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Muhammad Shameer
 */
public class Fx08RabioButtonWithEventHandler extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Hello World");
        
        RadioButton oopRadioButton = new RadioButton("OOP");
        RadioButton dbRadioButton = new RadioButton("DB");
        RadioButton webRadioButton = new RadioButton("WEB");
        RadioButton androidRadioButton = new RadioButton("ANDROID");

        ToggleGroup subjectToggleGroup = new ToggleGroup();
        oopRadioButton.setToggleGroup(subjectToggleGroup);
        dbRadioButton.setToggleGroup(subjectToggleGroup);
        webRadioButton.setToggleGroup(subjectToggleGroup);
        androidRadioButton.setToggleGroup(subjectToggleGroup);
        
        FlowPane flowPane = new FlowPane();
        flowPane.getChildren().addAll(oopRadioButton,dbRadioButton,webRadioButton,androidRadioButton);
        
//        VBox vBox = new VBox();
//        vBox.getChildren().addAll(oopRadioButton,dbRadioButton,webRadioButton,androidRadioButton);
        Text text = new Text();
        Button button = new Button("Click here");
        flowPane.getChildren().addAll(button,text);
        
        button.setOnAction((ActionEvent event) -> {
            if (oopRadioButton.isSelected()) {
                text.setText("OOP Selected");
            }else if (dbRadioButton.isSelected()) {
                text.setText("DATA BASE selected");
            }else if (webRadioButton.isSelected()) {
                text.setText("WEB Selected");
            }else if (androidRadioButton.isSelected()) {
                text.setText("ANDROID Selected");
            }
        });
        
        primaryStage.setScene(new Scene(flowPane,300,276));
        primaryStage.show();
        
    }
    
    
}
