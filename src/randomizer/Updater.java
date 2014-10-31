/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomizer;

import javafx.application.Platform;
import javafx.scene.control.TextField;

/**
 *
 * @author Kevin
 */
public class Updater {
    public TextField tf;
    
    public Updater(TextField tf) {
        this.tf = tf;
    }
    
    public void update(final int number) {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                tf.setText(Integer.toString(number));
            }
        });

    }
}
