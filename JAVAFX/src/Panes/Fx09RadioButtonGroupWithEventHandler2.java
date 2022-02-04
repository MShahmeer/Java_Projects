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
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
 
// we get get selected RadioButton from ToggleGroup
// It simplifies the event handling code.
 
public class Fx09RadioButtonGroupWithEventHandler2 extends Application {
 
    RadioButton radioButton1, radioButton2, radioButton3, radioButton4;
 
    public static void main(String[] args) {
        launch(args);
    }
 
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Radio Buttons!");
 
        radioButton1 = new RadioButton("OOP");
        radioButton2 = new RadioButton("DB");
        radioButton3 = new RadioButton("Web");
        radioButton4 = new RadioButton("Android");
         
        ToggleGroup radioGroup = new ToggleGroup();
        radioButton1.setToggleGroup(radioGroup);
        radioButton2.setToggleGroup(radioGroup);
        radioButton3.setToggleGroup(radioGroup);
        radioButton4.setToggleGroup(radioGroup);
 
        FlowPane flowPane = new FlowPane(20, 20);
        flowPane.getChildren().addAll(radioButton1, radioButton2, radioButton3, radioButton4);
 
        Text text = new Text();
        Button btn = new Button(" Click Here ");
        flowPane.getChildren().addAll(btn, text);
 
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                RadioButton activeButton = (RadioButton)radioGroup.getSelectedToggle();
                if (activeButton != null)
                    text.setText(activeButton.getText());
            }
        });
 
        primaryStage.setScene(new Scene(flowPane, 500, 250));
        primaryStage.show();
    }
}
