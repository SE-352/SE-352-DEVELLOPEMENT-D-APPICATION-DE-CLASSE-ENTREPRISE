package tg.ipnet.university.tp4.entities;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import tg.ipnet.university.tp4.entities.Etudiant;
import tg.ipnet.university.tp4.entities.Professeur;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-11-12T11:39:15", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Cours.class)
public class Cours_ extends BaseEntity_ {

    public static volatile SingularAttribute<Cours, Date> dateCreation;
    public static volatile SingularAttribute<Cours, Professeur> professeur;
    public static volatile SetAttribute<Cours, Etudiant> etudiants;
    public static volatile SingularAttribute<Cours, String> intitule;

}