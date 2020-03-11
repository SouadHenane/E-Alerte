package com.esisba.msalerte.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(exclude = {"lesAlertes"})
public class Citoyen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;

    private String sexe;
    private String Tel;

    @Embedded
    private Adresse adresse;

    @JsonIgnore
    @OneToMany(mappedBy = "citoyen")
    List <Alerte> lesAlertes;


}
