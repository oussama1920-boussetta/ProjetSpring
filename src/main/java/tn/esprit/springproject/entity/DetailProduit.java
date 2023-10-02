package tn.esprit.springproject.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.sql.Date;


    @Entity
    @Getter
    @Setter
    @EqualsAndHashCode
    @ToString(exclude = {"DetailProduit"})
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    @Table(name = "DetailProduit")
    public class DetailProduit implements Serializable {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY )
        @Column(name = "idDetailProduit")
        @Setter(value = AccessLevel.NONE)
        private long idDetailProduit;
        @Column(name = "dateCreation")
        private Date dateCreation;
        @Column(name = "dateDerniereModification")
        private String dateDerniereModification;
        public enum categorieProduit{
            Electromenager,Quincaillerie,Alimentaire
        }
        @EqualsAndHashCode.Exclude
        @OneToOne(mappedBy = "detailProduit")
        private Produit produit;

    }

