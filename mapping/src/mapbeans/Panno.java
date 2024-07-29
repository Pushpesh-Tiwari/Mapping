/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mapbeans;
public class Panno {
    private String panNo;
    private String banacc;
    private Adhar adhar;

    public Panno() {
    }

    public Panno(String panNo, String banacc, Adhar adhar) {
        this.panNo = panNo;
        this.banacc = banacc;
        this.adhar = adhar;
    }
    public String getPanNo() {
        return panNo;
    }

    public void setPanNo(String panNo) {
        this.panNo = panNo;
    }

    public String getBanacc() {
        return banacc;
    }

    public void setBanacc(String banacc) {
        this.banacc = banacc;
    }

    public Adhar getAdhar() {
        return adhar;
    }

    public void setAdhar(Adhar adhar) {
        this.adhar = adhar;
    }
    
    
}
