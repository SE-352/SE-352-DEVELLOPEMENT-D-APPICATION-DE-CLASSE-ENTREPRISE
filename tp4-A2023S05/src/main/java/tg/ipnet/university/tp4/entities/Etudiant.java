/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.ipnet.university.tp4.entities;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *
 * @author kpizia
 */
@Entity
@Table(name = "etudiants")
//@DiscriminatorValue(value = "ETUDIANT")
@Data
@AllArgsConstructor
public class Etudiant extends Personne{
    @Column(nullable = true)
    private String adresse;
    
    private String telephone;
    
    @ManyToOne
    @JoinColumn(name = "departement_id")
    private Departement departement;
    
    @ManyToMany(mappedBy = "etudiants")
    private Set<Cours> cours;

    public Etudiant(String nom, String prenom, String email, String adresse, String telephone) {
        super(nom, prenom, email);
        this.adresse = adresse;
        this.telephone = telephone;
    }
    
    

    public Etudiant() {
    }
    
    
}
