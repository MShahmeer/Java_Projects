/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Panes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Muhammad Shameer
 */
public class Fx05VBox extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("VBox Test");

        Button btn = new Button("Button 1");
        Button btn2 = new Button("Button 2");

        VBox vBox = new VBox(10, btn, btn2);
        Scene scene = new Scene(vBox, 200, 100);

        primaryStage.setScene(scene);
        primaryStage.show();

    }

}
