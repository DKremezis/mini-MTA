package sample;

import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class popManualController{

    @FXML private AnchorPane popUpPane;
    private Stage window;


    public void close(){
        window = (Stage) popUpPane.getScene().getWindow();
        window.close();
    }
}
