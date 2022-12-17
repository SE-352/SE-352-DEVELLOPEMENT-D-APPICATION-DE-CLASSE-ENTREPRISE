/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.ipnet.university.tp4.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *
 * @author kpizia
 */
@Data
@AllArgsConstructor
@Entity
@Table(name = "cours")
public class Cours extends BaseEntity implements Serializable{   
    @Column(length = 60,nullable = false, unique = true)
    private String intitule;   
    @Column(name = "date_creation")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreation;
    
    @ManyToOne()
    @JoinColumn(name = "professeur_id")
    private Professeur professeur;
    
    @ManyToMany()
    @JoinTable(name = "inscriptions",
            joinColumns = @JoinColumn(name = "cours_id"),
            inverseJoinColumns = @JoinColumn(name = "etudiant_id"))
    private Set<Etudiant> etudiants;

    public Cours() {
    }
    
    
}
