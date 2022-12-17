package tg.ipnet.university.tp4.entities;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *
 * @author kpizia
 */
@Data
@AllArgsConstructor
@Entity
@Table(name = "departments")
public class Departement extends BaseEntity{
    private String nom;
    private String adresseWeb;
    
    @OneToMany(mappedBy = "departement",fetch = FetchType.LAZY)
    private Set<Etudiant> etudiants;

    public Departement() {
    }

    public Departement(String nom, String adresseWeb) {
        this.nom = nom;
        this.adresseWeb = adresseWeb;
    }
      
    
}
