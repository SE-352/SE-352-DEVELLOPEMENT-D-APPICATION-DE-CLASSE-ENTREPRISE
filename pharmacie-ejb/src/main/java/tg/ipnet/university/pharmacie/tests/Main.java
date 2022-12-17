/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.ipnet.university.pharmacie.tests;

import javax.ejb.EJB;
import tg.ipnet.university.pharmacie.ejb.CategorieDAO;
import tg.ipnet.university.pharmacie.entity.Categorie;

/**
 *
 * @author kpizia
 */
public class Main {
    @EJB
    private static CategorieDAO categorieDAO;
    
    public static void main(String[] args) {
        categorieDAO.ajout(new Categorie("Anti Biotique"));
    }
}
