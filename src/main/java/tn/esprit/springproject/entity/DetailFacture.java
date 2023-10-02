package tn.esprit.springproject.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
@Entity
@Getter
@Setter
@EqualsAndHashCode
@ToString(exclude = {"idDetailFacture"})
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "DetailFacture")
public class DetailFacture implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Setter(value = AccessLevel.NONE)
    @Column(name = "idDetailFacture")
    private long idDetailFacture;
    @Column(name = "qte")
    private int qte;
    @Column(name = "prixTotal")
    private float prixTotal;
    @Column(name = "pourcentageRemise")
    private int pourcentageRemise;
    @Column(name = "montantRemise")
    private float montantRemise;


    @EqualsAndHashCode.Exclude
@ManyToOne
    private Facture facture;
@ManyToOne
    private Produit produit;


}
