/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomizer;

import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author Kevin
 */
public class Randomizer extends Application {

    @Override
    public void start(Stage primaryStage) {
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.TOP_CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(0, 10, 0, 10));
        
        final TextField tf = new TextField();        
        
        final Button btn = new Button();
        btn.setText("Start");

        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                Updater updater = new Updater(tf);
                RandomNumberGenerator rng = new RandomNumberGenerator(updater);
                Thread t = new Thread(rng);
                t.start();
            }
        });
        
        
        
        grid.add(tf, 2, 4);
        grid.add(btn, 1, 4);
        
        Button btn1 = new Button();
        btn1.setText("Get number!");
        

        Scene scene = new Scene(grid, 300, 250);

        primaryStage.setTitle("Randomizer");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
