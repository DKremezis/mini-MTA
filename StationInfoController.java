package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import org.controlsfx.control.textfield.TextFields;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class StationInfoController implements Initializable {
    @FXML private ChoiceBox<String> choices;
    @FXML private BorderPane pane;
    @FXML private TextField tf;
    @FXML private TextArea ta;
    @FXML private Button otherB;

    private String selectedStation;
    protected Train train = new Train();
    private Image image;
    private AllTheStations all = new AllTheStations();


    public void initialize(URL location, ResourceBundle resources) {
        reset();
    }

    private void storeQstations(){
        choices.getItems().remove(0,choices.getItems().size());
        QueensStation st = new QueensStation();
        String[] stations = st.getAllQStations();
        choices.getItems().add("Select Station");
        for (int i=0; i<stations.length; i++){
            choices.getItems().add(stations[i]);
        }
        choices.setValue("Select Station");
        TextFields.bindAutoCompletion(tf, stations);
        choices.getSelectionModel().selectedItemProperty().addListener((v, oldValue, newValue) -> selectFromChoices() );
    }

    private void storeMstations(){
        choices.getItems().remove(0,choices.getItems().size());
        ManhattanStation st = new ManhattanStation();
        String[] stations = st.getAllMStations();
        choices.getItems().add("Select Station");
        for (int i=0; i<stations.length; i++){
            choices.getItems().add(stations[i]);
        }
        choices.setValue("Select Station");
        TextFields.bindAutoCompletion(tf, stations);
        choices.getSelectionModel().selectedItemProperty().addListener((v, oldValue, newValue) -> selectFromChoices() );
    }

    private void storeBLNstations(){
        choices.getItems().remove(0,choices.getItems().size());
        BrooklynStation st = new BrooklynStation();
        String[] stations = st.getAllBStations();
        choices.getItems().add("Select Station");
        for (int i=0; i<stations.length; i++){
            choices.getItems().add(stations[i]);
        }
        choices.setValue("Select Station");
        TextFields.bindAutoCompletion(tf, stations);
        choices.getSelectionModel().selectedItemProperty().addListener((v, oldValue, newValue) -> selectFromChoices() );
    }

    private void storeBRXstations(){
        choices.getItems().remove(0,choices.getItems().size());
        BronxStation st = new BronxStation();
        String[] stations = st.getAllBStations();
        choices.getItems().add("Select Station");
        for (int i=0; i<stations.length; i++){
            choices.getItems().add(stations[i]);
        }
        choices.setValue("Select Station");
        TextFields.bindAutoCompletion(tf, stations);
        choices.getSelectionModel().selectedItemProperty().addListener((v, oldValue, newValue) -> selectFromChoices() );
    }

    public void selectFromChoices(){
        selectedStation = choices.getValue();
        for (int i=0; i<all.numberOfStations(); i++){
            if (all.get(i).getName().equals(selectedStation)) ta.setText("Borough: " + all.get(i).getBorough() + "\n" + all.get(i).showInfo());
        }
    }

    public void pressedEnter(KeyEvent event){
        if (event.getCode() == KeyCode.ENTER) pressOK();
    }

    public void clickOnTf(){
        if (tf.isDisable()) tf.setText("Select Borough First from menu!");
    }

    public void pressOK( ){
        selectedStation = tf.getText();
        for (int i=0; i<all.numberOfStations(); i++){
            if (all.get(i).getName().equals(selectedStation)) ta.setText("Borough: " + all.get(i).getBorough() + "\n" + all.get(i).showInfo());
        }
    }

    public void reset(){
        all.storeStations();
        choices.getItems().remove(0,choices.getItems().size());
        otherB.setVisible(false);
        choices.getItems().addAll("Choose Borough","Queens","Manhattan","Brooklyn","The Bronx","Staten Island");
        choices.setValue("Choose Borough");
        tf.setEditable(false);
        tf.setPromptText("Select Borough");
        choices.getSelectionModel().selectedItemProperty().addListener((v, oldValue, newValue) -> {
            if (newValue.equals("Queens")) storeQstations();
            if (newValue.equals("Manhattan")) storeMstations();
            if (newValue.equals("Brooklyn")) storeBLNstations();
            if (newValue.equals("The Bronx")) storeBRXstations();
            tf.setPromptText("Select Station from menu or type name here");
            otherB.setVisible(true);
            tf.setEditable(true);
            //if (newValue.equals("Staten Island")) storeSIstations();
        });
    }


    public void pressBack(ActionEvent event)throws IOException{
        Stage window = (Stage) pane.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene scene = new Scene(root, 800, 450);
        window.setScene(scene);
    }

}
