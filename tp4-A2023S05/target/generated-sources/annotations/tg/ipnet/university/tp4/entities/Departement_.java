package tg.ipnet.university.tp4.entities;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import tg.ipnet.university.tp4.entities.Etudiant;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-11-12T11:39:15", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Departement.class)
public class Departement_ extends BaseEntity_ {

    public static volatile SetAttribute<Departement, Etudiant> etudiants;
    public static volatile SingularAttribute<Departement, String> nom;
    public static volatile SingularAttribute<Departement, String> adresseWeb;

}