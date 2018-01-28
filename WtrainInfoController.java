package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.controlsfx.control.textfield.TextFields;
import javafx.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class WtrainInfoController extends ParentTrainInfoController implements Initializable {
    @FXML private ImageView WtrainImage;
    @FXML private VBox mainPane;
    @FXML private ScrollPane sp;
    @FXML private TextField textFieldInput;
    @FXML private TextArea resultArea;
    private String[] possibleWords = new String[50];

    public void initialize(URL location, ResourceBundle resources){

        Train wTrain = new Train().getWTrain();
        Label wTrainInfo = new Label();
        wTrainInfo.setText(wTrain.displayDetailedRoot());
        sp.setContent(wTrainInfo);
        storeStops();
        TextFields.bindAutoCompletion(textFieldInput, possibleWords);
    }

    private void storeStops() {
        Train wTrain = new Train().getWTrain();
        for (int i = 0; i < wTrain.numberOfStops(); i++) possibleWords[i] = wTrain.get(i);
    }

    public void pressSearch(){
        Station station = new Station();
        Train wTrain = new Train().getWTrain();
        String input = textFieldInput.getText();
        int i;
        for ( i=0; i<wTrain.numberOfStops(); i++){
            if (wTrain.get(i).equals(input)){
                station = wTrain.getStation(i);
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

    public void pressedEnter(KeyEvent e){
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
