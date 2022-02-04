/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FX_AND_DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Muhammad Shameer
 */
public class LayOutFinal extends Application {
    DbService database = new DbService();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Employee Data");

        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.TOP_LEFT);
        gridPane.setVgap(20);
        gridPane.setHgap(20);
        gridPane.add(new Text("Name"), 0, 0);
        gridPane.add(new Text("Gender"), 1, 0);
        gridPane.add(new Text("Age"), 2, 0);
        gridPane.add(new Text("City"), 3, 0);
        gridPane.add(new Text("Action"), 4, 0);

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(gridPane);

        Button update = new Button("Update");
        Button remove = new Button("Remove");
        HBox hBox = new HBox(10, update, remove);

       int row = 1, column = 0 ;
       database.setDataBaseConnection();
        while (database.getResultSet().next()) {
            gridPane.add(new Text(database.getResultSet().getString("name")), column, row);
            gridPane.add(new Text(database.getResultSet().getString("gender")), (column + 1), row);
            gridPane.add(new Text("" + database.getResultSet().getInt("age")), (column + 2), row);
            gridPane.add(new Text(database.getResultSet().getString("city")), (column + 3), row);
            gridPane.add(hBox, (column + 4), row);
            row++;
            column = 0;
        }

        update.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                LayOut2Final lof = new LayOut2Final();
                lof.getPrimaryStage().show();
            }
        });
        
        remove.setOnAction(new EventHandler<ActionEvent>(){

            @Override
            public void handle(ActionEvent event) {
               
            }
            
        });

        Scene scene = new Scene(borderPane, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

}
