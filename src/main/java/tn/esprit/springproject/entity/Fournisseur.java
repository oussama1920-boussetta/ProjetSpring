package tn.esprit.springproject.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@ToString(exclude = {"Fournisseur"})
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "Fournisseur")
public class Fournisseur implements Serializable {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "idDetailProduit")
    @Setter(value = AccessLevel.NONE)
    private Long idFournisseur;
    @Column(name = "code")
    private String code;
    @Column(name = "libelle")
    private String libelle;
    @EqualsAndHashCode.Exclude
    @ManyToMany (cascade = CascadeType.ALL)
    private Set<Produit> produits;
}
