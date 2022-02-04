/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FX_AND_DB;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Muhammad Shameer
 */
public class LayOut2 extends Application {

    private Stage primaryStage;
    TextField forName;
    TextField forAge;
    RadioButton forGenderMale;
    RadioButton forGenderFemale;
    ComboBox forCity;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Add/Update Person Form");

        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setVgap(20);
        gridPane.setHgap(20);

        Text name = new Text("Name");
        Text gender = new Text("Gender");
        Text age = new Text("Age");
        Text city = new Text("City");

        forName = new TextField();
        forAge = new TextField();

        Button reset = new Button("RESET");
        Button update = new Button("UPDATE");
        Button add = new Button("ADD");

        forGenderMale = new RadioButton("Male");
        forGenderMale.setSelected(false);
        forGenderFemale = new RadioButton("Female");
        forGenderFemale.setSelected(false);

        ToggleGroup genderToggleGroup = new ToggleGroup();
        forGenderMale.setToggleGroup(genderToggleGroup);
        forGenderFemale.setToggleGroup(genderToggleGroup);

        forCity = new ComboBox();
        forCity.setEditable(true);
        forCity.getItems().addAll("Lahore", "Islamabad", "Karachi", "Peshawar");

        HBox forGender = new HBox(10, forGenderMale, forGenderFemale);
        HBox forButtons = new HBox(10, update, add);

        gridPane.add(name, 0, 0);
        gridPane.add(forName, 1, 0);

        gridPane.add(gender, 0, 1);
        gridPane.add(forGender, 1, 1);

        gridPane.add(age, 0, 2);
        gridPane.add(forAge, 1, 2);

        gridPane.add(city, 0, 3);
        gridPane.add(forCity, 1, 3);

        gridPane.add(reset, 0, 4);
        gridPane.add(forButtons, 1, 4);

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(gridPane);

        CheckBox syncWithDataBase = new CheckBox("Sync With DataBase");
        borderPane.setTop(syncWithDataBase);

        Scene scene = new Scene(borderPane, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    private void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    public Stage getPrimaryStage() {
        return this.primaryStage;
    }

}
