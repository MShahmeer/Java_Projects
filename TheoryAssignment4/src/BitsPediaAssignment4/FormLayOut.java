/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BitsPediaAssignment4;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
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
public class FormLayOut extends Application {

    Button remove, update, updateInForm, add, reset;
    CheckBox syncWithDataBase;
    HBox toStoreFormButtons, toStoreActionButton;
    TextField[] arrayField;

    ArrayList<Person> person = new ArrayList<>();
    ArrayList<Button> buttonUpdate = new ArrayList<>();
    ArrayList<Button> buttonRemove = new ArrayList<>();
    ArrayList<TextField[]> textField = new ArrayList<>();
    //ArrayList<Button> formUpdateButton = new ArrayList<>();

    int rowNumber;
    int storeIndex;// To store Right form update row number

    Person storePersonObj;

    TextField name, gender, age, city;
    Person personObj;
    DbService dataBase = new DbService();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("User Form");

        //Tabel  LayOut
        GridPane tabelGridPane = new GridPane();
        tabelGridPane.setAlignment(Pos.CENTER);
        tabelGridPane.setHgap(20);
        tabelGridPane.setVgap(20);

        Text nameHeading = new Text("Name");
        Text genderHeading = new Text("Gender");
        Text ageHeading = new Text("Age");
        Text cityHeading = new Text("City");
        Text actionHeading = new Text("Action");

        tabelGridPane.add(nameHeading, 0, 0);
        tabelGridPane.add(genderHeading, 2, 0);
        tabelGridPane.add(ageHeading, 4, 0);
        tabelGridPane.add(cityHeading, 6, 0);
        tabelGridPane.add(actionHeading, 8, 0);

        //Form LayOut
        GridPane formGridPane = new GridPane();
        formGridPane.setAlignment(Pos.CENTER);
        formGridPane.setHgap(20);
        formGridPane.setVgap(20);

        Label nameLabel = new Label("Name");
        TextField toEnterName = new TextField();

        Label genderLabel = new Label("Gender");
        RadioButton male = new RadioButton("Male");
        RadioButton female = new RadioButton("female");

        ToggleGroup genderToggleGroup = new ToggleGroup();
        male.setToggleGroup(genderToggleGroup);
        female.setToggleGroup(genderToggleGroup);

        HBox toStoreGender = new HBox(20, genderLabel, male, female);

        Label ageLabel = new Label("Age");
        TextField toEnterAge = new TextField();

        Label cityLabel = new Label("City");
        ComboBox forCities = new ComboBox();
        forCities.getItems().addAll("Lahore", "Islamabad", "Karachi", "Peshawar", "Mianwali");

        reset = new Button("Reset");
        add = new Button("Add");
        updateInForm = new Button("Update");
        updateInForm.setDisable(true);

        toStoreFormButtons = new HBox(10, reset, add, updateInForm);

        syncWithDataBase = new CheckBox("Sync With Database");

        formGridPane.add(syncWithDataBase, 0, 0, 2, 1);
        formGridPane.add(nameLabel, 0, 1);
        formGridPane.add(toEnterName, 1, 1);

        formGridPane.add(toStoreGender, 0, 2, 2, 1);

        formGridPane.add(ageLabel, 0, 3);
        formGridPane.add(toEnterAge, 1, 3);

        formGridPane.add(cityLabel, 0, 4);
        formGridPane.add(forCities, 1, 4);

        formGridPane.add(toStoreFormButtons, 1, 5, 3, 1);

        add.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                updateInForm.setDisable(false);
                remove = new Button("Remove");
                update = new Button("Update");

                toStoreActionButton = new HBox(5, remove, update);
                buttonUpdate.add(update);//at even update
                buttonRemove.add(remove);//at odd remove

                rowNumber++;
                int toSaveRow = rowNumber;

                System.out.println("Update Button Size: " + buttonUpdate.size());
                String maleOrFemale = null;

                if (male.isSelected()) {
                    maleOrFemale = "Male";
                } else if (female.isSelected()) {
                    maleOrFemale = "Female";
                }

