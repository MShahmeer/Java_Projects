/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Panes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author Muhammad Shameer
 */
public class Fx07RadioButtonGroup extends Application {

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

        HBox hBox = new HBox();
        hBox.getChildren().addAll(oopRadioButton, dbRadioButton, webRadioButton, androidRadioButton);

        primaryStage.setScene(new Scene(hBox, 500, 250));
        primaryStage.show();

    }

}
