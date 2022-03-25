import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ViewFriendController {

    @FXML
    private Button btnClose;

    @FXML
    void btnForClose(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("Home.fxml"));
        Stage window = (Stage) btnClose.getScene().getWindow();
        window.setScene(new Scene(root, 550, 550));
    }

}
