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
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
 
public class Fx14ComboBoxWithEvent extends Application {
 
    public static void main(String[] args) {
        launch(args);
    }
 
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World!");
 
        ComboBox comboBox = new ComboBox();
        comboBox.setEditable(true);
        comboBox.getItems().addAll("Lahore", "Islamabad", "Karachi", "Multan");
 
        Text text = new Text();
        FlowPane flowPane = new FlowPane(20, 20);
        flowPane.getChildren().addAll(comboBox, text);
 
        comboBox.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                text.setText("" + comboBox.getValue());
            }
        });
 
        primaryStage.setScene(new Scene(flowPane, 500, 250));
        primaryStage.show();
    }
}
