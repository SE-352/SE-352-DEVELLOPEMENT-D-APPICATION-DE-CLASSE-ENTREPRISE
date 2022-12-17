/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tg.ipnet.university.pharmacie.ejb;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.ejb.Local;
import tg.ipnet.university.pharmacie.entity.Medicament;
import tg.ipnet.university.pharmacie.generic.ejb.IDAO;

/**
 *
 * @author kpizia
 */
@Local
public interface MedicamentIDAO extends IDAO<Medicament, Integer>{
    
    public List<Medicament> getMedicamentsPerimes(Date date);
    public List<Medicament> getMedicamentsCategorie(String categorie);
}
