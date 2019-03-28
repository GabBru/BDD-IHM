/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdd.ihm_tracklab;

/**
 *
 * @author brunetgabriel
 */
public class DataEchantillon {
    private float qA, qC, qN;
    private Experiences experience;

    public DataEchantillon(float qA, float qC, float qN, Experiences experience) {
        this.qA = qA;
        this.qC = qC;
        this.qN = qN;
        this.experience = experience;
    }

    public float getqA() {
        return qA;
    }

    public float getqC() {
        return qC;
    }

    public float getqN() {
        return qN;
    }

    public Experiences getExperience() {
        return experience;
    }

    public void setExperience(Experiences experience) {
        this.experience = experience;
    }  

    public void setqA(float qA) {
        this.qA = qA;
    }

    public void setqC(float qC) {
        this.qC = qC;
    }

    public void setqN(float qN) {
        this.qN = qN;
    }
}
