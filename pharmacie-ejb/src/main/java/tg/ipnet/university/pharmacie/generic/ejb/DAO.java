/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.ipnet.university.pharmacie.generic.ejb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author kpizia
 */
public class DAO<T extends Object, PK extends Serializable>
        implements IDAO<T, PK> {

    private Class<T> entity;

    @PersistenceContext(name = "pharmacie-ejbPU")
    private EntityManager em;

    public DAO(Class<T> entity) {
        this.entity = entity;
    }

    @Override
    public T ajout(T entity) {
        try {
            em.persist(entity);
            return entity;
        } catch (Exception e) {
            System.out.println("Erreur " + e.getMessage());
            return null;
        }
    }

    @Override
    public T editer(T entity) {
        try {
            entity = em.merge(entity);
            return entity;
        } catch (Exception e) {
            System.out.println("Erreur " + e.getMessage());
            return null;
        }
    }

    @Override
    public Boolean supprimer(PK id) {
        try {
            T entity=rechercher(id);
            em.remove(entity);
            return Boolean.TRUE;
        } catch (Exception e) {
            System.out.println("Erreur " + e.getMessage());
            return Boolean.FALSE;
        }
    }

    @Override
    public Boolean supprimer(T entity) {
        try {
            em.remove(entity);
            return Boolean.TRUE;
        } catch (Exception e) {
            System.out.println("Erreur " + e.getMessage());
            return Boolean.FALSE;
        }
    }

    @Override
    public T rechercher(PK id) {
        try {
            T entity=em.find(this.entity, id);
            return entity;
        } catch (Exception e) {
            System.out.println("Erreur " + e.getMessage());
            return null;
        }
    }

    @Override
    public List<T> lister() {
        List<T> entities=new ArrayList<>();
        try {
            Query query= em.createQuery("SELECT e FROM "+this.entity.getName()+" e");
            entities= query.getResultList();
        } catch (Exception e) {
            System.out.println("Erreur : "+e.getMessage());
        }
        return entities;
    }

}
