/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdd.ihm_tracklab;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author brunetgabriel
 */
public class FXMLNew_ExpController implements Initializable {
    @FXML
    AnchorPane AnchorPane;
    @FXML
    private ChoiceBox field_type_exp;
    @FXML
    private ChoiceBox field_type_plaque;
    @FXML
    private TextField field_nom_experience;
    @FXML
    private TextField field_AgBio;
    @FXML
    private TextField field_replicat;
    @FXML
    private TextField field_duree_exp;
    @FXML
    private TextField field_seuil1;
    @FXML
    private TextField field_seuil2;
    @FXML
    private TextField field_frequence;
    @FXML
    private TableView<String> tab_details;
    @FXML
    private TableColumn<String,String> col_A;
    @FXML
    private TableColumn<String,String> col_C;
    @FXML
    private TableColumn<String,String> col_N;  
    
    private final ObservableList<String> listeTypeExp = FXCollections.observableArrayList();
    private final ObservableList<String> listeTypePlaque = FXCollections.observableArrayList();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        listeTypeExp.add("Colorimétrique");
        listeTypeExp.add("Opacimétrique");
        listeTypePlaque.add("96");
        listeTypePlaque.add("384");
        
        field_type_exp.setItems(listeTypeExp);
        field_type_plaque.setItems(listeTypePlaque);
    }    
    
    @FXML
    public void onBtnRetourClick(ActionEvent event) throws IOException {
        Parent home_page = FXMLLoader.load(getClass().getResource("FXMLChercheur.fxml"));
        Stage app = (Stage)((Node) event.getSource()).getScene().getWindow();
        app.setScene(new Scene(home_page));
        app.show(); 
    }
    
    @FXML
    public void onBtnSubmitClick(ActionEvent event) throws IOException{    
        DataExperience.listeExperience.add(new Experiences(field_nom_experience.getText(), field_type_exp.getValue().toString(), LocalDate.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")), field_AgBio.getText(), field_replicat.getText(), field_duree_exp.getText(), field_seuil1.getText(), field_seuil2.getText(), field_frequence.getText(), new Chercheur("Deroix","Jack"), new Laborantin("", "")));
        Parent home_page = FXMLLoader.load(getClass().getResource("FXMLChercheur.fxml"));
        Stage app = (Stage)((Node) event.getSource()).getScene().getWindow();
        app.setScene(new Scene(home_page));
        app.show();
    }
    
    @FXML
    public void logout(ActionEvent event) throws IOException {
        Parent home_page = FXMLLoader.load(getClass().getResource("FXMLConnexion.fxml"));
        Stage app = (Stage)((Node) event.getSource()).getScene().getWindow();
        app.setScene(new Scene(home_page));
        app.show();
    } 
}
