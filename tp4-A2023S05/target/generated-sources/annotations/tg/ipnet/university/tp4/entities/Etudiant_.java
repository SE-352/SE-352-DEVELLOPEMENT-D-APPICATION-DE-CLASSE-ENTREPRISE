package tg.ipnet.university.tp4.entities;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import tg.ipnet.university.tp4.entities.Cours;
import tg.ipnet.university.tp4.entities.Departement;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-11-12T11:39:15", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Etudiant.class)
public class Etudiant_ extends Personne_ {

    public static volatile SingularAttribute<Etudiant, Departement> departement;
    public static volatile SingularAttribute<Etudiant, String> adresse;
    public static volatile SingularAttribute<Etudiant, String> telephone;
    public static volatile SetAttribute<Etudiant, Cours> cours;

}