package tg.ipnet.university.pharmacie.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import tg.ipnet.university.pharmacie.entity.Categorie;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2023-01-21T08:49:12")
@StaticMetamodel(Medicament.class)
public class Medicament_ { 

    public static volatile SingularAttribute<Medicament, Double> prixUnitaire;
    public static volatile SingularAttribute<Medicament, Categorie> categorie;
    public static volatile SingularAttribute<Medicament, String> libelle;
    public static volatile SingularAttribute<Medicament, Integer> id;
    public static volatile SingularAttribute<Medicament, Date> datePeremption;
    public static volatile SingularAttribute<Medicament, Integer> quantite;

}