package sample;

import javafx.fxml.FXML;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class mapMTAController {
    @FXML
    AnchorPane pane;
    private Stage window;

    public void close(){
        window = (Stage) pane.getScene().getWindow();
        window.close();
    }

    public void close(KeyEvent event){
        window = (Stage) pane.getScene().getWindow();
        if (event.getCode() == KeyCode.F2 ) window.close();
    }

}
