package tn.esprit.springproject.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@ToString(exclude = {"idFacture"})
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "Facture")
public class Facture implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(name = "idFacture")
    @Setter(value = AccessLevel.NONE)
    private long idFacture;
    @Column(name = "MontantRemise")
    private float MontantRemise;
    @Column(name = "MontantFacture")
    private float MontantFacture;
    @Column(name = "dateFacture")
    private Date dateFacture;
    @Column(name = "active")
    private Boolean active;
    @EqualsAndHashCode.Exclude
@ManyToOne
    private Client client;
@OneToMany (cascade = CascadeType.ALL,mappedBy = "facture")
    private Set<DetailFacture> detailFactures;
}
