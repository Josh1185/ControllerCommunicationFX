package com.example.controllercommunicationfx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Scene1Controller {

    @FXML
    TextField nameTextfield;

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void login(ActionEvent event) throws IOException {

        // Stores the text within the textfield
        String username = nameTextfield.getText();

        // Configure the loader for scene2
        FXMLLoader loader = new FXMLLoader(getClass().getResource("scene2.fxml"));
        root = loader.load();

        // Get instance of scene2Controller
        Scene2Controller scene2Controller = loader.getController();
        // Use display name method
        scene2Controller.displayName(username);

        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
