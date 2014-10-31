/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomizer;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * Randomizer is a very simple GUI class to allow the user to 
 * generate random numbers.
 * 
 * HINT: Try to do things by what you already know; but if you get stuck
 * see Brother Burton's example VERY similar to this exercise!  (Yes we know
 * it's similar, but it covers the topic)
 * 
 * Brownie Point Opportunity: If you're an over achiever and like to know why
 * stuff happens, consider this, why can you modify the same GUI object in 
 * two separate classes?  Think back to C++ with pointers.
 * 
 * DISCLAIMER: Brownie Points have a null value :(
 * 
 * @author Kevin
 */
public class Randomizer extends Application {

    @Override
    public void start(Stage primaryStage) {
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.TOP_CENTER);
        grid.setHgap(25);
        grid.setVgap(25);
        grid.setPadding(new Insets(0, 10, 0, 10));
        
        final TextField tf = new TextField();        
        
        final Button btn = new Button();
        btn.setText("Start");

        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                //We'll make this easy on you and give you the bones
            }
        });
        
        grid.add(tf, 2, 4);
        grid.add(btn, 1, 4);
       
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
