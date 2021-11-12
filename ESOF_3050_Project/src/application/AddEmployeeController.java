package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

public class AddEmployeeController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="firstNameTextField"
    private TextField firstNameTextField; // Value injected by FXMLLoader

    @FXML // fx:id="lastNameTextField"
    private TextField lastNameTextField; // Value injected by FXMLLoader

    @FXML // fx:id="SINTextField"
    private TextField SINTextField; // Value injected by FXMLLoader

    @FXML // fx:id="dateOfBirthTextField"
    private TextField dateOfBirthTextField; // Value injected by FXMLLoader

    @FXML // fx:id="addressTextField"
    private TextField addressTextField; // Value injected by FXMLLoader

    @FXML // fx:id="employeeIDTextField"
    private TextField employeeIDTextField; // Value injected by FXMLLoader

    @FXML // fx:id="statusChoiceBox"
    private ChoiceBox<?> statusChoiceBox; // Value injected by FXMLLoader

    private Main main;
    private Scene sceneLogin;
    
    public void setMainScene(Main main) {
    	this.main = main;
    }
    
    public void setAddPressedScene(Scene sceneLogin) {
    	this.sceneLogin = sceneLogin;
    }
    
    @FXML
    void addButtonPressed(ActionEvent event) {
    	main.setScreen(sceneLogin);
    	resetFields();
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
    	resetFields();
    }
    
    void resetFields() {
    	firstNameTextField.setText("");
    	lastNameTextField.setText("");
    	SINTextField.setText("");
    	dateOfBirthTextField.setText("");
    	addressTextField.setText("");
    	employeeIDTextField.setText(""); 
    	statusChoiceBox.setValue(null);
    }
}
