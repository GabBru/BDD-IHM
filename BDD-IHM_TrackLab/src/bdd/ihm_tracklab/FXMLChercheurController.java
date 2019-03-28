/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdd.ihm_tracklab;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author brunetgabriel
 */
public class FXMLChercheurController implements Initializable {

        @FXML
        private TableView<Experiences> table_chercheur;
        @FXML
        private TableColumn col_nomc;
        @FXML
        private TableColumn col_etatc;
        @FXML 
        private TableColumn col_datec;
        @FXML
        private Text txt_nom_exp;
        @FXML
        private Text txt_nomlab;
        @FXML
        private Text txt_type_exp;
        @FXML
        private Text txt_AgBio;
        @FXML
        private Text txt_duree;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        col_nomc.setCellValueFactory(
            new PropertyValueFactory<>("nom_exp")); 
        col_etatc.setCellValueFactory(
            new PropertyValueFactory<>("etat"));
        col_datec.setCellValueFactory(
            new PropertyValueFactory<>("date")
        );  
        table_chercheur.setItems(DataExperience.listeExperience);
    }    
    
    public void logout(ActionEvent event) throws IOException {
        Parent home_page = FXMLLoader.load(getClass().getResource("FXMLConnexion.fxml"));
        Stage app = (Stage)((Node) event.getSource()).getScene().getWindow();
        app.setScene(new Scene(home_page));
        app.show();
    } 
    
    public void onBtnNewExp(ActionEvent event) throws IOException {
        Parent home_page = FXMLLoader.load(getClass().getResource("FXMLNew_Exp.fxml"));
        Stage app = (Stage)((Node) event.getSource()).getScene().getWindow();
        app.setScene(new Scene(home_page));
        app.show();
    }
    
    public void onBtnResultats(ActionEvent event) throws IOException {
        ObservableList<Experiences> ligneSelectionnee;
        ligneSelectionnee = table_chercheur.getSelectionModel().getSelectedItems();
        txt_nom_exp.setText(ligneSelectionnee.get(0).getNom_exp());
        txt_type_exp.setText(ligneSelectionnee.get(0).getType_exp());
        txt_AgBio.setText(ligneSelectionnee.get(0).getAgBio());
        txt_duree.setText(ligneSelectionnee.get(0).getDuree());
        txt_nomlab.setText(ligneSelectionnee.get(0).getLaborantin().getPrenom()+" "+ligneSelectionnee.get(0).getLaborantin().getNom());
    }
}
