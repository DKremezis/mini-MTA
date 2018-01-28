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
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import org.controlsfx.control.textfield.TextFields;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import static javafx.scene.control.SelectionMode.SINGLE;

public class NavigateController implements Initializable {
    @FXML
    private ChoiceBox<String> fromCB;
    @FXML
    private ChoiceBox<String> toCB;
    @FXML
    private ListView<String> fromLV;
    @FXML
    private ListView<String> toLV;
    @FXML
    private TextArea fromSelected;
    @FXML
    private TextArea toSelected;
    @FXML
    private TextArea resultTA;
    @FXML
    private TextField fromTF;
    @FXML
    private TextField toTF;
    @FXML
    private Button navigateBttn;
    @FXML
    private AnchorPane mainPane;

    private int count=0;
    private AllTheStations stations = new AllTheStations();
    private String[] searchStations = new String[200];
    private String[] qList = new QueensStation().getAllQStations();
    private String[] mList = new ManhattanStation().getAllMStations();
    private String[] bList = new BrooklynStation().getAllBStations();
    private String[] tBList = new BronxStation().getAllBStations();

    public void initialize(URL location, ResourceBundle resources) {
        fromLV.getItems().addAll("Queens", "Brooklyn", "Manhattan", "The Bronx", "Staten Island");
        toLV.getItems().addAll("Queens", "Brooklyn", "Manhattan", "The Bronx", "Staten Island");
        fromLV.getSelectionModel().setSelectionMode(SINGLE);
        toLV.getSelectionModel().setSelectionMode(SINGLE);
        store();
        TextFields.bindAutoCompletion(fromTF, searchStations);
        TextFields.bindAutoCompletion(toTF, searchStations);

    }

    public void boroughSelectedFrom()throws IOException{

        String from = fromLV.getSelectionModel().getSelectedItem();
        getChoiceBoxWithChosenBorough(from, "from");
    }

    public void pressedEnterOnTextField(KeyEvent e) throws IOException{
        if (e.getCode() == KeyCode.ENTER) selectedStationTextFieldBox();
    }

    public void boroughSelectedTo(MouseEvent event)throws IOException{

        String to = toLV.getSelectionModel().getSelectedItem();
        getChoiceBoxWithChosenBorough(to, "to");
    }


    private void getChoiceBoxWithChosenBorough(String borough, String bypassCall)throws IOException{

        if (borough.equals("Queens")) {
            QueensStation qstation = new QueensStation();
            getStationsForChBox(qList, bypassCall);
        }
        if (borough.equals("Manhattan")) {
            ManhattanStation mstation = new ManhattanStation();
            getStationsForChBox(mList, bypassCall);
        }
        if (borough.equals("Brooklyn")) {
            BrooklynStation bstation = new BrooklynStation();
            getStationsForChBox(bList, bypassCall);
        }

        if (borough.equals("The Bronx")) {
            BronxStation bstation = new BronxStation();
            getStationsForChBox(tBList, bypassCall);
        }

    }


    private void getStationsForChBox(String[] list, String source)throws IOException{
        if (navigateBttn.isDisable() || (!resultTA.getText().isEmpty()) ) refresh();

        if (source.equals("from")) {
            fromCB.getItems().remove(0,fromCB.getItems().size());
            fromCB.getItems().add("Select Station");

            for (int i = 0; i < list.length; i++) {
                fromCB.getItems().add(list[i]);
            }
            fromCB.setValue("Select Station");
            fromSelected.setText("");
        }

        if (source.equals("to")) {
            toCB.getItems().remove(0,toCB.getItems().size());
            toCB.getItems().add("Select Station");

            for (int i = 0; i < list.length; i++) {
                toCB.getItems().add(list[i]);
            }
            toCB.setValue("Select Station");
            toSelected.setText("");
        }

    }

