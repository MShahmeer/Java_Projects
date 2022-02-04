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
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
 
public class Fx15ListViewWithEvent extends Application {
    public static void main(String[] args) {
        launch(args);
    }
 
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World!");
 
        ListView listView = new ListView();
        listView.getItems().addAll("BSCS", "MSCS", "PhD CS");
        Button button = new Button("Read Selected Value");
         
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ObservableList selectedIndices =
                        listView.getSelectionModel().getSelectedIndices();
                for (Object o : selectedIndices) {
                    System.out.println("o = " + o + " (" + o.getClass() + ")");
                }
            }
        });
 
        VBox vBox = new VBox(listView, button);
 
        FlowPane flowPane = new FlowPane(20, 20);
        flowPane.getChildren().add(vBox);
 
        primaryStage.setScene(new Scene(flowPane, 500, 500));
        primaryStage.show();
    }
}
