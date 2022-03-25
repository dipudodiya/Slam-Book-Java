import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class SignupController {

    @FXML
    private Button btnSign;

    @FXML
    private RadioButton radioFemale;

    @FXML
    private RadioButton radioMale;

    @FXML
    private RadioButton radioOther;

    @FXML
    private TextField txtBirth;

    @FXML
    private TextField txtConfirm;

    @FXML
    private TextField txtContact;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtxPassword;

    @FXML
    void btnFemale(ActionEvent event) {

    }

    @FXML
    void btnForSignup(ActionEvent event) throws IOException 
    {
       // Parent root = FXMLLoader.load(getClass().getResource("Home.fxml"));
       Parent root = FXMLLoader.load(getClass().getResource("Home.fxml"));
       Stage window = (Stage) btnSign.getScene().getWindow();
        window.setScene(new Scene(root, 550, 550));

    }

    @FXML
    void btnMale(ActionEvent event) {

    }

    @FXML
    void btnOther(ActionEvent event) {

    }

}
