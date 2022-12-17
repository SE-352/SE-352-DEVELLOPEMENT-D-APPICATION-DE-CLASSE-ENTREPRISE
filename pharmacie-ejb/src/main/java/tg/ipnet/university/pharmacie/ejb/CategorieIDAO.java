/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tg.ipnet.university.pharmacie.ejb;

import java.io.Serializable;
import javax.ejb.Local;
import tg.ipnet.university.pharmacie.entity.Categorie;
import tg.ipnet.university.pharmacie.generic.ejb.IDAO;

/**
 *
 * @author kpizia
 */
@Local
public interface CategorieIDAO extends IDAO<Categorie, Integer>{
    
}
