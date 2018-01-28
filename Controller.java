package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML private ListView<String> lview;
    @FXML private BorderPane mainPane;
    private String choice;
    private Stage initialWindow;


    @Override
    public void initialize(URL location, ResourceBundle resources){
        lview.getItems().addAll("Train Info", "Station Info", "Navigate", "Credits");
        lview.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
    }

    public void doubleClick(MouseEvent e)throws IOException{
        if (e.getClickCount() == 2){
            initialWindow = (Stage) mainPane.getScene().getWindow();
            choice = lview.getSelectionModel().getSelectedItem();

            if (choice.equals("Train Info")) createTrainInfoScene(initialWindow);
            if (choice.equals("Navigate")) createNavigateScene(initialWindow);
            if (choice.equals("Station Info")) createStationInfoScene(initialWindow);

        }
    }

    public void pressOk(ActionEvent event)throws IOException{
        initialWindow = (Stage) ((Node) event.getSource()).getScene().getWindow();
        choice = lview.getSelectionModel().getSelectedItem();

        if (choice.equals("Train Info")) createTrainInfoScene(initialWindow);
        if (choice.equals("Navigate")) createNavigateScene(initialWindow);
        if (choice.equals("Station Info")) createStationInfoScene(initialWindow);
    }

    public void createTrainInfoScene()throws IOException{
        initialWindow = (Stage) mainPane.getScene().getWindow();
        createTrainInfoScene(initialWindow);
    }

    private void createTrainInfoScene(Stage window)throws IOException{
            Parent root = FXMLLoader.load(getClass().getResource("trainInfo.fxml"));
            Scene scene = new Scene(root, 800, 450);
            window.setScene(scene);
    }

    private void createStationInfoScene(Stage window)throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("stationInfo.fxml"));
        Scene scene = new Scene(root, 800, 450);
        window.setScene(scene);
    }

    public void createNavigateInfoScene()throws IOException{
        initialWindow = (Stage) mainPane.getScene().getWindow();
        createNavigateScene(initialWindow);
    }

    private void createNavigateScene(Stage window) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("Navigate.fxml"));
        Scene scene = new Scene(root, 800, 450);
        window.setMaxHeight(450);
        window.setMaxWidth(600);
        window.setMinWidth(600);
        window.setMinHeight(450);
        window.setScene(scene);
    }

    public void closeWindow(){
        initialWindow = (Stage) mainPane.getScene().getWindow();
        initialWindow.close();
    }


}
