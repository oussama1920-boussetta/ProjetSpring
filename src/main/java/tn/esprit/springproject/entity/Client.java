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
@ToString(exclude = {"idClient"})
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "Client")
public class Client implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idClient")

    @Setter(value = AccessLevel.NONE)

    private long idClient;
    @Column(name = "nom")
    private String nom;
    @Column(name = "prenom")
    private String prenom;
            @Column(name = "dateNaissance")
    private Date dateNaissace;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String passwod;

private CategorieClient categorieClient;
private Profession profession;

@EqualsAndHashCode.Exclude
@OneToMany (cascade = CascadeType.ALL,mappedBy = "client")
    private Set<Facture> factures;
}
