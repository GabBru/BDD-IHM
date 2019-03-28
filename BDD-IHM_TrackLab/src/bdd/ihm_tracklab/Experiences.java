/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdd.ihm_tracklab;

import javafx.collections.ObservableList;

/**
 *
 * @author brunetgabriel
 */
public class Experiences {
    private String nom_exp, type_exp, date, AgBio, replicats, duree, seuil1, seuil2, frequence, etat, plaque;
    private Chercheur chercheur;
    private Laborantin laborantin;
    public static ObservableList<DataEchantillon> listeEchantillon;

    public Experiences(String nom_exp, String type_exp, String date, String AgBio, String replicats, String duree, String seuil1, String seuil2, String frequence, String plaque, Chercheur chercheur, Laborantin laborantin, ObservableList<DataEchantillon> listeEchantillon) {
        this.nom_exp = nom_exp;
        this.type_exp = type_exp;
        this.date = date;
        this.AgBio = AgBio;
        this.replicats = replicats;
        this.duree = duree;
        this.seuil1 = seuil1;
        this.seuil2 = seuil2;
        this.frequence = frequence;
        this.chercheur = chercheur;
        this.etat = "En attente";
        this.plaque = plaque;
        this.laborantin = laborantin;
        this.listeEchantillon = listeEchantillon;
    }

    public ObservableList<DataEchantillon> getListeEchantillon() {
        return listeEchantillon;
    }

    public String getNom_exp() {
        return nom_exp;
    }

    public String getType_exp() {
        return type_exp;
    }

    public String getPlaque() {
        return plaque;
    }

    public void setPlaque(String plaque) {
        this.plaque = plaque;
    }

    public String getDate() {
        return date;
    }

    public Chercheur getChercheur() {
        return chercheur;
    }

    public Laborantin getLaborantin() {
        return laborantin;
    }

    public String getAgBio() {
        return AgBio;
    }

    public String getReplicats() {
        return replicats;
    }

    public String getDuree() {
        return duree;
    }

    public String getSeuil1() {
        return seuil1;
    }

    public String getSeuil2() {
        return seuil2;
    }

    public String getFrequence() {
        return frequence;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public void setNom_exp(String nom_exp) {
        this.nom_exp = nom_exp;
    }

    public void setType_exp(String type_exp) {
        this.type_exp = type_exp;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setChercheur(Chercheur chercheur) {
        this.chercheur = chercheur;
    }

    public void setLaborantin(Laborantin laboratin) {
        this.laborantin = laboratin;
    }

    public void setAgBio(String AgBio) {
        this.AgBio = AgBio;
    }

    public void setReplicats(String replicats) {
        this.replicats = replicats;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    public void setSeuil1(String seuil1) {
        this.seuil1 = seuil1;
    }

    public void setSeuil2(String seuil2) {
        this.seuil2 = seuil2;
    }

    public void setFrequence(String frequence) {
        this.frequence = frequence;
    }    
}