package com.accenture.practice.secondProject.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ManagerWarehouseMenu {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button PostavkaNaSklad;

    @FXML
    private Button OtpravkaVMagazin;

    @FXML
    private Button TovarNaSklade;

    @FXML
    private Button Chat;

    @FXML
    private Button Exit;

    @FXML
    void initialize() {
        assert PostavkaNaSklad != null : "fx:id=\"PostavkaNaSklad\" was not injected: check your FXML file 'ManagerWarehouseMenu.fxml'.";
        assert OtpravkaVMagazin != null : "fx:id=\"OtpravkaVMagazin\" was not injected: check your FXML file 'ManagerWarehouseMenu.fxml'.";
        assert TovarNaSklade != null : "fx:id=\"TovarNaSklade\" was not injected: check your FXML file 'ManagerWarehouseMenu.fxml'.";
        assert Chat != null : "fx:id=\"Chat\" was not injected: check your FXML file 'ManagerWarehouseMenu.fxml'.";
        assert Exit != null : "fx:id=\"Exit\" was not injected: check your FXML file 'ManagerWarehouseMenu.fxml'.";

    }
}
