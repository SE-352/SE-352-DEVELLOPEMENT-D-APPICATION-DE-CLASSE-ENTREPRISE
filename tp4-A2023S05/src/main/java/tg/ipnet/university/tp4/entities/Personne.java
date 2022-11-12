package tg.ipnet.university.tp4.entities;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *
 * @author kpizia
 */
@Data
@AllArgsConstructor
@Entity
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@DiscriminatorColumn(name = "type")
public class Personne extends BaseEntity{ 
    @Column(length = 60,nullable = false)
    protected String nom;
    
    @Column(length = 60,nullable = false)
    protected String prenom;
    
    @Column(length = 60)
    protected String email;

    public Personne() {
    }
      
}
