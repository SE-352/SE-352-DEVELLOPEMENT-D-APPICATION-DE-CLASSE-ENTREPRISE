/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.ipnet.university.pharmacie.ejb;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import tg.ipnet.university.pharmacie.entity.Medicament;
import tg.ipnet.university.pharmacie.generic.ejb.DAO;

/**
 *
 * @author kpizia
 */
@Stateless
public class MedicamentDAO extends DAO<Medicament, Integer> 
        implements MedicamentIDAO {

    @PersistenceContext(name = "pharmacie-ejbPU")
    private EntityManager entityManager;

    public MedicamentDAO() {
        super(Medicament.class);
    }
    
    @Override
    public List<Medicament> getMedicamentsPerimes(Date reference) {
        List<Medicament> medicaments=new ArrayList<>();
        try {
            Query query= entityManager.createQuery("SELECT m FROM Medicament m WHERE m.datePeremption <= :ref");
            query.setParameter("ref", reference);
            medicaments= query.getResultList();
        } catch (Exception e) {
            System.out.println("Erreur : "+e.getMessage());
        }
        return medicaments;
    }

    @Override
    public List<Medicament> getMedicamentsCategorie(String categorie) {
        List<Medicament> medicaments=new ArrayList<>();
        try {
            Query query= entityManager.createQuery("SELECT m FROM Medicament m WHERE m.categorie.libelle=:cat");
            query.setParameter("cat", categorie);
            medicaments= query.getResultList();
        } catch (Exception e) {
            System.out.println("Erreur : "+e.getMessage());
        }
        return medicaments;
    }

}
