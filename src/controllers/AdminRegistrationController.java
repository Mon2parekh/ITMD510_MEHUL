package controllers;

import java.io.IOException;
import java.net.URL;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

import Dao.DbConnect;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AdminRegistrationController implements Initializable {

    @FXML
    private Button btnsubmit;
    
    @FXML
    private TextField txtName;

    @FXML
    private TextField txtUserName;

    @FXML
    private PasswordField txtPassword;
    
    
    
    @FXML
    void btnback_click(ActionEvent event) throws IOException {
    	Stage primaryStage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("/views/AdminLoginexist.fxml"));
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("/application/application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.setTitle("IIT Auto Insurance Application !!");
		primaryStage.show();
		
		Node source = (Node) event.getSource();
		Stage stage = (Stage) source.getScene().getWindow();
		stage.close();

    }
    
    @Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

    @FXML
     public void btnsubmit_click(ActionEvent event) throws IOException, SQLException {
    	
    	DbConnect conn = new DbConnect();
    	
    	String signUpAdminScript = "INSERT INTO `510fp`.`mehul_parekh_adminlogin`(`username`,`password`,`Name`) VALUES(?,?,?)";
    	
    	PreparedStatement preparedStatement = conn.prepareStatement(signUpAdminScript);

		preparedStatement.setString(1, txtUserName.getText());
		preparedStatement.setString(2, txtPassword.getText());
		preparedStatement.setString(3, txtName.getText());
		
		preparedStatement.executeUpdate();
    	
    	Stage primaryStage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("/views/Adminlogin.fxml"));
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("/application/application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.setTitle("IIT Auto Insurance Application !!");
		primaryStage.show();
		
		Node  source = (Node)  event.getSource(); 
	    Stage stage  = (Stage) source.getScene().getWindow();
	    stage.close();

    }

}
