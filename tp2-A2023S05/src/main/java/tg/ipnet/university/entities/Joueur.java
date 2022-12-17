/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.ipnet.university.entities;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import jdk.jfr.Enabled;

/**
 *
 * @author kpizia
 */
@Entity
public class Joueur {
    @Id
    @Column(name = "numero_licence")
    private String numeroLicence;
    
    @Column(nullable = false,length = 60)
    private String nom;
    
    @Column(nullable = false,length = 80)
    private String prenom;
    
    private Integer point;
    
    @OneToMany(mappedBy = "joueur1")
    private Set<Match> matchs;

    public Joueur() {
    }

    public Joueur(String numeroLicence, String nom, String prenom, Integer point) {
        this.numeroLicence = numeroLicence;
        this.nom = nom;
        this.prenom = prenom;
        this.point = point;
    }

    public String getNumeroLicence() {
        return numeroLicence;
    }

    public void setNumeroLicence(String numeroLicence) {
        this.numeroLicence = numeroLicence;
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

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }
    
    
}
