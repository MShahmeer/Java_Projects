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
import javafx.scene.control.ListView;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
 
public class Fx15ListView extends Application {
 
    public static void main(String[] args) {
        launch(args);
    }
 
    @Override
    public void start(Stage primaryStage) {
 
        primaryStage.setTitle("Hello World!");
 
        ListView listView = new ListView();
        listView.getItems().addAll("BSCS", "MSCS", "PhD. CS");
 
        FlowPane flowPane = new FlowPane(20, 20);
        flowPane.getChildren().add(listView);
 
        primaryStage.setScene(new Scene(flowPane, 500, 250));
        primaryStage.show();
    }
}
