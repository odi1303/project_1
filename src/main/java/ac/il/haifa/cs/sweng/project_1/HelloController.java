/**
 * Sample Skeleton for 'hello-view.fxml' Controller Class
 */

package ac.il.haifa.cs.sweng.project_1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML // fx:id="connectButton"
    private Button connectButton; // Value injected by FXMLLoader

    @FXML // fx:id="create_accont_button"
    private Hyperlink create_accont_button; // Value injected by FXMLLoader

    @FXML // fx:id="password"
    private PasswordField password; // Value injected by FXMLLoader

    @FXML // fx:id="username"
    private TextField username; // Value injected by FXMLLoader

    @FXML // fx:id="welcomeText"
    private Label welcomeText; // Value injected by FXMLLoader

    @FXML // fx:id="wrongDetails"
    private Label wrongDetails; // Value injected by FXMLLoader

    @FXML
    void create_an_account(ActionEvent event) {

    }

    @FXML
    //check if the details are correct, if they not show an error
    void onConnectButtonClick(ActionEvent event) {
        if (username.getText().isEmpty() || password.getText().isEmpty()) {
            wrongDetails.setText("Please fill all the fields");
        } else {
            wrongDetails.setText("One or more fields are wrong, please try again");
        }


    }

}
