package lk.ijse.Wizard.controller;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class LastFormController {

    public AnchorPane Root;

    public void btnOnBack(ActionEvent actionEvent) throws IOException {

        Parent rootNode = FXMLLoader.load(this.getClass().getResource("/view/screen03_form.fxml"));
        Scene scene = new Scene(rootNode);


        Stage secondstage = (Stage)this.Root.getScene().getWindow();



        secondstage.setScene(scene);
        secondstage.setTitle("Wizard Form");
    }

    public void btnOnFinish(ActionEvent actionEvent) throws IOException {
        Platform.exit();
    }
}
