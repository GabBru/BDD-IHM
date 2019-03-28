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
    private String qA, qC, qN;

    public DataEchantillon(String qA, String qC, String qN) {
        this.qA = qA;
        this.qC = qC;
        this.qN = qN;
    }

    public String getqA() {
        return qA;
    }

    public String getqC() {
        return qC;
    }

    public String getqN() {
        return qN;
    }

    public void setqA(String qA) {
        this.qA = qA;
    }

    public void setqC(String qC) {
        this.qC = qC;
    }

    public void setqN(String qN) {
        this.qN = qN;
    }
}