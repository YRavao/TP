/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package authentification_tp5;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author Yolive
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private Button Button;
    
    @FXML
    private PasswordField password;
    
    @FXML
    private TextField identifiant;
    
    
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
       
           
        if(identifiant.getText().equals("Admin") && password.getText().equals("a")){
           
            System.out.println("Connexion reussie "+ identifiant.getText());
          
        Parent parent = FXMLLoader.load(getClass().getResource("Main.fxml"));
        
        Scene scene = new Scene(parent);
        Stage stage = new Stage();
        
        stage.setScene(scene);
        stage.show();
       
        }else { 
           
           if (identifiant.getText().equals("id") && password.getText().equals("password")){
            Parent parent = FXMLLoader.load(getClass().getResource("Id.fxml"));
        
            Scene scene = new Scene(parent);
            Stage stage = new Stage();
        
            stage.setScene(scene);
            stage.show();
               
            System.out.println("Connexion reussie "+ identifiant.getText());
               
            
           }else{
            label.setText("Identifiant ou mot de passe incorrect !");
                      
         }
        }
  
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