                personObj = new Person(toEnterName.getText(), maleOrFemale, (String) forCities.getValue(), Integer.parseInt(toEnterAge.getText()), toSaveRow);
                person.add(personObj);//adding in array list of persons

                storePersonObj = personObj;

                if (syncWithDataBase.isSelected()) {
                    dataBase.add(personObj);
                }

                name = new TextField(toEnterName.getText());
                name.setEditable(false);
                gender = new TextField(maleOrFemale);
                gender.setEditable(false);
                age = new TextField(toEnterAge.getText());
                age.setEditable(false);
                city = new TextField((String) forCities.getValue());
                city.setEditable(false);

                arrayField = new TextField[]{name, gender, age, city};
                textField.add(arrayField);

                for (int i = 0; i < buttonUpdate.size(); i++) {
                    String nameToSet = person.get(i).getName();
                    String genderToSet = person.get(i).getGender();
                    int ageToSet = person.get(i).getAge();
                    String cityToSet = person.get(i).getCity();
                    storeIndex = i;
                    buttonUpdate.get(i).setOnAction(new EventHandler<ActionEvent>() {

                        @Override
                        public void handle(ActionEvent event) {
                            add.setDisable(true);
                            toEnterName.setText(nameToSet);

                            if (genderToSet.equalsIgnoreCase("Male")) {
                                male.setSelected(true);
                            } else if (gender.getText().equalsIgnoreCase("Female")) {
                                female.setSelected(true);
                            }

                            toEnterAge.setText("" + ageToSet);
                            forCities.setValue(cityToSet);

                        }

                    });
                }

                tabelGridPane.add(name, 0, toSaveRow);
                tabelGridPane.add(gender, 2, toSaveRow);
                tabelGridPane.add(age, 4, toSaveRow);
                tabelGridPane.add(city, 6, toSaveRow);
                tabelGridPane.add(toStoreActionButton, 8, toSaveRow);
            }

        });

        updateInForm.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {

                if (syncWithDataBase.isSelected()) {
                    dataBase.update(storePersonObj);
                }

                int rowNumber = 0;
                for (Person persons : person) {
                    String ageStore = Integer.toString(persons.getAge());
                    String city = (String) forCities.getValue();
                    if (persons.getName().equalsIgnoreCase(name.getText()) && persons.getGender().equalsIgnoreCase(gender.getText())
                            && ageStore.equals(age.getText()) && persons.getCity().equals(city)) {
                        rowNumber = persons.getId();
                    }
                }

//                for (int i = 0; i < textField.size(); i++) {
//                    if (i == rowNumber) {
//                        for (int j = 0; j < textField.get(i).length; j++) {
//                            arrayField[j].setText(toEnterName.getText());
//                            arrayField[j].setText(toEntergender.getText());
//                            arrayField[j].setText(toEnterAge.getText());
//                            arrayField[j].setText(toEnterName.getText());
//                        }
//                    }
//
//                }

                System.out.println(tabelGridPane.getChildren().get(rowNumber));
                name.setText(toEnterName.getText());
                name.setEditable(false);
                String gen = null;
                if (male.isSelected()) {
                    gen = "Male";
                } else if (female.isSelected()) {
                    gen = "Female";
                }
                gender.setText(gen);
                gender.setEditable(false);
                age.setText("" + toEnterAge.getText());
                age.setEditable(false);

                city.setText((String) forCities.getValue());
                city.setEditable(false);

                System.out.println("Working");

                System.out.println(name.getText());
                System.out.println(gender.getText());
                System.out.println(age.getText());
                System.out.println(city.getText());

//             tabelGridPane.add(name, 0, storePersonObj.getId());
//                tabelGridPane.add(gender, 2, storePersonObj.getId());
//                tabelGridPane.add(age, 4, storePersonObj.getId());
//                tabelGridPane.add(city, 6, storePersonObj.getId());
//                tabelGridPane.add(toStoreActionButton, 8, storePersonObj.getId());
            }

        });

        BorderPane borderPane = new BorderPane();
        borderPane.setLeft(tabelGridPane);
        borderPane.setRight(formGridPane);

        Scene scene = new Scene(borderPane, 1500, 700);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

}
