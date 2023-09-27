package lk.ijse.Wizard.controller;

import com.jfoenix.controls.JFXBadge;
import com.jfoenix.controls.JFXButton;
import com.sun.javafx.menu.MenuItemBase;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Screen2Controller {

    public AnchorPane RootNode;
    public TextField txtField;
    public JFXButton nextButton;


    public void initialize() throws NullPointerException {
        // Initially, disable the "Next" button
        MenuItemBase nextBuuton = null;
        nextButton.setDisable(true);

        // Add a listener to the text field's textProperty
        txtField.textProperty().addListener((observable, oldValue, newValue) -> {
            // Enable the "Next" button if there is text in the text field
            nextButton.setDisable(newValue.isEmpty());
        });
    }

    public void btnOnBack(ActionEvent actionEvent) throws IOException {
         Parent RootNode = FXMLLoader.load(this.getClass().getResource("/view/main_form.fxml"));
        Scene scene = new Scene(RootNode);


        Stage secondstage = (Stage)this.RootNode.getScene().getWindow();



        secondstage.setScene(scene);
        secondstage.setTitle("Wizard Form");

    }

    public void btnOnNext(ActionEvent actionEvent)throws IOException {
        Parent RootNode = FXMLLoader.load(this.getClass().getResource("/view/screen03_form.fxml"));
        Scene scene = new Scene(RootNode);


        Stage secondstage = (Stage)this.RootNode.getScene().getWindow();



        secondstage.setScene(scene);
        secondstage.setTitle("Wizard Form");

    }

    public void btnOnCancel(ActionEvent actionEvent) {
        Platform.exit();

    }
}
