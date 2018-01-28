package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ParentTrainInfoController{


    public void createNavigateScene(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Navigate.fxml"));
        Scene scene = new Scene(root, 800, 450);
        Stage window = stage;
        window.setMaxHeight(450);
        window.setMaxWidth(600);
        window.setMinWidth(600);
        window.setMinHeight(450);
        window.setScene(scene);
    }

    public void createMainMenu(Stage stage)throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene scene = new Scene(root, 800, 450);
        Stage window = stage;
        window.setMaxWidth(800);
        window.setMaxHeight(450);
        window.setMinWidth(800);
        window.setMinHeight(450);
        window.setScene(scene);
    }
}
