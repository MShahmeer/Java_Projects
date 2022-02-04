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
import javafx.scene.control.ComboBox;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
 
public class Fx13ComboBox extends Application {
 
    public static void main(String[] args) {
        launch(args);
    }
 
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World!");
 
        ComboBox comboBox = new ComboBox();
        comboBox.setEditable(true);
        comboBox.getItems().addAll("Lahore", "Islamabad", "Karachi", "Multan");
        FlowPane flowPane = new FlowPane(20, 20);
        flowPane.getChildren().add(comboBox);
 
        primaryStage.setScene(new Scene(flowPane, 500, 250));
        primaryStage.show();
    }
}
