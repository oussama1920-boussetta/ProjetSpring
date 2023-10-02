package tn.esprit.springproject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.io.Serializable;
public enum CategorieClient implements Serializable {
    Fidele,Ordinaire,Premium
}
