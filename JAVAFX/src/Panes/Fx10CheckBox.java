/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Panes;

/**
 *
 * @author Muhammad Shameer
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
 
// Using CheckBox
// Read and write CheckBox property 'selected'
 
public class Fx10CheckBox extends Application {
 
    public static void main(String[] args) {
        launch(args);
    }
 
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World!");
 
        CheckBox checkBox = new CheckBox("OOP");
 
        Text text = new Text();
 
        if (checkBox.isSelected())
            text.setText("SELECTED");
        else
            text.setText("NOT SELECTED");
 
        FlowPane flowPane = new FlowPane(20, 20);
        flowPane.getChildren().add(checkBox);
        flowPane.getChildren().add(text);
 
        primaryStage.setScene(new Scene(flowPane, 500, 250));
        primaryStage.show();
    }
}
