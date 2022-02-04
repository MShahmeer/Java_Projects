/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FX_AND_DB;

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
public class LayOut extends Application {

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

        Button update = new Button("Update");
        Button remove = new Button("Remove");

        HBox actionButtons = new HBox(10, update, remove);
        gridPane.add(actionButtons, 4, 1);

        update.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                LayOut2 lo = new LayOut2();
                String gender = null;
                if (lo.forGenderFemale.isSelected()) {
                    gender = "Female";
                }else if (lo.forGenderMale.isSelected()) {
                    gender = "Male";
                }
                //LayOut2.main(null);
                
                try {
                    lo.start(lo.getPrimaryStage());
                    gridPane.add(new Text(""+lo.forName), 0, 1);
                    gridPane.add(new Text(""+gender),1,1);
                    gridPane.add(new Text(""+lo.forAge),2,1);
                    gridPane.add(new Text(""+lo.forCity),3,1);

                } catch (Exception ex) {
                    Logger.getLogger(LayOut.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        });
        
        BorderPane borderPane = new BorderPane();
        borderPane.setTop(gridPane);
        
        Scene scene = new Scene(borderPane, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

}
