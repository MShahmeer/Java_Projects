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
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
 
 
public class Fx19FxFormAndMen2Events extends Application {
 
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Menu Items Learning ");
        BorderPane borderPane= new BorderPane();
        borderPane.setTop(menu());
        Scene scene = new Scene(borderPane, 500, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
 
    public static void main(String[] args) {
        launch(args);
    }
 
    public MenuBar menu() {
        MenuBar menuBar = new MenuBar();
        Menu fileMenu = new Menu(" File ");
        MenuItem newMenuItem = new MenuItem("New");
        MenuItem exitMenuItem = new MenuItem("Exit");
        fileMenu.getItems().addAll(newMenuItem, exitMenuItem);
 
        Menu viewMenu = new Menu(" View ");
        MenuItem fullScreenMenuItem = new MenuItem("Full Screen");
        viewMenu.getItems().addAll(fullScreenMenuItem);
 
        menuBar.getMenus().addAll(fileMenu, viewMenu);
                 
        fileMenu.setOnHiding(event -> System.out.println("onhiding called."));
        fileMenu.setOnHidden(event -> System.out.println("onhidden called."));
        fileMenu.setOnShowing(event -> System.out.println("onShowing called."));
        fileMenu.setOnShown(event-> System.out.println("OnShown called."));
 
        newMenuItem.setOnAction(event -> System.out.println("New menu item clicked.") );
 
        return menuBar;
    }
}
