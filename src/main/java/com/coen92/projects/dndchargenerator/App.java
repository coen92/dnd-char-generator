package com.coen92.projects.dndchargenerator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Simple application to create basics for Character
 * in Dungeons & Dragons Roleplay game
 * store it in local DataBase in changeable records
 *
 */
public class App extends Application
{
    @Override
    public void start(Stage primaryStage) throws Exception {
            Parent root = FXMLLoader.load(getClass().getResource("/main.fxml"));
            primaryStage.setTitle("D&D ed. 3.5 Character Generator");
            primaryStage.setScene(new Scene(root, 700, 475));
            primaryStage.show();
    }

    public static void main( String[] args ) {
        launch(args);
    }
}
