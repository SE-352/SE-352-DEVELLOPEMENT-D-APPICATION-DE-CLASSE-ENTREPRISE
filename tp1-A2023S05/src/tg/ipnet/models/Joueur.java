/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.ipnet.models;

/**
 *
 * @author kpizia
 */
public class Joueur implements Comparable<Joueur>{
    private String nom;
    private String prenom;
    private String numeroLicence;
    private int point=0;

    public Joueur() {
    }

    public Joueur(String nom, String prenom, String numeroLicence) {
        this.nom = nom;
        this.prenom = prenom;
        this.numeroLicence = numeroLicence;
    }
    public Joueur(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        this.numeroLicence = generateNumeroLicence(nom,prenom);
    }
    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNumeroLicence() {
        return numeroLicence;
    }

    public void setNumeroLicence(String numeroLicence) {
        this.numeroLicence = numeroLicence;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }
    
    private String generateNumeroLicence(String nom, String prenom) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public int compareTo(Joueur o) {
        return this.point - o.getPoint();
    }
    
}
