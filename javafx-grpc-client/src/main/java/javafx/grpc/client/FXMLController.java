package javafx.grpc.client;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

public class FXMLController implements Initializable {
    
    @FXML
    private TextArea taFromServer;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        // How to send request to server using gRPC
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}
