/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tg.ipnet.university.pharmacie.generic.ejb;

import java.io.Serializable;
import java.util.List;
import tg.ipnet.university.pharmacie.entity.Medicament;

/**
 *
 * @author kpizia
 */
public interface IDAO<T extends Object,PK extends Serializable> {
    
    public T ajout(T entity) throws Exception;
    public T editer(T entity) throws Exception;
    public Boolean supprimer(PK id) throws Exception;
    public Boolean supprimer(T entity) throws Exception;
    public T rechercher(PK id) throws Exception;
    public List<T> lister() throws Exception;
}
