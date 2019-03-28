/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdd.ihm_tracklab;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author brunetgabriel
 */
public class Chercheur {
    private String prenom, nom;

    /**
     * This is the personnal list of experiences for each "Chercheur".
     */
    public static ObservableList<Experiences> listePersoExperience = FXCollections.observableArrayList();

    public Chercheur(String prenom, String nom) {
        this.prenom = prenom;
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}

