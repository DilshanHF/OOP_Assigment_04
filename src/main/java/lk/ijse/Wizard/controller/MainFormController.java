package lk.ijse.Wizard.controller;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainFormController {

    public AnchorPane rootNode;

    public void btnOnNext(ActionEvent actionEvent) throws IOException {

        Parent rootNode = FXMLLoader.load(this.getClass().getResource("/view/screen02_form.fxml"));
        Scene scene = new Scene(rootNode);


        Stage secondstage = (Stage)this.rootNode.getScene().getWindow();



        secondstage.setScene(scene);
        secondstage.setTitle("Screen 02 Form");

    }

    public void btnOnCancel(ActionEvent actionEvent) throws IOException {
        Platform.exit();
    }
}
