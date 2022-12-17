/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.ipnet.university.pharmacie.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author kpizia
 */
@Entity()
@Table(name = "categories")
@NoArgsConstructor
@Data
public class Categorie implements Serializable {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    private String libelle;

    public Categorie(String libelle) {
        this.libelle = libelle;
    }
    
    @Override
    public String toString() {
        return "Categorie{" + "id=" + id + ", libelle=" + libelle + '}';
    }
    
}
