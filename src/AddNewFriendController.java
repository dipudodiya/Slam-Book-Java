import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AddNewFriendController {

    @FXML
    private Button btnCancel;

    @FXML
    private Button btnSave;

    @FXML
    void btnForCancel(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("Home.fxml"));
        Stage window = (Stage) btnCancel.getScene().getWindow();
        window.setScene(new Scene(root, 550, 550));
    }


    @FXML
    void btnForSave(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("Home.fxml"));
        Stage window = (Stage) btnSave.getScene().getWindow();
        window.setScene(new Scene(root, 550, 550));
    }


}

