package olamundofx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class FXMLDocumentController implements Initializable {

    @FXML
    public Label lblMensagem;
    public Button btnClicou;

    @FXML
    private void Clicou(ActionEvent event) {
        lblMensagem.setText("Hello World!");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

}
