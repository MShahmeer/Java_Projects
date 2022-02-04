/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MEDICAL_STORE_MANAGEMENT_SYSTEM;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;

/**
 *
 * @author Muhammad Shameer
 */
public class LayOut extends Application {
    
    DataBaseAgain dataBase = new DataBaseAgain();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("HILAL SUPER STORE");

        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(20);
        gridPane.setVgap(20);

        Text headingText = new Text("Clinix Login");
        headingText.setFont(Font.font("Arial Rounded MT Bold", FontWeight.BOLD, FontPosture.ITALIC, 30));
        headingText.setFill(Color.RED);
        gridPane.add(headingText, 0, 0, 3, 1);

        Label password = new Label("Password");
        password.setFont(Font.font(STYLESHEET_MODENA, FontWeight.BOLD, 13));
        gridPane.add(password, 0, 1);
        
        PasswordField passwordField = new PasswordField();
        gridPane.add(passwordField, 1, 1);
        
        Button signInButton = new Button("Sign_In");
        gridPane.add(signInButton, 1, 2, 2, 1);

        Text t = new Text();//for first Login
        gridPane.add(t, 0, 3, 1, 2);
        t.setFont(Font.font("Lucida Calligraphy", FontWeight.BOLD, FontPosture.ITALIC, 10));

        Label persons = new Label("Users");
        persons.setFont(Font.font(STYLESHEET_MODENA, FontWeight.BOLD, 13));
        gridPane.add(persons, 0, 5);
        persons.setVisible(false);

        ComboBox users = new ComboBox();
        users.getItems().addAll("Shahmeer", "Bashara", "Kiran");
        users.setVisible(false);
        gridPane.add(users, 1, 5);

        Label userLabel = new Label("Password");
        userLabel.setFont(Font.font(STYLESHEET_MODENA, FontWeight.BOLD, 13));
        gridPane.add(userLabel, 0, 6);
        userLabel.setVisible(false);

        PasswordField userPassword = new PasswordField();
        gridPane.add(userPassword, 1, 6);
        userPassword.setVisible(false);

        Button userSignInButton = new Button("Sign_In");
        gridPane.add(userSignInButton, 1, 7);
        userSignInButton.setVisible(false);
        
        TextField t2 = new TextField();//for second login
        gridPane.add(t2, 0, 9,1,2);
        t2.setFont(Font.font("Lucida Calligraphy", FontWeight.BOLD, FontPosture.ITALIC, 10));
        t2.setVisible(false);

        Button searchMedicine = new Button("Medicine");
        Button searchCompanyMedicine = new Button("Company Medicines");
        Button deleteMedicine = new Button("Delete Medicine");
        Button deleteCompany = new Button("Delete Company");
        Button updatePrice = new Button("Update Price");
        Button addMedicine = new Button("Add Medicine");
        Button showStock = new Button("Stock");

        FlowPane flowPane = new FlowPane();
        flowPane.getChildren().addAll(showStock, searchMedicine, addMedicine, deleteMedicine, searchCompanyMedicine, deleteCompany, updatePrice);
        gridPane.add(flowPane, 0, 10, 3, 1);
        flowPane.setVisible(false);
        
        Label idLabel = new Label("ID");
        TextField id = new TextField();
        
        Label medicineLabel = new Label("Medicine Name");
        TextField medicineName = new TextField();
        
        Label priceLabel = new Label("Medicine Price");
        TextField price = new TextField();
        
        Label companyLabel = new Label("Company Name");
        TextField companyName = new TextField();
        
        Label emailLabel = new Label("Company Email");
        TextField email = new TextField();
        
        Label adressLabel = new Label("Company Adress");
        TextField adress = new TextField();
        
        Button enter = new Button("Enter");
        
        signInButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                //confirm password
                if (passwordField.getText().equals("Project")) {

                    t.setText("Login Successful");
                    persons.setVisible(true);
                    users.setVisible(true);

                    users.setOnAction(new EventHandler<ActionEvent>() {

                        @Override
                        public void handle(ActionEvent event) {
                            userLabel.setVisible(true);
                            userPassword.setVisible(true);
                            userSignInButton.setVisible(true);

                            userSignInButton.setOnAction(new EventHandler<ActionEvent>() {

                                @Override
                                public void handle(ActionEvent event) {
                                    if (users.getValue().equals("Shahmeer") && userPassword.getText().equals("shahmeer")
                                            || users.getValue().equals("Bashara") && userPassword.getText().equals("bashara")
                                            || users.getValue().equals("Kiran") && userPassword.getText().equals("kiran")) {

                                        flowPane.setVisible(true);
                                        
                                       showStock.setOnAction(new EventHandler<ActionEvent>(){

                                            @Override
                                            public void handle(ActionEvent event) {
                                                dataBase.showStock();
                                            }
                                           
                                       });
                                       
                                       searchMedicine.setOnAction(new EventHandler<ActionEvent>(){

                                            @Override
                                            public void handle(ActionEvent event) {
                                                
                                                gridPane.add(medicineLabel, 0, 11);
                                                gridPane.add(medicineName,1,11);
                                                
                                                gridPane.add(companyLabel, 0, 12);
                                                gridPane.add(companyName, 1, 12);
                                                
                                                gridPane.add(enter, 1, 13);
                                                
                                                enter.setOnAction(new EventHandler<ActionEvent>(){

                                                    @Override
                                                    public void handle(ActionEvent event) {
                                                        dataBase.searchMedicine(medicineName.getText(), companyName.getText());                                             }
                                                    
                                                });
                                                
                                                
                                            }
                                           
                                       });
                                       
                                       addMedicine.setOnAction(new EventHandler<ActionEvent>(){

                                            @Override
                                            public void handle(ActionEvent event) {
                                                gridPane.add(medicineLabel, 0, 11);
                                                gridPane.add(medicineName,1,11);
                                                
                                                gridPane.add(priceLabel,0,12);
                                                gridPane.add(price,1,12);
                                                
                                                gridPane.add(companyLabel, 0, 13);
                                                gridPane.add(companyName, 1, 13);
                                                
                                                gridPane.add(emailLabel, 0, 14);
                                                gridPane.add(email, 1, 14);
                                                
                                                gridPane.add(adressLabel,0,15);
                                                gridPane.add(adress,1,15);
                                                
                                                gridPane.add(enter,1,16);
                                                
                                                enter.setOnAction(new EventHandler<ActionEvent>(){

                                                    @Override
                                                    public void handle(ActionEvent event) {
                                                        dataBase.add(new Medicine(medicineName.getText(), Integer.parseInt(price.getText())), 
                                                                new Company(companyName.getText(), adress.getText(), email.getText()));
                                                    }
                                                    
                                                });
                                                
                                            }
                                           
                                       });
                                       
                                       deleteMedicine.setOnAction(new EventHandler<ActionEvent>(){

                                            @Override
                                            public void handle(ActionEvent event) {
                                                
                                                gridPane.add(idLabel, 0, 11);
                                                gridPane.add(id, 1, 11);
                                                
                                                gridPane.add(enter, 1, 12);
                                                
                                                enter.setOnAction(new EventHandler<ActionEvent>(){

                                                    @Override
                                                    public void handle(ActionEvent event) {
                                                        dataBase.deleteMedicine(Integer.parseInt(id.getText()));
                                                    }
                                                
                                            });
                                            }
                                           
                                       });
                                       
                                       searchCompanyMedicine.setOnAction(new EventHandler<ActionEvent>(){

                                            @Override
                                            public void handle(ActionEvent event) {
                                                
                                                gridPane.add(companyLabel,0,11);
                                                gridPane.add(companyName,1,11);
                                                
                                                gridPane.add(enter, 1, 12);
                                                
                                                enter.setOnAction(new EventHandler<ActionEvent>(){

                                                    @Override
                                                    public void handle(ActionEvent event) {
                                                        dataBase.searchCompanyMedicine(companyName.getText());
                                                    }
                                                    
                                                });
                                            }
                                           
                                       });
                                       
                                       deleteCompany.setOnAction(new EventHandler<ActionEvent>(){

                                            @Override
                                            public void handle(ActionEvent event) {
                                                gridPane.add(idLabel, 0, 11);
                                                gridPane.add(id, 1, 11);
                                                
                                                gridPane.add(companyLabel,0,12);
                                                gridPane.add(companyName,1,12);
                                                
                                                gridPane.add(enter, 1, 13);
                                                enter.setOnAction(new EventHandler<ActionEvent>(){

                                                    @Override
                                                    public void handle(ActionEvent event) {
                                                        dataBase.deleteCompany(Integer.parseInt(id.getText()), companyName.getText());
                                                    }
                                                    
                                                });
                                            }
                                           
                                       });
                                       
                                       updatePrice.setOnAction(new EventHandler<ActionEvent>(){

                                            @Override
                                            public void handle(ActionEvent event) {
                                                gridPane.add(idLabel, 0, 11);
                                                gridPane.add(id, 1, 11);
                                                
                                                gridPane.add(priceLabel, 0, 12);
                                                gridPane.add(price, 1, 12);
                                                
                                                gridPane.add(enter, 1, 13);
                                                
                                                enter.setOnAction(new EventHandler<ActionEvent>(){

                                                    @Override
                                                    public void handle(ActionEvent event) {
                                                        dataBase.updatePrice(Integer.parseInt(id.getText()), Double.parseDouble(price.getText()));
                                                    }
                                                    
                                                });
                                            }
                                           
                                       });
                                    }else{
                                        t2.setVisible(true);
                                        t2.setText("Login Failed");
                                    }
                                }

                            });

                        }

                    });

                } else {
                    t.setText("Login Failed");

                }
            }

//            private Object getPassword() {
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//            }

        });

        BorderPane borderPane = new BorderPane();
        borderPane.setLeft(gridPane);

        Scene scene = new Scene(borderPane, 1000, 700);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

}
