package tn.esprit.springproject.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@ToString(exclude = {"idStock"})
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "stock")

public class Stock implements Serializable
{
@Id
@GeneratedValue(strategy =  GenerationType.IDENTITY)
@Setter(value = AccessLevel.NONE)
@Column(name = "idStock")
    private long idStock;
    @Column(name = "qte")
private int qte;
    @Column(name = "qteMin")
    private int qteMin;
    @Column(name = "libelleStock")
    private String libelleStock;


    @EqualsAndHashCode.Exclude


    @OneToMany (cascade = CascadeType.ALL,mappedBy = "stock")
    private Set<Produit> produits;
}
