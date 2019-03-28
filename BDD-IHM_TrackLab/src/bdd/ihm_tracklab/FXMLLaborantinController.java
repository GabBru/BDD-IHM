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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author brunetgabriel
 */
public class FXMLLaborantinController implements Initializable {

    @FXML 
    private TableView<Experiences> table_lab;
    @FXML
    private TableColumn<Experiences,String> col_noml;
    @FXML
    private TableColumn<Experiences,String> col_datel;
    @FXML
    private TableColumn<Experiences,String> col_statutl;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        table_lab.setItems(DataExperience.listeExperience);
    }    
    
    @FXML
    public void logout(ActionEvent event) throws IOException {
        Parent home_page = FXMLLoader.load(getClass().getResource("FXMLConnexion.fxml"));
        Stage app = (Stage)((Node) event.getSource()).getScene().getWindow();
        app.setScene(new Scene(home_page));
        app.show(); 
    }
    
    
}
