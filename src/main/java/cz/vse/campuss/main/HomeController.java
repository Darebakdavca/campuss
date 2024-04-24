package cz.vse.campuss.main;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HomeController extends BaseController {

    public HBox volbyCinnosti;
    @FXML
    private Text uvitani;


    @FXML
    private void initialize() {
        String username = DatabaseHelper.fetchUserNameSatnarka(1);
        uvitani.setText("Vítáme uživatele " + username + "!");
        fadeIn(volbyCinnosti);
    }

    @FXML
    public void historieKlik(MouseEvent mouseEvent) {
        // Get the stage of the current scene
        Stage stage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();

        try {
            // Load the historie.fxml file
            showScene(stage, "file:src/main/resources/cz/vse/campuss/main/fxml/historie.fxml");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void uschovatKlik(MouseEvent mouseEvent) {
        Stage stage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();

        try {
            showScene(stage, "file:src/main/resources/cz/vse/campuss/main/fxml/uschovat1.fxml");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void vyzvednoutKlik(MouseEvent mouseEvent) {
        Stage stage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
        try {
            showScene(stage, "file:src/main/resources/cz/vse/campuss/main/fxml/vyzvednout.fxml");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}