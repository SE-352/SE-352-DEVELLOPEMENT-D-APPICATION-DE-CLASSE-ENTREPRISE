/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.ipnet.university.pharmacie.ejb;

import java.io.Serializable;
import javax.ejb.Stateless;
import tg.ipnet.university.pharmacie.entity.Categorie;
import tg.ipnet.university.pharmacie.generic.ejb.DAO;

/**
 *
 * @author kpizia
 */
@Stateless
public class CategorieDAO extends DAO<Categorie, Integer>
        implements CategorieIDAO{

    public CategorieDAO() {
        super(Categorie.class);
    }
    
}
