/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tg.ipnet.university.tp4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import tg.ipnet.university.tp4.entities.Departement;
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
//        Departement departement1=new Departement("Informatique", "info@ipnetinstitute.com");
//        Departement departement2=new Departement("Biologie", "biologie@ipnetinstitute.com");
//        
//        Etudiant etudiant1=new Etudiant("AYIVOR", "Jennifer", "mawouli.ayivor@ipnetinstitute.com", "Lomé-TOGO", "70432968");
//        etudiant1.setDepartement(departement1);
//        Etudiant etudiant2=new Etudiant("AMEDOME", "Wilson", "amedome.wilson@ipnetinstitute.com", "Lomé-TOGO", "98896180");
//        etudiant2.setDepartement(departement2);
//        em.persist(etudiant1);
//        em.persist(etudiant2);
        Query query= em.createQuery("SELECT e FROM Etudiant e WHERE e.departement.id=:idDepa");
        query.setParameter("idDepa", 2L);
        List<Etudiant> etudiants=query.getResultList();
        for (Etudiant etudiant : etudiants) {
            System.out.println(etudiant.toString());
        }
        tx.commit();       
    }
}