    public void clickOnFromCB() throws IOException{
        if (fromCB.getItems().isEmpty()) return;
        if (navigateBttn.isDisable() || (!resultTA.getText().isEmpty()) ) refresh();
        fromCB.getSelectionModel().selectedItemProperty().addListener((v, oldValue, newValue) ->{
            if (!newValue.equals("Select Station")) fromSelected.setText(newValue);
        });
        count++;
        if (count/2==0) pressF2();
    }

    public void clickOnToCB()throws IOException{
        if (toCB.getItems().isEmpty()) return;
        if (navigateBttn.isDisable() || (!resultTA.getText().isEmpty()) ) refresh();
        toCB.getSelectionModel().selectedItemProperty().addListener((v,oldValue,newValue) ->{
            if (!newValue.equals("Select Station"))  toSelected.setText(newValue);
        });
        count++;
        if (count/2==0) pressF2();
    }

    private void store(){
        stations.storeStations();
        for (int i=0; i<stations.numberOfStations(); i++) searchStations[i] = stations.get(i).getName();
    }

    public void selectedStationTextFieldBox()throws IOException {
        if (fromTF.getText() != null) fromSelected.setText(fromTF.getText());
        if (toTF.getText() != null) toSelected.setText(toTF.getText());
        pressF2();
    }

    public void pressNavigate(){
        if (fromSelected.getText().equals(toSelected.getText())){
            resultTA.setText("You picked the same Station as you starting point\n and destination. Try again.");
            navigateBttn.setDisable(true);
        }
        else {
            GPS2 gps = new GPS2();
            String path = gps.navigate(fromSelected.getText(), toSelected.getText());
            resultTA.setText(path);
            navigateBttn.setText("Show me another way");

            ArrayList<String> altRoutes = new ArrayList<>();


            navigateBttn.setOnAction(e -> {
                altRoutes.add(gps.print());
                String result = path;
                for (int i = 0; i < altRoutes.size(); i++) result = result + "\n" + altRoutes.get(i);
                resultTA.setText(result);
                if (resultTA.getText().contains("No other possible route")) {
                    navigateBttn.setDisable(true);
                }
            });
        }
    }

    public void pressBack(ActionEvent event)throws IOException {
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setMaxWidth(800);
        window.setMaxHeight(450);
        window.setMinWidth(800);
        window.setMinHeight(450);
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene scene = new Scene(root, 800, 450);
        window.setScene(scene);
    }

    public void mouseOnTextField()throws IOException{
        if (navigateBttn.isDisable() || (!resultTA.getText().isEmpty())) refresh();
    }

    public void refresh()throws IOException{
        Stage stage = (Stage) mainPane.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("Navigate.fxml"));
        Scene scene = new Scene(root, 800, 450);
        stage.setScene(scene);
    }

    public void close(){
        Stage stage = (Stage) mainPane.getScene().getWindow();
        stage.close();
    }

    public void createTrainInfoScene()throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("trainInfo.fxml"));
        Scene scene = new Scene(root, 800, 450);
        Stage window = (Stage) mainPane.getScene().getWindow();
        window.setMaxWidth(800);
        window.setMaxHeight(450);
        window.setMinWidth(800);
        window.setMinHeight(450);
        window.setScene(scene);
    }

    public void openHowPopUp()throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("popManual.fxml"));
        Scene scene = new Scene(root, 227, 394);
        Stage window = new Stage();
        window.setScene(scene);
        window.initModality(Modality.APPLICATION_MODAL);
        window.showAndWait();
    }

    public void openMapPopUp()throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("mapMTA.fxml"));
        Scene scene = new Scene(root, 227, 394);
        Stage window = new Stage();
        window.setScene(scene);
        window.setMinHeight(690);
        window.setMinWidth(580);
        window.initModality(Modality.APPLICATION_MODAL);
        window.showAndWait();
    }

    public void pressF2(){
        Scene scene = mainPane.getScene();
        scene.addEventFilter(KeyEvent.KEY_PRESSED,

                event -> {
                    try{
                        if (event.getCode()==KeyCode.F2) openMapPopUp();
                    }catch(IOException e){}
                });
    }

}