/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdd.ihm_tracklab;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
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
public class FXMLLaborantinController implements Initializable {

    @FXML 
    private TableView<Experiences> table_lab;
    @FXML 
    private TableView<DataEchantillon> table_details_labo;
    @FXML
    private TableColumn<Experiences,String> col_noml;
    @FXML
    private TableColumn<String,String> col_Al;
    @FXML
    private TableColumn<String,String> col_Cl;
    @FXML
    private TableColumn<String,String> col_Nl;
    @FXML
    private TableColumn<Experiences,String> col_datel;
    @FXML
    private TableColumn<Experiences,String> col_statutl;
    @FXML
    private ChoiceBox choice_type_plaque;
    @FXML
    private Text txt_nom_exp;
    @FXML
    private Text txt_nom_chercheur;
    @FXML
    private Text txt_type_exp;
    @FXML
    private Text txt_AgBio;
    @FXML
    private Text txt_duree;
    @FXML
    private Text txt_nb_replicat;
    @FXML
    private Text txt_seuils;
    
    private final ObservableList<String> listeTypePlaque = FXCollections.observableArrayList();
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        col_noml.setCellValueFactory(
            new PropertyValueFactory<>("nom_exp")); 
        col_statutl.setCellValueFactory(
            new PropertyValueFactory<>("etat"));
        col_datel.setCellValueFactory(
            new PropertyValueFactory<>("date"));  
        table_lab.setItems(DataExperience.listeExperience);
        
        listeTypePlaque.add("96");
        listeTypePlaque.add("384");
        
        choice_type_plaque.setItems(listeTypePlaque);
        
        txt_nom_chercheur.setText("Jack Deroix");
    }    
    
    @FXML
    public void logout(ActionEvent event) throws IOException {
        Parent home_page = FXMLLoader.load(getClass().getResource("FXMLConnexion.fxml"));
        Stage app = (Stage)((Node) event.getSource()).getScene().getWindow();
        app.setScene(new Scene(home_page));
        app.show(); 
    }
    
    public void onBtnDemarrer(ActionEvent event) throws IOException {
        ObservableList<Experiences> ligneSelectionnee;
        ligneSelectionnee = table_lab.getSelectionModel().getSelectedItems();
        ligneSelectionnee.get(0).setPlaque(choice_type_plaque.getValue().toString());
        ligneSelectionnee.get(0).setEtat("En cours");
        ligneSelectionnee.get(0).getLaborantin().setNom("Delavoix");
        ligneSelectionnee.get(0).getLaborantin().setPrenom("Luc");
        table_lab.setItems(DataExperience.listeExperience);
    }
    
    public void onBtnDetails(ActionEvent event) throws IOException {
        ObservableList<Experiences> ligneSelectionnee;
        ligneSelectionnee = table_lab.getSelectionModel().getSelectedItems();  
        txt_nom_exp.setText(ligneSelectionnee.get(0).getNom_exp());
        txt_nom_chercheur.setText(ligneSelectionnee.get(0).getChercheur().getPrenom()+" "+ligneSelectionnee.get(0).getChercheur().getNom());
        txt_type_exp.setText(ligneSelectionnee.get(0).getType_exp());
        txt_AgBio.setText(ligneSelectionnee.get(0).getAgBio());
        txt_duree.setText(ligneSelectionnee.get(0).getDuree()+ " minutes");
        txt_seuils.setText("["+ligneSelectionnee.get(0).getSeuil1() + "-" + ligneSelectionnee.get(0).getSeuil2() + "]");
        txt_nb_replicat.setText(ligneSelectionnee.get(0).getReplicats());
        
        txt_nom_exp.setVisible(true);
        txt_nom_chercheur.setVisible(true);
        txt_type_exp.setVisible(true);
        txt_AgBio.setVisible(true);
        txt_duree.setVisible(true);  
        txt_seuils.setVisible(true);
        txt_nb_replicat.setVisible(true);
        choice_type_plaque.setVisible(true);
        // table des n-uplets
        col_Al.setCellValueFactory(
            new PropertyValueFactory<>("qA")); 
        col_Cl.setCellValueFactory(
            new PropertyValueFactory<>("qC"));
        col_Nl.setCellValueFactory(
            new PropertyValueFactory<>("qN"));  
        table_details_labo.setItems(ligneSelectionnee.get(0).getListeEchantillon());
        table_details_labo.setVisible(true);
    }
}