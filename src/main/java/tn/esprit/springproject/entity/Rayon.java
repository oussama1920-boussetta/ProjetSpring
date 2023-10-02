package tn.esprit.springproject.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@ToString(exclude = {"idRayon"})
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "rayon")
public class Rayon implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Setter(value = AccessLevel.NONE)
    @Column(name = "idRayon")
    private long idRayon;
    @Column(name = "code")
    private String code;
    @Column(name = "libelle")
    private String libelle;
    @EqualsAndHashCode.Exclude
    @OneToMany (cascade = CascadeType.ALL,mappedBy = "rayon")
    private Set<Produit> produits;
}
