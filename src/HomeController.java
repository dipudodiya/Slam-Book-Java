import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.input.MouseEvent;

public class HomeController {

    @FXML
    private ImageView btnVF;

    @FXML
    void ImageView(MouseEvent event) throws IOException 
    {
        Parent root = FXMLLoader.load(getClass().getResource("ViewFriendList.fxml"));
        Stage window = (Stage) btnVF.getScene().getWindow();
        window.setScene(new Scene(root, 550, 550));
    }

}
