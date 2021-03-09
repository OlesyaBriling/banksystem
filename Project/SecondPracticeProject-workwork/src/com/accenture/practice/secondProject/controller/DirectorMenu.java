package com.accenture.practice.secondProject.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class DirectorMenu {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button Suppliers;

    @FXML
    private Button Carriers;

    @FXML
    private Button Roles;

    @FXML
    private Button Chat;

    @FXML
    private Button Statistics;

    @FXML
    private Button Exit;

    @FXML
    void initialize() {
        assert Suppliers != null : "fx:id=\"Suppliers\" was not injected: check your FXML file 'DirectorMenu.fxml'.";
        assert Carriers != null : "fx:id=\"Carriers\" was not injected: check your FXML file 'DirectorMenu.fxml'.";
        assert Roles != null : "fx:id=\"Roles\" was not injected: check your FXML file 'DirectorMenu.fxml'.";
        assert Chat != null : "fx:id=\"Chat\" was not injected: check your FXML file 'DirectorMenu.fxml'.";
        assert Statistics != null : "fx:id=\"Statistics\" was not injected: check your FXML file 'DirectorMenu.fxml'.";
        assert Exit != null : "fx:id=\"Exit\" was not injected: check your FXML file 'DirectorMenu.fxml'.";

    }
}
