/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdd.ihm_tracklab;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author brunetgabriel
 */
public class FXMLConnexionController implements Initializable {

    @FXML
    private TextField field_id;
    @FXML
    private TextField field_mdp;
    @FXML
    private Text err_id;
    @FXML
    private Text err_id1;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public void login(ActionEvent event) throws IOException{
        err_id.setVisible(false);
        err_id1.setVisible(false);
        String id = field_id.getText().toUpperCase();
        String mdp = field_mdp.getText().toUpperCase();
        try{ 
            switch (id) {
                case "CHERCHEUR":
                    if (mdp.equals("CHERCHEUR")){
                        Parent home_page = FXMLLoader.load(getClass().getResource("FXMLChercheur.fxml"));
                        Stage app = (Stage)((Node) event.getSource()).getScene().getWindow();
                        app.setScene(new Scene(home_page));
                        app.show();
                    } else {err_id1.setText("Erreur de mot de passe"); err_id1.setVisible(true);}  break; 
                case "LABORANTIN":
                    if (mdp.equals("LABORANTIN")){
                        Parent home_page = FXMLLoader.load(getClass().getResource("FXMLLaborantin.fxml"));
                        Stage app = (Stage)((Node) event.getSource()).getScene().getWindow();
                        app.setScene(new Scene(home_page));
                        app.show();
                    } else {err_id1.setText("Erreur de mot de passe"); err_id1.setVisible(true);}   break;
                default:
                    err_id.setText("Erreur d'identifiant");
                    err_id.setVisible(true);
                    break;
            }
        } catch (IOException e) {}
   }
}
