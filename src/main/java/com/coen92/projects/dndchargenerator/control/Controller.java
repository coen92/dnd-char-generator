package com.coen92.projects.dndchargenerator.control;

import com.coen92.projects.dndchargenerator.implement.general.Profession;
import com.coen92.projects.dndchargenerator.implement.general.Race;
import com.coen92.projects.dndchargenerator.implement.general.Sex;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private ComboBox<String> charId;
    @FXML
    private TextField playerName;
    @FXML
    private TextField charName;
    @FXML
    private ComboBox<Race> charRace;
    @FXML
    private ComboBox<Sex> charSex;
    @FXML
    private ComboBox<Profession> charClass;
    @FXML
    private TabPane mainTabPane;
    @FXML
    private Tab tabChar;
    @FXML
    private Tab tabSkills;
    @FXML
    private Tab tabMagic;
    @FXML
    private Tab tabStory;
    @FXML
    private Tab tabPortrait;
    @FXML
    private Tab tabDatabase;
    @FXML
    private Button butSubmit;
    @FXML
    private Button butUpdate;
    @FXML
    private Button butDelete;
    @FXML
    private Button butReset;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    public void showCharacterTab() throws IOException{

        //FIGURE OUT HOW TO LOAD ANCHOR PANE INSIDE TAB CORRECTLY
        if(tabChar.isSelected()) {
            AnchorPane characterPane = FXMLLoader.load(getClass().getResource("/resources/character.fxml"));
            tabChar.setContent(characterPane);
        }
    }


}