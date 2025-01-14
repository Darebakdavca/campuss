package cz.vse.campuss.controllers;

import cz.vse.campuss.helpers.FXMLView;
import cz.vse.campuss.helpers.StageManager;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

import java.io.IOException;

import static cz.vse.campuss.helpers.NodeHelper.fadeIn;
import static cz.vse.campuss.helpers.NodeHelper.hideAfterSeconds;

public class PrihlasovaniController {

    @FXML
    public Text errorText;
    @FXML
    public AnchorPane rootPane;
    @FXML
    public RadioButton rButtonRole2;
    @FXML
    public RadioButton rButtonRole1;

    @FXML
    private void initialize() {
        ToggleGroup group = new ToggleGroup();
        rButtonRole1.setToggleGroup(group);
        rButtonRole2.setToggleGroup(group);
        fadeIn(rootPane);
    }

    @FXML
    public void prihlaseniKlik(MouseEvent mouseEvent) throws IOException {

        if (rButtonRole2.isSelected()) {
            StageManager.switchFXML(rootPane, FXMLView.PRIHLASOVANISTUDENT);
        } else if (rButtonRole1.isSelected()) {
            StageManager.switchFXML(rootPane, FXMLView.VOLBA_SATNY);
        } else {
            errorText.setVisible(true);
            hideAfterSeconds(errorText);
        }
    }
}
