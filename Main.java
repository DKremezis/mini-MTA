package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("MTA NEW YORK");
        Scene scene = new Scene(root, 800, 450);
        primaryStage.setScene(scene);
        primaryStage.setMaxHeight(450);
        primaryStage.setMaxWidth(800);
        primaryStage.show();
    }




}