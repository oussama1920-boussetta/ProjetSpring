package tn.esprit.springproject.entity;


import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@ToString(exclude = {"idProduit"})
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "Produit")
public class Produit implements Serializable
{@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "idProduit")
@Setter(value = AccessLevel.NONE)
private long idProduit;
    @Column(name = "code")
    private String code;
    @Column(name = "libelle")
    private String libelle;
    @Column(name = "prixUnitaire")
    private float prixUnitaire;
    @EqualsAndHashCode.Exclude
    @OneToOne
    private DetailProduit detailProduit;

    @ManyToOne
    private Stock stock;

@OneToMany (cascade = CascadeType.ALL ,mappedBy = "produit")
    private Set<DetailFacture> detailFactures;

@ManyToOne
    private Rayon rayon;
@ManyToMany (cascade = CascadeType.ALL)
    private Set<Fournisseur> fournisseurs;

}
