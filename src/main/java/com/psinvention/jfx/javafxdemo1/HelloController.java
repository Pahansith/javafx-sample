package com.psinvention.jfx.javafxdemo1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private Button ammoButton;

    @FXML
    private Button helloButton;


    @FXML
    protected void onHelloButtonClick() {
        if (!ammoButton.isVisible()) {
            ammoButton.setVisible(true);
        }
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void onAmmoButtonClick() {
        welcomeText.setText("Budu Ammo!");
        ammoButton.setVisible(false);
    }
}