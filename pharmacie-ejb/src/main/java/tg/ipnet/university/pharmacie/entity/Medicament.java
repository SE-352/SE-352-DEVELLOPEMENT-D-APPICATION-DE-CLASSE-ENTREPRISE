/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.ipnet.university.pharmacie.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author kpizia
 */
@Entity()
@Table(name = "medicaments")
@NoArgsConstructor
@Data
public class Medicament implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    private String libelle;
    
    @Column(name = "prix_unitaire")
    private Double prixUnitaire;
    
    private Integer quantite;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "date_peremption")
    private Date datePeremption;
    
    @ManyToOne()
    @JoinColumn(name = "categorie_id")
    private Categorie categorie;

    @Override
    public String toString() {
        return "Medicament{" + "id=" + id + ", libelle=" + libelle + ", prixUnitaire=" + prixUnitaire + ", quantite=" + quantite + ", datePeremption=" + datePeremption + '}';
    }
    
}
