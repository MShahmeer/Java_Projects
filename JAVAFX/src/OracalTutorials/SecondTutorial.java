/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OracalTutorials;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Muhammad Shameer
 */
public class SecondTutorial extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Form");

        Text welcome = new Text("Welcome");
        welcome.setFill(Color.MAROON);
        welcome.setFont(Font.font("Tahoma", FontWeight.BOLD, FontPosture.ITALIC, 15));

        Label userName = new Label("User Name");
        Label enterPassword = new Label("Enter Name");

        TextField forUserName = new TextField();
        PasswordField forPassword = new PasswordField();

        Button signIn = new Button("Sign In");
        Text actionText = new Text();

        signIn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {

                actionText.setText("SignIn Button Pressed");
                actionText.setFill(Color.NAVY);

                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });

        HBox hBox = new HBox();
        hBox.setAlignment(Pos.BOTTOM_RIGHT);
        hBox.getChildren().add(signIn);

        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);

        gridPane.setHgap(10);
        gridPane.setVgap(10);

        gridPane.add(welcome, 1, 0, 2, 1);
        gridPane.add(userName, 0, 1);
        gridPane.add(forUserName, 1, 1);
        gridPane.add(enterPassword, 0, 2);
        gridPane.add(forPassword, 1, 2);
        gridPane.add(hBox, 1, 4);
        gridPane.add(actionText, 1, 5);

        Scene scene = new Scene(gridPane, 300, 275);
       
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
