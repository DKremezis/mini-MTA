package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.controlsfx.control.textfield.TextFields;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class NtrainInfoController extends ParentTrainInfoController implements Initializable {
    @FXML private ScrollPane sp;
    @FXML private TextField textFieldInput;
    @FXML private TextArea resultArea;
    @FXML private Button searchBttn;
    @FXML private VBox mainPane;
    private String[] possibleWords = new String[50];

    public void initialize(URL location, ResourceBundle resources){

        Train nTrain = new Train().getNTrain();
        Label nTrainInfo = new Label();
        nTrainInfo.setText(nTrain.displayDetailedRoot());
        sp.setContent(nTrainInfo);
        storeStops();
        TextFields.bindAutoCompletion(textFieldInput, possibleWords);
    }

    private void storeStops() {
        Train nTrain = new Train().getNTrain();
        for (int i = 0; i < nTrain.numberOfStops(); i++) possibleWords[i] = nTrain.get(i);
    }

    public void pressSearch(){
        Station station = new Station();
        Train nTrain = new Train().getNTrain();
        String input = textFieldInput.getText();
        int i;
        for ( i=0; i<nTrain.numberOfStops(); i++){
            if (nTrain.get(i).equals(input)){
                station = nTrain.getStation(i);
                break;
            }
        }
        resultArea.setText("Stop #"+ (i+1) +"\n" + station.showInfo());
    }


    public void pressBack(ActionEvent event)throws IOException{
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("trainInfo.fxml"));
        Scene scene = new Scene(root, 800, 450);
        window.setScene(scene);
    }

    public void pressedEnter(KeyEvent e) {
        if (e.getCode() == KeyCode.ENTER)  pressSearch();
    }

    public void close(){
        Stage stage = (Stage) mainPane.getScene().getWindow();
        stage.close();
    }

    public void PressCreateNavigateScene() throws IOException{
        Stage window = (Stage) mainPane.getScene().getWindow();
        createNavigateScene(window);

    }

    public void PressCreateMainMenu()throws IOException {
        Stage window = (Stage) mainPane.getScene().getWindow();
        createMainMenu(window);
    }

}
