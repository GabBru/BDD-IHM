/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdd.ihm_tracklab;

import java.io.IOException;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author brunetgabriel & sauryclement
 */
public class BDDIHM_TrackLab extends Application {
    
    Stage stage;
    Scene scene;
    Parent root;
    ObservableList<DataEchantillon> listeEchantillon1 = FXCollections.observableArrayList();
    ObservableList<DataEchantillon> listeEchantillon2 = FXCollections.observableArrayList();
    ObservableList<DataEchantillon> listeEchantillon3 = FXCollections.observableArrayList();
    
    @Override
    public void start(Stage primaryStage) throws Exception {
       try {
        root = FXMLLoader.load(getClass().getResource("FXMLConnexion.fxml"));
        stage = primaryStage; 
        scene = new Scene(root);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
        stage.setTitle("LabTrack - Gestion de données de laboratoire");
        listeEchantillon1.add(new DataEchantillon("3","4","5"));
        listeEchantillon2.add(new DataEchantillon("6","12","21"));
        listeEchantillon3.add(new DataEchantillon("5","11","9")); listeEchantillon3.add(new DataEchantillon("1","2","3"));
        
        DataExperience.listeExperience.add(new Experiences("Test de l'iso-isolicine", "Colorimétrique", "12-03-2018", "B-mercaptoéthanol", "3", "120", "0.05", "0.10", "5","", new Chercheur("Deroix","Jack"), new Laborantin("",""), listeEchantillon1));
        DataExperience.listeExperience.add(new Experiences("Rôle du DDT dans la détection des desoxyribose", "Colorimétrique", "15-03-2018", "DDT-diosulfite", "5", "80", "0.05", "0.06", "8","", new Chercheur("Deroix","Jack"), new Laborantin("",""), listeEchantillon2));
        DataExperience.listeExperience.add(new Experiences("Rôle des cellules nucléaires dans l'activité mitochondriale", "Opacimétrique", "11-03-2019", "Plutonium-849", "8", "25", "0.05", "0.12", "","", new Chercheur("Deroix","Jack"), new Laborantin("",""), listeEchantillon3));
       } catch (IOException e) {}
    }
    
    /**
     * Static methode lançant l'application.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    } 
}