/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tg.ipnet.university.tp4;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import tg.ipnet.university.tp4.entities.Etudiant;

/**
 *
 * @author kpizia
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("universitePU");
        EntityManager em=emf.createEntityManager();
        
        EntityTransaction tx=em.getTransaction();
        tx.begin();
        Etudiant etudiant1=new Etudiant("AYIVOR", "Jennifer", "mawouli.ayivor@ipnetinstitute.com", "Lomé-TOGO", "70432968");
        em.persist(etudiant1);
        tx.commit();
        
    }
}
