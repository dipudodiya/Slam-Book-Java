import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
public class App extends Application{
    
    public void start(Stage primaryStage) throws IOException 
    {
    
        Parent root = FXMLLoader.load(getClass().getResource("SignUp.fxml"));
        Scene scene = new Scene(root,550,550); 
        primaryStage.setTitle("Slam Book"); 
        primaryStage.setScene(scene); 
        primaryStage.show();
    } 
    
   
    public static void main(String[] args) 
    {
        launch(args);
    }    
}