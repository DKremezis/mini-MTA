package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class TrainInfoController implements Initializable {
    @FXML private ChoiceBox<String> choices;
    @FXML private BorderPane pane;

    private String selectedTrain;
    protected Train train = new Train();
    private Image image;


    public void initialize(URL location, ResourceBundle resources) {
        choices.getItems().addAll("N-Train", "Q-Train", "W-Train", "R-Train", "7-Local-Train", "7-Express-Train","1-Train","2-Train");
        choices.setValue("N-Train");
    }

    public void buttonForTrain(ActionEvent event)throws IOException{
        selectedTrain = choices.getValue();
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setMaxHeight(460);
        window.setMaxWidth(805);
        Parent root;
        if (selectedTrain.equals("N-Train"))root = FXMLLoader.load(getClass().getResource("NtrainInfo.fxml"));
        else if (selectedTrain.equals("R-Train")) root = FXMLLoader.load(getClass().getResource("RtrainInfo.fxml"));
        else if (selectedTrain.equals("Q-Train")) root = FXMLLoader.load(getClass().getResource("QtrainInfo.fxml"));
        else if (selectedTrain.equals("W-Train")) root = FXMLLoader.load(getClass().getResource("WtrainInfo.fxml"));
        else if(selectedTrain.equals("1-Train")) root = FXMLLoader.load(getClass().getResource("1trainInfo.fxml"));
        else if (selectedTrain.equals("2-Train")) root = FXMLLoader.load(getClass().getResource("2trainInfo.fxml"));
        else if (selectedTrain.equals("7-Express-Train")) root = FXMLLoader.load(getClass().getResource("7ExpressTrainInfo.fxml"));
        else  root = FXMLLoader.load(getClass().getResource("7LocalTrainInfo.fxml"));

        Scene scene = new Scene(root, 800, 450);
        window.setScene(scene);
    }

    public String getSelectedTrain(){
        return selectedTrain;
    }

    public void pressBack(ActionEvent event)throws IOException{
        Stage window = (Stage) pane.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene scene = new Scene(root, 800, 450);
        window.setScene(scene);
    }

}
